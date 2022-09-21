package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AxisRange class.
  */
@JSGlobal("ASPxClientAxisRange")
@js.native
open class ASPxClientAxisRange ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAxisRange {
  
  /**
    * Gets the axis that owns the current axis range object.
    */
  /* CompleteClass */
  var axis: typings.devexpressWeb.ASPxClientAxisBase = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the maximum value to display on an axis.
    */
  /* CompleteClass */
  var maxValue: Any = js.native
  
  /**
    * Gets the internal float representation of the range maximum value.
    */
  /* CompleteClass */
  var maxValueInternal: Double = js.native
  
  /**
    * Gets the minimum value to display on an axis.
    */
  /* CompleteClass */
  var minValue: Any = js.native
  
  /**
    * Gets the internal float representation of the range minimum value.
    */
  /* CompleteClass */
  var minValueInternal: Double = js.native
}
