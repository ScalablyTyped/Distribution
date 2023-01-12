package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookView extends StObject {
  
  var activeTab: Double
  
  var firstSheet: Double
  
  var height: Double
  
  var visibility: String
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object WorkbookView {
  
  inline def apply(
    activeTab: Double,
    firstSheet: Double,
    height: Double,
    visibility: String,
    width: Double,
    x: Double,
    y: Double
  ): WorkbookView = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], firstSheet = firstSheet.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookView] (val x: Self) extends AnyVal {
    
    inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setFirstSheet(value: Double): Self = StObject.set(x, "firstSheet", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
