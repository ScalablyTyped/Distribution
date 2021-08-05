package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares client constants that specify the task title position.
  */
trait ASPxClientGanttTaskTitlePosition extends StObject {
  
  /**
    * Displays the title inside the task.
    */
  var Inside: Double
  
  /**
    * The title is hidden.
    */
  var None: Double
  
  /**
    * Displays the title outside the task.
    */
  var Outside: Double
}
object ASPxClientGanttTaskTitlePosition {
  
  inline def apply(Inside: Double, None: Double, Outside: Double): ASPxClientGanttTaskTitlePosition = {
    val __obj = js.Dynamic.literal(Inside = Inside.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Outside = Outside.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTaskTitlePosition]
  }
  
  extension [Self <: ASPxClientGanttTaskTitlePosition](x: Self) {
    
    inline def setInside(value: Double): Self = StObject.set(x, "Inside", value.asInstanceOf[js.Any])
    
    inline def setNone(value: Double): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    inline def setOutside(value: Double): Self = StObject.set(x, "Outside", value.asInstanceOf[js.Any])
  }
}
