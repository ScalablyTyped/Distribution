package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait Fade extends Animation
  
  @js.native
  sealed trait None extends Animation
  
  @js.native
  sealed trait Slide extends Animation
  
}

