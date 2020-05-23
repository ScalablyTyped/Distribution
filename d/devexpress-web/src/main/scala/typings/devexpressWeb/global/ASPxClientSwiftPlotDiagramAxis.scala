package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SwiftPlotDiagramAxis class.
  */
@JSGlobal("ASPxClientSwiftPlotDiagramAxis")
@js.native
class ASPxClientSwiftPlotDiagramAxis ()
  extends typings.devexpressWeb.ASPxClientAxis2D {
  /**
    * Provides access to an axis title object.
    */
  /* CompleteClass */
  override var axisTitle: typings.devexpressWeb.ASPxClientAxisTitle = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Provides access to the collection of the axis constant lines.
    */
  /* CompleteClass */
  override var constantLines: js.Array[typings.devexpressWeb.ASPxClientConstantLine] = js.native
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  /* CompleteClass */
  override var diagram: typings.devexpressWeb.ASPxClientXYDiagramBase = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Provides acess to the range of the axis coordinates.
    */
  /* CompleteClass */
  override var range: typings.devexpressWeb.ASPxClientAxisRange = js.native
  /**
    * Provides access to the axis strips collection.
    */
  /* CompleteClass */
  override var strips: js.Array[typings.devexpressWeb.ASPxClientStrip] = js.native
}

