package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Stretch extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Stretch")
@js.native
object Stretch extends js.Object {
  //The diagram content is resized to fill the destination dimensions. The aspect ratio is not preserved.
  @js.native
  sealed trait Fill extends Stretch
  
  //The diagram content preserves its original size.
  @js.native
  sealed trait None extends Stretch
  
  //The diagram content is resized to fit in the destination dimensions while it preserves its native aspect ratio.
  @js.native
  sealed trait Uniform extends Stretch
  
  //The diagram content is resized to fill the destination dimensions while it preserves its native aspect ratio. If the aspect ratio of the destination rectangle differs from the
  //source, the source content is clipped to fit in the destination dimensions.
  @js.native
  sealed trait UniformToFill extends Stretch
  
  /* 1 */ val Fill: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Stretch.Fill with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Stretch.None with Double = js.native
  /* 2 */ val Uniform: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Stretch.Uniform with Double = js.native
  /* 3 */ val UniformToFill: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.Stretch.UniformToFill with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Stretch with Double] = js.native
}

