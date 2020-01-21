package typings.envToObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object envToObjectStrings {
  @js.native
  sealed trait boolean extends js.Object
  
  @js.native
  sealed trait integer extends js.Object
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
}

