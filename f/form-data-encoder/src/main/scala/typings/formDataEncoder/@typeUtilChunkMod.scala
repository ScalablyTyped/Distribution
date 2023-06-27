package typings.formDataEncoder

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@typeUtilChunkMod` {
  
  @JSImport("form-data-encoder/@type/util/chunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("form-data-encoder/@type/util/chunk", "MAX_CHUNK_SIZE")
  @js.native
  val MAX_CHUNK_SIZE: /* 65536 */ Double = js.native
  
  inline def chunk(value: js.typedarray.Uint8Array): Generator[js.typedarray.Uint8Array, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(value.asInstanceOf[js.Any]).asInstanceOf[Generator[js.typedarray.Uint8Array, Unit, Any]]
}
