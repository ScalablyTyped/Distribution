package typings.getenv.getenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "float")
@js.native
object float extends js.Object {
  /**
    * Return as float number.
    */
  def apply(name: String): Double = js.native
  def apply(name: String, fallback: Double): Double = js.native
}

