package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Autocomplete")
@js.native
class Autocomplete protected ()
  extends typings.ejWebAll.ej.Autocomplete {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Autocomplete {
  
  @JSGlobal("ej.Autocomplete")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Autocomplete.Animation")
  @js.native
  object Animation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Autocomplete.Animation with Double] = js.native
    
    /* 2 */ val Fade: typings.ejWebAll.ej.Autocomplete.Animation.Fade with Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.Autocomplete.Animation.None with Double = js.native
    
    /* 1 */ val Slide: typings.ejWebAll.ej.Autocomplete.Animation.Slide with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Autocomplete.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Autocomplete.MultiSelectMode")
  @js.native
  object MultiSelectMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Autocomplete.MultiSelectMode with Double] = js.native
    
    /* 0 */ val Delimiter: typings.ejWebAll.ej.Autocomplete.MultiSelectMode.Delimiter with Double = js.native
    
    /* 1 */ val VisualMode: typings.ejWebAll.ej.Autocomplete.MultiSelectMode.VisualMode with Double = js.native
  }
  
  @JSGlobal("ej.Autocomplete.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Autocomplete.SortOrder with Double] = js.native
    
    /* 0 */ val Ascending: typings.ejWebAll.ej.Autocomplete.SortOrder.Ascending with Double = js.native
    
    /* 1 */ val Descending: typings.ejWebAll.ej.Autocomplete.SortOrder.Descending with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Autocomplete.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Autocomplete = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Autocomplete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
