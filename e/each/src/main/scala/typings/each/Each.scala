package typings.each

import typings.each.eachStrings.both
import typings.each.eachStrings.end
import typings.each.eachStrings.error
import typings.each.eachStrings.item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Each extends StObject {
  
  var done: Double = js.native
  
  def end(): Each = js.native
  
  def files(base: Any, glob: Any): Unit = js.native
  def files(glob: Any): Unit = js.native
  
  def on(eventName: String, onCallback: js.Function): Each = js.native
  @JSName("on")
  def on_both(eventName: both, onBoth: js.Function1[/* error */ js.UndefOr[js.Array[js.Error]], Unit]): Each = js.native
  @JSName("on")
  def on_end(eventName: end, onEnd: js.Function0[Unit]): Each = js.native
  @JSName("on")
  def on_error(
    eventName: error,
    onError: js.Function1[(/* error */ js.Array[js.Error]) | (/* error */ js.Error), Unit]
  ): Each = js.native
  @JSName("on")
  def on_item(
    eventName: item,
    onItem: js.Function2[
      /* item */ Any, 
      /* next */ js.Function1[/* error */ js.UndefOr[js.Error], Unit], 
      Unit
    ]
  ): Each = js.native
  
  def parallel(mode: Boolean): Each = js.native
  def parallel(mode: Double): Each = js.native
  
  var paused: Boolean = js.native
  
  var readable: Boolean = js.native
  
  def repeat(): Each = js.native
  
  def shift(items: js.Array[Any]): Unit = js.native
  
  var started: Double = js.native
  
  def sync(): Each = js.native
  
  def times(): Each = js.native
  
  var total: Double = js.native
  
  def unshift(items: js.Array[Any]): Unit = js.native
  
  def write(items: js.Array[Any]): Unit = js.native
}
