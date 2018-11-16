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
  
  val BMP: BMP with java.lang.String = js.native
  val JPG: JPG with java.lang.String = js.native
  val PNG: PNG with java.lang.String = js.native
  val SVG: SVG with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.FileFormats with java.lang.String
  ] = js.native
}

