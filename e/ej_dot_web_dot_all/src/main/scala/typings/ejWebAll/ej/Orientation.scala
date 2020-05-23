package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("ej.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Horizontal extends Orientation
  
  @js.native
  sealed trait Vertical extends Orientation
  
}

