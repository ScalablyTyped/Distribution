package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileFormats with Double] = js.native
  /* 2 */ @js.native
  object BMP extends TopLevel[BMP with Double]
  
  /* 0 */ @js.native
  object JPG extends TopLevel[JPG with Double]
  
  /* 1 */ @js.native
  object PNG extends TopLevel[PNG with Double]
  
  /* 3 */ @js.native
  object SVG extends TopLevel[SVG with Double]
  
}

