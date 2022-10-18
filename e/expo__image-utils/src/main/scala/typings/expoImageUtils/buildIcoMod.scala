package typings.expoImageUtils

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIcoMod {
  
  @JSImport("@expo/image-utils/build/Ico", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateAsync(buffers: js.Array[Buffer]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAsync")(buffers.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
}
