package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait effect extends js.Object

@JSGlobal("ej.Tooltip.effect")
@js.native
object effect extends js.Object {
  ///Fade the Tooltip in and out of visibility.
  @js.native
  sealed trait Fade extends effect
  
  ///No animation takes place when showing/hiding the Tooltip
  @js.native
  sealed trait None extends effect
  
  ///Sliding effect takes place when showing/hiding the Tooltip
  @js.native
  sealed trait Slide extends effect
  
}

