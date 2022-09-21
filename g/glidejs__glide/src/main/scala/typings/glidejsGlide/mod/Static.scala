package typings.glidejsGlide.mod

import typings.glidejsGlide.glidejsGlideStrings.move
import typings.glidejsGlide.glidejsGlideStrings.moveDotafter
import typings.glidejsGlide.glidejsGlideStrings.translateDotjump
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  /**
    * A Glide instance is in "uninitialized" mode until a mount() method
    * call. It starts an entire building process.
    */
  def mount(): Properties = js.native
  def mount(components: Record[String, ComponentFunction[Component]]): Properties = js.native
  
  /**
    * Registering Transformers
    */
  def mutate(transformers: js.Array[TransformerFunction]): Static = js.native
  
  def on(
    event: move | moveDotafter | translateDotjump,
    definition: js.Function1[/* context */ MoveContext, Unit]
  ): Static = js.native
  def on(event: String, definition: js.Function1[/* context */ Record[String, Any], Unit]): Static = js.native
  def on(event: js.Array[Events], definition: js.Function0[Unit]): Static = js.native
  def on(event: js.Array[String], definition: js.Function1[/* context */ Record[String, Any], Unit]): Static = js.native
  def on(event: Events, definition: js.Function0[Unit]): Static = js.native
  /**
    * Register callback which will be called at the specified events.
    */
  def on(event: RunEvents, definition: js.Function1[/* context */ RunCurrentMovementContext, Unit]): Static = js.native
}
