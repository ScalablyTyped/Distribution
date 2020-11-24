package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.DatePicker")
@js.native
class DatePicker protected ()
  extends typings.ejWebAll.ej.DatePicker {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.DatePicker.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.DatePicker.Model) = this()
}
/* static members */
@JSGlobal("ej.DatePicker")
@js.native
object DatePicker extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.DatePicker = js.native
  
  @js.native
  object Header extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.DatePicker.Header with Double] = js.native
    
    /* 2 */ val Min: typings.ejWebAll.ej.DatePicker.Header.Min with Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.DatePicker.Header.None with Double = js.native
    
    /* 1 */ val Short: typings.ejWebAll.ej.DatePicker.Header.Short with Double = js.native
  }
  
  @js.native
  object HighlightSection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.DatePicker.HighlightSection with Double] = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.DatePicker.HighlightSection.None with Double = js.native
    
    /* 0 */ val Week: typings.ejWebAll.ej.DatePicker.HighlightSection.Week with Double = js.native
    
    /* 1 */ val WorkDays: typings.ejWebAll.ej.DatePicker.HighlightSection.WorkDays with Double = js.native
  }
  
  @js.native
  object Level extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.DatePicker.Level with Double] = js.native
    
    /* 2 */ val Century: typings.ejWebAll.ej.DatePicker.Level.Century with Double = js.native
    
    /* 1 */ val Decade: typings.ejWebAll.ej.DatePicker.Level.Decade with Double = js.native
    
    /* 0 */ val Year: typings.ejWebAll.ej.DatePicker.Level.Year with Double = js.native
  }
}
