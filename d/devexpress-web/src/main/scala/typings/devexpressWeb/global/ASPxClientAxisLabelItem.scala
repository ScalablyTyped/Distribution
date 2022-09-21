package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
@JSGlobal("ASPxClientAxisLabelItem")
@js.native
open class ASPxClientAxisLabelItem ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAxisLabelItem {
  
  /**
    * Gets the axis to which an axis label item belongs.
    */
  /* CompleteClass */
  var axis: typings.devexpressWeb.ASPxClientAxisBase = js.native
  
  /**
    * Gets the axis value to which an axis label item corresponds.
    */
  /* CompleteClass */
  var axisValue: Any = js.native
  
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    */
  /* CompleteClass */
  var axisValueInternal: Double = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the text of an axis label item.
    */
  /* CompleteClass */
  var text: String = js.native
}
