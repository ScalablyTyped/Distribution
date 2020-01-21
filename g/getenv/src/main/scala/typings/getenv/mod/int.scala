package typings.getenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "int")
@js.native
object int extends js.Object {
  /**
    * Return as integer number.
    */
  def apply(name: String): Double = js.native
  def apply(name: String, fallback: Double): Double = js.native
}

