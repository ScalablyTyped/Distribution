package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ConstantLine class.
  */
trait ASPxClientConstantLine
  extends StObject
     with ASPxClientWebChartElementNamed {
  
  /**
    * Gets the axis that owns the current constant line object.
    */
  var axis: ASPxClientAxis
  
  /**
    * Gets the constant line title.
    */
  var title: String
  
  /**
    * Gets the constant line's position along the axis.
    */
  var value: js.Any
}
object ASPxClientConstantLine {
  
  inline def apply(axis: ASPxClientAxis, chart: ASPxClientWebChart, name: String, title: String, value: js.Any): ASPxClientConstantLine = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientConstantLine]
  }
  
  extension [Self <: ASPxClientConstantLine](x: Self) {
    
    inline def setAxis(value: ASPxClientAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
