package typings
package eachLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each extends js.Object {
  var done: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var readable: scala.Boolean = js.native
  var started: scala.Double = js.native
  var total: scala.Double = js.native
  def end(): Each = js.native
  def files(base: js.Any, glob: js.Any): scala.Unit = js.native
  def files(glob: js.Any): scala.Unit = js.native
  def on(eventName: java.lang.String, onCallback: js.Function): Each = js.native
  @JSName("on")
  def on_both(
    eventName: eachLib.eachLibStrings.both,
    onBoth: js.Function1[/* error */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
  ): Each = js.native
  @JSName("on")
  def on_end(eventName: eachLib.eachLibStrings.end, onEnd: js.Function0[scala.Unit]): Each = js.native
  @JSName("on")
  def on_error(
    eventName: eachLib.eachLibStrings.error,
    onError: js.Function1[(/* error */ js.Array[stdLib.Error]) | (/* error */ stdLib.Error), scala.Unit]
  ): Each = js.native
  @JSName("on")
  def on_item(
    eventName: eachLib.eachLibStrings.item,
    onItem: js.Function2[
      /* item */ js.Any, 
      /* next */ js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ): Each = js.native
  def parallel(mode: scala.Boolean): Each = js.native
  def parallel(mode: scala.Double): Each = js.native
  def repeat(): Each = js.native
  def shift(items: js.Array[_]): scala.Unit = js.native
  def sync(): Each = js.native
  def times(): Each = js.native
  def unshift(items: js.Array[_]): scala.Unit = js.native
  def write(items: js.Array[_]): scala.Unit = js.native
}

