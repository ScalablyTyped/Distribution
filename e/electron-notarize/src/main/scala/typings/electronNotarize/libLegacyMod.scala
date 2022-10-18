package typings.electronNotarize

import typings.electronNotarize.libTypesMod.LegacyNotarizeStartOptions
import typings.electronNotarize.libTypesMod.LegacyNotarizeWaitOptions
import typings.electronNotarize.libTypesMod.NotarizeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLegacyMod {
  
  @JSImport("electron-notarize/lib/legacy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startLegacyNotarize(opts: LegacyNotarizeStartOptions): js.Promise[NotarizeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("startLegacyNotarize")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NotarizeResult]]
  
  inline def waitForLegacyNotarize(opts: LegacyNotarizeWaitOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForLegacyNotarize")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
