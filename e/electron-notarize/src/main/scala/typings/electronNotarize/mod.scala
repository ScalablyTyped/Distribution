package typings.electronNotarize

import typings.electronNotarize.libTypesMod.LegacyNotarizeCredentials
import typings.electronNotarize.libTypesMod.NotarizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-notarize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notarize(hasAppPathOtherOptions: NotarizeOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notarize")(hasAppPathOtherOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def validateAuthorizationArgs(opts: LegacyNotarizeCredentials): LegacyNotarizeCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAuthorizationArgs")(opts.asInstanceOf[js.Any]).asInstanceOf[LegacyNotarizeCredentials]
}
