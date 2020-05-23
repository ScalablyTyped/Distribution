package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait Overlay extends Type
  
  @js.native
  sealed trait Slide extends Type
  
}

