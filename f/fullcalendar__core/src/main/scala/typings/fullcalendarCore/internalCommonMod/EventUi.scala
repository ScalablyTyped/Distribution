package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventUi extends StObject {
  
  var allows: js.Array[AllowFunc]
  
  var backgroundColor: String
  
  var borderColor: String
  
  var classNames: js.Array[String]
  
  var constraints: js.Array[Constraint]
  
  var display: String | Null
  
  var durationEditable: Boolean | Null
  
  var overlap: Boolean | Null
  
  var startEditable: Boolean | Null
  
  var textColor: String
}
object EventUi {
  
  inline def apply(
    allows: js.Array[AllowFunc],
    backgroundColor: String,
    borderColor: String,
    classNames: js.Array[String],
    constraints: js.Array[Constraint],
    textColor: String
  ): EventUi = {
    val __obj = js.Dynamic.literal(allows = allows.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], display = null, durationEditable = null, overlap = null, startEditable = null)
    __obj.asInstanceOf[EventUi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventUi] (val x: Self) extends AnyVal {
    
    inline def setAllows(value: js.Array[AllowFunc]): Self = StObject.set(x, "allows", value.asInstanceOf[js.Any])
    
    inline def setAllowsVarargs(value: AllowFunc*): Self = StObject.set(x, "allows", js.Array(value*))
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value*))
    
    inline def setConstraints(value: js.Array[Constraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: Constraint*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayNull: Self = StObject.set(x, "display", null)
    
    inline def setDurationEditable(value: Boolean): Self = StObject.set(x, "durationEditable", value.asInstanceOf[js.Any])
    
    inline def setDurationEditableNull: Self = StObject.set(x, "durationEditable", null)
    
    inline def setOverlap(value: Boolean): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapNull: Self = StObject.set(x, "overlap", null)
    
    inline def setStartEditable(value: Boolean): Self = StObject.set(x, "startEditable", value.asInstanceOf[js.Any])
    
    inline def setStartEditableNull: Self = StObject.set(x, "startEditable", null)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
