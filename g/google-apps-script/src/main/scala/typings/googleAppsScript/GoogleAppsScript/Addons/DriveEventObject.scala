package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Event object with information on user's Drive and its contents
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#drive_event_object
  */
trait DriveEventObject extends StObject {
  
  var activeCursorItem: DriveItemObject
  
  var selectedItems: js.Array[DriveItemObject]
}
object DriveEventObject {
  
  inline def apply(activeCursorItem: DriveItemObject, selectedItems: js.Array[DriveItemObject]): DriveEventObject = {
    val __obj = js.Dynamic.literal(activeCursorItem = activeCursorItem.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveEventObject]
  }
  
  extension [Self <: DriveEventObject](x: Self) {
    
    inline def setActiveCursorItem(value: DriveItemObject): Self = StObject.set(x, "activeCursorItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: js.Array[DriveItemObject]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: DriveItemObject*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
