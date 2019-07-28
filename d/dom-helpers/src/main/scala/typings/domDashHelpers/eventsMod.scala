package typings.domDashHelpers

import typings.std.Element
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  var default: Anon_Filter = js.native
  @JSName("filter")
  var filter_Original: js.Function2[/* selector */ String, /* listener */ EventListener, EventListener] = js.native
  @JSName("listen")
  var listen_Original: js.Function4[
    /* element */ Element, 
    /* type */ String, 
    /* listener */ EventListener, 
    /* capture */ js.UndefOr[Boolean], 
    js.Function0[Unit]
  ] = js.native
  @JSName("off")
  var off_Original: js.Function4[
    /* element */ Element, 
    /* type */ String, 
    /* listener */ EventListener, 
    /* capture */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  @JSName("on")
  var on_Original: js.Function4[
    /* element */ Element, 
    /* type */ String, 
    /* listener */ EventListener, 
    /* capture */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  def filter(selector: String, listener: EventListener): EventListener = js.native
  def listen(element: Element, `type`: String, listener: EventListener): js.Function0[Unit] = js.native
  def listen(element: Element, `type`: String, listener: EventListener, capture: Boolean): js.Function0[Unit] = js.native
  def off(element: Element, `type`: String, listener: EventListener): Unit = js.native
  def off(element: Element, `type`: String, listener: EventListener, capture: Boolean): Unit = js.native
  def on(element: Element, `type`: String, listener: EventListener): Unit = js.native
  def on(element: Element, `type`: String, listener: EventListener, capture: Boolean): Unit = js.native
}

