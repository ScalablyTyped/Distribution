package typings.electronNotarize

import typings.electronNotarize.typesMod.NotaryToolStartOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notarytoolMod {
  
  @JSImport("electron-notarize/lib/notarytool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNotaryToolAvailable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotaryToolAvailable")().asInstanceOf[js.Promise[Boolean]]
  
  inline def notarizeAndWaitForNotaryTool(opts: NotaryToolStartOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notarizeAndWaitForNotaryTool")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
