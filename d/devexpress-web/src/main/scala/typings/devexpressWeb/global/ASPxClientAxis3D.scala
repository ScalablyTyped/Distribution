package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Axis3D class.
  */
@JSGlobal("ASPxClientAxis3D")
@js.native
class ASPxClientAxis3D ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAxisBase {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
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
}
