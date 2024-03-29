package typings.devtools

import typings.devtools.anon.ElementId
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsTakeElementScreenshotMod {
  
  @JSImport("devtools/build/commands/takeElementScreenshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param1: ElementId): js.Promise[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Buffer]]
}
