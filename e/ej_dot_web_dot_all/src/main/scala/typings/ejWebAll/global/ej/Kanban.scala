package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Kanban")
@js.native
class Kanban protected ()
  extends typings.ejWebAll.ej.Kanban {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Kanban {
  
  @JSGlobal("ej.Kanban")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Kanban.EditMode")
  @js.native
  object EditMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Kanban.EditMode with Double] = js.native
    
    /* 0 */ val Dialog: typings.ejWebAll.ej.Kanban.EditMode.Dialog with Double = js.native
    
    /* 1 */ val DialogTemplate: typings.ejWebAll.ej.Kanban.EditMode.DialogTemplate with Double = js.native
    
    /* 2 */ val ExternalForm: typings.ejWebAll.ej.Kanban.EditMode.ExternalForm with Double = js.native
    
    /* 3 */ val ExternalFormTemplate: typings.ejWebAll.ej.Kanban.EditMode.ExternalFormTemplate with Double = js.native
  }
  
  @JSGlobal("ej.Kanban.EditingType")
  @js.native
  object EditingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Kanban.EditingType with Double] = js.native
    
    /* 3 */ val DatePicker: typings.ejWebAll.ej.Kanban.EditingType.DatePicker with Double = js.native
    
    /* 4 */ val DateTimePicker: typings.ejWebAll.ej.Kanban.EditingType.DateTimePicker with Double = js.native
    
    /* 2 */ val Dropdown: typings.ejWebAll.ej.Kanban.EditingType.Dropdown with Double = js.native
    
    /* 1 */ val Numeric: typings.ejWebAll.ej.Kanban.EditingType.Numeric with Double = js.native
    
    /* 6 */ val RTE: typings.ejWebAll.ej.Kanban.EditingType.RTE with Double = js.native
    
    /* 0 */ val String: typings.ejWebAll.ej.Kanban.EditingType.String with Double = js.native
    
    /* 5 */ val TextArea: typings.ejWebAll.ej.Kanban.EditingType.TextArea with Double = js.native
  }
  
  @JSGlobal("ej.Kanban.FormPosition")
  @js.native
  object FormPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Kanban.FormPosition with Double] = js.native
    
    /* 0 */ val Bottom: typings.ejWebAll.ej.Kanban.FormPosition.Bottom with Double = js.native
    
    /* 1 */ val Right: typings.ejWebAll.ej.Kanban.FormPosition.Right with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Kanban.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Kanban.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Kanban.SelectionType with Double] = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.Kanban.SelectionType.Multiple with Double = js.native
    
    /* 0 */ val Single: typings.ejWebAll.ej.Kanban.SelectionType.Single with Double = js.native
  }
  
  @JSGlobal("ej.Kanban.Target")
  @js.native
  object Target extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Kanban.Target with Double] = js.native
    
    /* 3 */ val All: typings.ejWebAll.ej.Kanban.Target.All with Double = js.native
    
    /* 2 */ val Card: typings.ejWebAll.ej.Kanban.Target.Card with Double = js.native
    
    /* 1 */ val Content: typings.ejWebAll.ej.Kanban.Target.Content with Double = js.native
    
    /* 0 */ val Header: typings.ejWebAll.ej.Kanban.Target.Header with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Kanban.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Kanban = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Kanban): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
