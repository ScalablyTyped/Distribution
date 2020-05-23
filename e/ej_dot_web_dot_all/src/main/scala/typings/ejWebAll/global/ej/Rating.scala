package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Rating")
@js.native
class Rating protected ()
  extends typings.ejWebAll.ej.Rating {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Rating.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Rating.Model) = this()
}

/* static members */
@JSGlobal("ej.Rating")
@js.native
object Rating extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.Rating = js.native
  @js.native
  object Precision extends js.Object {
    /* 0 */ val Exact: typings.ejWebAll.ej.Rating.Precision.Exact with Double = js.native
    /* 1 */ val Full: typings.ejWebAll.ej.Rating.Precision.Full with Double = js.native
    /* 2 */ val Half: typings.ejWebAll.ej.Rating.Precision.Half with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Rating.Precision with Double] = js.native
  }
  
}

