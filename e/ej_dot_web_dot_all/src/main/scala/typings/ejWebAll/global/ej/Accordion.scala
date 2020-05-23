package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Accordion")
@js.native
class Accordion protected ()
  extends typings.ejWebAll.ej.Accordion {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Accordion.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Accordion.Model) = this()
}

/* static members */
@JSGlobal("ej.Accordion")
@js.native
object Accordion extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.Accordion = js.native
  @js.native
  object HeightAdjustMode extends js.Object {
    /* 1 */ val Auto: typings.ejWebAll.ej.Accordion.HeightAdjustMode.Auto with Double = js.native
    /* 0 */ val Content: typings.ejWebAll.ej.Accordion.HeightAdjustMode.Content with Double = js.native
    /* 2 */ val Fill: typings.ejWebAll.ej.Accordion.HeightAdjustMode.Fill with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Accordion.HeightAdjustMode with Double] = js.native
  }
  
}

