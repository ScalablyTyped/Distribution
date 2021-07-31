package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ChartTitle class.
  */
@JSGlobal("ASPxClientChartTitle")
@js.native
class ASPxClientChartTitle ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTitleBase {
  
  /**
    * Gets the alignment of the title.
    */
  /* CompleteClass */
  var alignment: String = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets a value that specifies to which edges of a parent element the title should be docked.
    */
  /* CompleteClass */
  var dock: String = js.native
  
  /**
    * Gets the lines of text within a title.
    */
  /* CompleteClass */
  var lines: js.Array[String] = js.native
}
