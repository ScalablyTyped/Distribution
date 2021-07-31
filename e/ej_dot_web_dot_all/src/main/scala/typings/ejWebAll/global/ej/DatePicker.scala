package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.DatePicker")
@js.native
class DatePicker protected ()
  extends StObject
     with typings.ejWebAll.ej.DatePicker {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object DatePicker {
  
  @JSGlobal("ej.DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.DatePicker.Header")
  @js.native
  object Header extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.DatePicker.Header & Double] = js.native
    
    /* 2 */ val Min: typings.ejWebAll.ej.DatePicker.Header.Min & Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.DatePicker.Header.None & Double = js.native
    
    /* 1 */ val Short: typings.ejWebAll.ej.DatePicker.Header.Short & Double = js.native
  }
  
  @JSGlobal("ej.DatePicker.HighlightSection")
  @js.native
  object HighlightSection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.DatePicker.HighlightSection & Double] = js.native
    
    /* 2 */ val None: typings.ejWebAll.ej.DatePicker.HighlightSection.None & Double = js.native
    
    /* 0 */ val Week: typings.ejWebAll.ej.DatePicker.HighlightSection.Week & Double = js.native
    
    /* 1 */ val WorkDays: typings.ejWebAll.ej.DatePicker.HighlightSection.WorkDays & Double = js.native
  }
  
  @JSGlobal("ej.DatePicker.Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.DatePicker.Level & Double] = js.native
    
    /* 2 */ val Century: typings.ejWebAll.ej.DatePicker.Level.Century & Double = js.native
    
    /* 1 */ val Decade: typings.ejWebAll.ej.DatePicker.Level.Decade & Double = js.native
    
    /* 0 */ val Year: typings.ejWebAll.ej.DatePicker.Level.Year & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.DatePicker.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.DatePicker.fn")
  @js.native
  def fn: typings.ejWebAll.ej.DatePicker = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.DatePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
