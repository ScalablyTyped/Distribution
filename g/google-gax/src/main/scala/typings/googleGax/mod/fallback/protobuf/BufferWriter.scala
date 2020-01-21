package typings.googleGax.mod.fallback.protobuf

import typings.protobufjs.mod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter ()
  extends typings.googleGax.fallbackMod.protobuf.BufferWriter

/* static members */
@JSImport("google-gax", "fallback.protobuf.BufferWriter")
@js.native
object BufferWriter extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: Double): Buffer = js.native
}

