package typings.googleGax.mod.fallback.protobufMinimal

import typings.protobufjs.mod.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.protobufMinimal.Reader")
@js.native
class Reader protected ()
  extends typings.googleGax.fallbackMod.protobufMinimal.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: Uint8Array) = this()
}
/* static members */
object Reader {
  
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  @JSImport("google-gax", "fallback.protobufMinimal.Reader.create")
  @js.native
  def create(buffer: Buffer | Uint8Array): typings.protobufjs.mod.Reader | typings.protobufjs.mod.BufferReader = js.native
}
