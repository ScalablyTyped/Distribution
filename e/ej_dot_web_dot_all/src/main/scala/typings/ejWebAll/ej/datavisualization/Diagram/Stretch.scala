package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
