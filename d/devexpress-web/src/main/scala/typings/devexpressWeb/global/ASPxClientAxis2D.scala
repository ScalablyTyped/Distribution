package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Axis2D class.
  */
@JSGlobal("ASPxClientAxis2D")
@js.native
class ASPxClientAxis2D ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAxis2D {
  
  /**
    * Provides access to an axis title object.
    */
  /* CompleteClass */
  var axisTitle: typings.devexpressWeb.ASPxClientAxisTitle = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Provides access to the collection of the axis constant lines.
    */
  /* CompleteClass */
  var constantLines: js.Array[typings.devexpressWeb.ASPxClientConstantLine] = js.native
  
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  /* CompleteClass */
  var diagram: typings.devexpressWeb.ASPxClientXYDiagramBase = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Provides acess to the range of the axis coordinates.
    */
  /* CompleteClass */
  var range: typings.devexpressWeb.ASPxClientAxisRange = js.native
  
  /**
    * Provides access to the axis strips collection.
    */
  /* CompleteClass */
  var strips: js.Array[typings.devexpressWeb.ASPxClientStrip] = js.native
}
