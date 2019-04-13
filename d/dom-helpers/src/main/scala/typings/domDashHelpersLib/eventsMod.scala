package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  var default: domDashHelpersLib.Anon_Filter = js.native
  @JSName("filter")
  var filter_Original: js.Function2[
    /* selector */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    stdLib.EventListener
  ] = js.native
  @JSName("listen")
  var listen_Original: js.Function4[
    /* element */ stdLib.Element, 
    /* type */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    /* capture */ js.UndefOr[scala.Boolean], 
    js.Function0[scala.Unit]
  ] = js.native
  @JSName("off")
  var off_Original: js.Function4[
    /* element */ stdLib.Element, 
    /* type */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    /* capture */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  @JSName("on")
  var on_Original: js.Function4[
    /* element */ stdLib.Element, 
    /* type */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    /* capture */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  def filter(selector: java.lang.String, listener: stdLib.EventListener): stdLib.EventListener = js.native
  def listen(element: stdLib.Element, `type`: java.lang.String, listener: stdLib.EventListener): js.Function0[scala.Unit] = js.native
  def listen(
    element: stdLib.Element,
    `type`: java.lang.String,
    listener: stdLib.EventListener,
    capture: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  def off(element: stdLib.Element, `type`: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def off(
    element: stdLib.Element,
    `type`: java.lang.String,
    listener: stdLib.EventListener,
    capture: scala.Boolean
  ): scala.Unit = js.native
  def on(element: stdLib.Element, `type`: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def on(
    element: stdLib.Element,
    `type`: java.lang.String,
    listener: stdLib.EventListener,
    capture: scala.Boolean
  ): scala.Unit = js.native
}

