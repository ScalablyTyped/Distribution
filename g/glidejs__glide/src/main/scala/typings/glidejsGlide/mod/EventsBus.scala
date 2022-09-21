package typings.glidejsGlide.mod

import typings.glidejsGlide.glidejsGlideStrings.move
import typings.glidejsGlide.glidejsGlideStrings.moveDotafter
import typings.glidejsGlide.glidejsGlideStrings.translateDotjump
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsBus extends StObject {
  
  def emit(event: move | moveDotafter | translateDotjump, context: MoveContext): Unit = js.native
  def emit(event: String): Unit = js.native
  def emit(event: String, context: Record[String, Any]): Unit = js.native
  def emit(event: js.Array[Events | String]): Unit = js.native
  def emit(event: js.Array[String], context: Record[String, Any]): Unit = js.native
  def emit(event: Events): Unit = js.native
  /**
    * Runs registered handlers for specified event.
    */
  def emit(event: RunEvents, context: RunCurrentMovementContext): Unit = js.native
  
  def on(
    event: move | moveDotafter | translateDotjump,
    handler: js.Function1[/* context */ MoveContext, Unit]
  ): Removable = js.native
  def on(event: String, handler: js.Function1[/* context */ Record[String, Any], Unit]): Removable = js.native
  def on(event: js.Array[Events], handler: js.Function0[Unit]): Removable = js.native
  def on(event: js.Array[String], handler: js.Function1[/* context */ Record[String, Any], Unit]): Removable = js.native
  def on(event: Events, handler: js.Function0[Unit]): Removable = js.native
  /**
    * Register callback which will be called at the specified events.
    */
  def on(event: RunEvents, handler: js.Function1[/* context */ RunCurrentMovementContext, Unit]): Removable = js.native
}
