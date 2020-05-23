package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

