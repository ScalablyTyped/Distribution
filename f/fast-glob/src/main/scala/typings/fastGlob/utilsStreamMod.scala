package typings.fastGlob

import typings.node.streamMod.Readable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsStreamMod {
  
  @JSImport("fast-glob/out/utils/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(streams: js.Array[Readable]): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(streams.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
}
