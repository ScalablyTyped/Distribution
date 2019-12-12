package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Stretch.Fill
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Stretch.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Stretch.Uniform
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.Stretch.UniformToFill
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Stretch with Double] = js.native
  /* 1 */ @js.native
  object Fill extends TopLevel[Fill with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Uniform extends TopLevel[Uniform with Double]
  
  /* 3 */ @js.native
  object UniformToFill extends TopLevel[UniformToFill with Double]
  
}

