package typings.formDataEncoder

import typings.std.AsyncIterable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@typeUtilGetStreamIteratorMod` {
  
  @JSImport("form-data-encoder/@type/util/getStreamIterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStreamIterator(source: AsyncIterable[js.typedarray.Uint8Array]): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamIterator")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  inline def getStreamIterator(source: ReadableStream[js.typedarray.Uint8Array]): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamIterator")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
}
