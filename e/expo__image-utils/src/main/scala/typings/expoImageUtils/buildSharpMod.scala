package typings.expoImageUtils

import typings.expoImageUtils.buildSharpDottypesMod.SharpCommandOptions
import typings.expoImageUtils.buildSharpDottypesMod.SharpGlobalOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSharpMod {
  
  @JSImport("@expo/image-utils/build/sharp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSharpInstanceAsync(): js.Promise[Any | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSharpInstanceAsync")().asInstanceOf[js.Promise[Any | Null]]
  
  inline def isAvailableAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailableAsync")().asInstanceOf[js.Promise[Boolean]]
  
  inline def resizeBufferAsync(buffer: Buffer, sizes: js.Array[Double]): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBufferAsync")(buffer.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  inline def sharpAsync(options: SharpGlobalOptions): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sharpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def sharpAsync(options: SharpGlobalOptions, commands: js.Array[SharpCommandOptions]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sharpAsync")(options.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
