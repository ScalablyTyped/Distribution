package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TextAnnotation class.
  */
trait ASPxClientTextAnnotation
  extends StObject
     with ASPxClientWebChartElementNamed {
  
  /**
    * Gets the lines of text within an annotation.
    */
  var lines: js.Array[String]
}
object ASPxClientTextAnnotation {
  
  inline def apply(chart: ASPxClientWebChart, lines: js.Array[String], name: String): ASPxClientTextAnnotation = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTextAnnotation]
  }
  
  extension [Self <: ASPxClientTextAnnotation](x: Self) {
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
  }
}
