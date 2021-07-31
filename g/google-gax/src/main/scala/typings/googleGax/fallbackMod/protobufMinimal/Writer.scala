package typings.googleGax.fallbackMod.protobufMinimal

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobufMinimal.Writer")
@js.native
/** Constructs a new writer instance. */
class Writer ()
  extends typings.protobufjs.minimalMod.Writer
/* static members */
object Writer {
  
  @JSImport("google-gax/build/src/fallback", "protobufMinimal.Writer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  @scala.inline
  def alloc(size: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  @scala.inline
  def create(): typings.protobufjs.mod.BufferWriter | typings.protobufjs.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.protobufjs.mod.BufferWriter | typings.protobufjs.mod.Writer]
}
