package typings.googleGax.mod.fallback.protobufMinimal

import typings.protobufjs.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.protobufMinimal.BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
open class BufferWriter ()
  extends typings.googleGax.fallbackMod.protobufMinimal.BufferWriter
/* static members */
object BufferWriter {
  
  @JSImport("google-gax", "fallback.protobufMinimal.BufferWriter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  inline def alloc(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
