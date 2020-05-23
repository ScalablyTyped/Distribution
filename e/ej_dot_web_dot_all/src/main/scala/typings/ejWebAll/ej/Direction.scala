package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Left extends Direction
  
  //string
  @js.native
  sealed trait None extends Direction
  
  //string
  @js.native
  sealed trait Right extends Direction
  
}

