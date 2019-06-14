package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Fill
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Stretch
  
  //The diagram content preserves its original size.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Stretch
  
  //The diagram content is resized to fit in the destination dimensions while it preserves its native aspect ratio.
  @js.native
  sealed trait Uniform
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Stretch
  
  //The diagram content is resized to fill the destination dimensions while it preserves its native aspect ratio. If the aspect ratio of the destination rectangle differs from the
  //source, the source content is clipped to fit in the destination dimensions.
  @js.native
  sealed trait UniformToFill
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Stretch
  
  /* 1 */ val Fill: Fill with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Uniform: Uniform with scala.Double = js.native
  /* 3 */ val UniformToFill: UniformToFill with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Stretch with scala.Double] = js.native
}

