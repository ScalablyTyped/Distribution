package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.Field
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPivotGridFieldChooser
  extends StObject
     with Widget[dxPivotGridFieldChooserOptions] {
  
  /**
    * Applies changes made in the UI component to the PivotGrid. Takes effect only if applyChangesMode is &apos;onDemand&apos;.
    */
  def applyChanges(): Unit = js.native
  
  /**
    * Cancels changes made in the UI component without applying them to the PivotGrid. Takes effect only if applyChangesMode is &apos;onDemand&apos;.
    */
  def cancelChanges(): Unit = js.native
  
  /**
    * Gets the PivotGridDataSource instance.
    */
  def getDataSource(): PivotGridDataSource = js.native
  
  /**
    * Updates the UI component to the size of its content.
    */
  def updateDimensions(): Unit = js.native
}
object dxPivotGridFieldChooser {
  
  type ContentReadyEvent = EventInfo[dxPivotGridFieldChooser]
  
  trait ContextMenuPreparingEvent
    extends StObject
       with EventInfo[dxPivotGridFieldChooser] {
    
    val area: js.UndefOr[String] = js.undefined
    
    val event: js.UndefOr[DxEvent[Event]] = js.undefined
    
    val field: js.UndefOr[Field] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ContextMenuPreparingEvent {
    
    inline def apply(component: dxPivotGridFieldChooser, element: DxElement_[HTMLElement]): ContextMenuPreparingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuPreparingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuPreparingEvent] (val x: Self) extends AnyVal {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setEvent(value: DxEvent[Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  type DisposingEvent = EventInfo[dxPivotGridFieldChooser]
  
  type InitializedEvent = InitializedEventInfo[dxPivotGridFieldChooser]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxPivotGridFieldChooser]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(
      component: dxPivotGridFieldChooser,
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxPivotGridFieldChooserOptions
}
