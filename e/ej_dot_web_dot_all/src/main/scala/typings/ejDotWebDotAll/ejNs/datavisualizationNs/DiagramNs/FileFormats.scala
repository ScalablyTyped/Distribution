package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait BMP extends FileFormats
  
  //Used to export the diagram into JPG format.
  @js.native
  sealed trait JPG extends FileFormats
  
  //Used to export the diagram into PNG format.
  @js.native
  sealed trait PNG extends FileFormats
  
  //Used to export the diagram into SVG format.
  @js.native
  sealed trait SVG extends FileFormats
  
  /* 2 */ val BMP: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.FileFormats.BMP with Double = js.native
  /* 0 */ val JPG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.FileFormats.JPG with Double = js.native
  /* 1 */ val PNG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.FileFormats.PNG with Double = js.native
  /* 3 */ val SVG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.FileFormats.SVG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileFormats with Double] = js.native
}

