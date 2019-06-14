package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileFormats extends js.Object

@JSGlobal("ej.datavisualization.Diagram.FileFormats")
@js.native
object FileFormats extends js.Object {
  //Used to export the diagram into BMP format.
  @js.native
  sealed trait BMP
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FileFormats
  
  //Used to export the diagram into JPG format.
  @js.native
  sealed trait JPG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FileFormats
  
  //Used to export the diagram into PNG format.
  @js.native
  sealed trait PNG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FileFormats
  
  //Used to export the diagram into SVG format.
  @js.native
  sealed trait SVG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FileFormats
  
  /* 2 */ val BMP: BMP with scala.Double = js.native
  /* 0 */ val JPG: JPG with scala.Double = js.native
  /* 1 */ val PNG: PNG with scala.Double = js.native
  /* 3 */ val SVG: SVG with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FileFormats with scala.Double
  ] = js.native
}

