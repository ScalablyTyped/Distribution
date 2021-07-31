package typings.googleGax.mod.protobuf

import typings.protobufjs.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "protobuf.BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter ()
  extends typings.protobufjs.mod.BufferWriter
/* static members */
object BufferWriter {
  
  @JSImport("google-gax", "protobuf.BufferWriter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  @scala.inline
  def alloc(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
