package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the base for ASPxClientChartTitle and ASPxClientSeriesTitle classes.
  */
trait ASPxClientTitleBase
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the alignment of the title.
    */
  var alignment: String
  
  /**
    * Gets a value that specifies to which edges of a parent element the title should be docked.
    */
  var dock: String
  
  /**
    * Gets the lines of text within a title.
    */
  var lines: js.Array[String]
}
object ASPxClientTitleBase {
  
  inline def apply(alignment: String, chart: ASPxClientWebChart, dock: String, lines: js.Array[String]): ASPxClientTitleBase = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dock = dock.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTitleBase]
  }
  
  extension [Self <: ASPxClientTitleBase](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setDock(value: String): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}
