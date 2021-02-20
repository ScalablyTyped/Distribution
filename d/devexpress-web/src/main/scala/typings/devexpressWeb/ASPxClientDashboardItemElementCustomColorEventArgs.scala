package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemElementCustomColor event.
  */
@js.native
trait ASPxClientDashboardItemElementCustomColorEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the color of the current dashboard item element.
    */
  def GetColor(): String = js.native
  
  /**
    * Gets measures corresponding to the current dashboard item element.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure] = js.native
  
  /**
    * Gets the axis point tuple that corresponds to the current dashboard item element.
    */
  def GetTargetElement(): ASPxClientDashboardItemDataAxisPointTuple = js.native
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  
  /**
    * Sets the color of the current dashboard item element.
    * @param color A String that specifies the color of the current dashboard item element.
    */
  def SetColor(color: String): Unit = js.native
}
object ASPxClientDashboardItemElementCustomColorEventArgs {
  
  @scala.inline
  def apply(
    GetColor: () => String,
    GetMeasures: () => js.Array[ASPxClientDashboardItemDataMeasure],
    GetTargetElement: () => ASPxClientDashboardItemDataAxisPointTuple,
    ItemName: String,
    SetColor: String => Unit
  ): ASPxClientDashboardItemElementCustomColorEventArgs = {
    val __obj = js.Dynamic.literal(GetColor = js.Any.fromFunction0(GetColor), GetMeasures = js.Any.fromFunction0(GetMeasures), GetTargetElement = js.Any.fromFunction0(GetTargetElement), ItemName = ItemName.asInstanceOf[js.Any], SetColor = js.Any.fromFunction1(SetColor))
    __obj.asInstanceOf[ASPxClientDashboardItemElementCustomColorEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemElementCustomColorEventArgsMutableBuilder[Self <: ASPxClientDashboardItemElementCustomColorEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetColor(value: () => String): Self = StObject.set(x, "GetColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMeasures(value: () => js.Array[ASPxClientDashboardItemDataMeasure]): Self = StObject.set(x, "GetMeasures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetElement(value: () => ASPxClientDashboardItemDataAxisPointTuple): Self = StObject.set(x, "GetTargetElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetColor(value: String => Unit): Self = StObject.set(x, "SetColor", js.Any.fromFunction1(value))
  }
}
