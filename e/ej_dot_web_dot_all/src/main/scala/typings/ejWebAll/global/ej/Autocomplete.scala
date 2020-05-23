package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Autocomplete")
@js.native
class Autocomplete protected ()
  extends typings.ejWebAll.ej.Autocomplete {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Autocomplete.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Autocomplete.Model) = this()
}

/* static members */
@JSGlobal("ej.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.Autocomplete = js.native
  @js.native
  object Animation extends js.Object {
    /* 2 */ val Fade: typings.ejWebAll.ej.Autocomplete.Animation.Fade with Double = js.native
    /* 0 */ val None: typings.ejWebAll.ej.Autocomplete.Animation.None with Double = js.native
    /* 1 */ val Slide: typings.ejWebAll.ej.Autocomplete.Animation.Slide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Autocomplete.Animation with Double] = js.native
  }
  
  @js.native
  object MultiSelectMode extends js.Object {
    /* 0 */ val Delimiter: typings.ejWebAll.ej.Autocomplete.MultiSelectMode.Delimiter with Double = js.native
    /* 1 */ val VisualMode: typings.ejWebAll.ej.Autocomplete.MultiSelectMode.VisualMode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Autocomplete.MultiSelectMode with Double] = js.native
  }
  
  @js.native
  object SortOrder extends js.Object {
    /* 0 */ val Ascending: typings.ejWebAll.ej.Autocomplete.SortOrder.Ascending with Double = js.native
    /* 1 */ val Descending: typings.ejWebAll.ej.Autocomplete.SortOrder.Descending with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Autocomplete.SortOrder with Double] = js.native
  }
  
}

