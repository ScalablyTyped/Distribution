package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait headerOption extends js.Object

@JSGlobal("ej.headerOption")
@js.native
object headerOption extends js.Object {
  @js.native
  sealed trait row extends headerOption
  
  @js.native
  sealed trait tHead extends headerOption
  
}

