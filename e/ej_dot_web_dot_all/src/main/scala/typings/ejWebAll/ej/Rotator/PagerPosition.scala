package typings.ejWebAll.ej.Rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PagerPosition extends js.Object

@JSGlobal("ej.Rotator.PagerPosition")
@js.native
object PagerPosition extends js.Object {
  ///string
  @js.native
  sealed trait BottomLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait BottomRight extends PagerPosition
  
  ///string
  @js.native
  sealed trait Outside extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopCenter extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopRight extends PagerPosition
  
}

