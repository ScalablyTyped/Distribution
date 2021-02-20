package typings.googleGax.mod.protobuf

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "protobuf.Writer")
@js.native
/** Constructs a new writer instance. */
class Writer ()
  extends typings.protobufjs.mod.Writer
/* static members */
object Writer {
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  @JSImport("google-gax", "protobuf.Writer.alloc")
  @js.native
  def alloc(size: Double): Uint8Array = js.native
  
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  @JSImport("google-gax", "protobuf.Writer.create")
  @js.native
  def create(): typings.protobufjs.mod.BufferWriter | typings.protobufjs.mod.Writer = js.native
}
