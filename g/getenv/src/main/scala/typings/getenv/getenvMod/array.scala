package typings.getenv.getenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "array")
@js.native
object array extends js.Object {
  /**
    * Split value of the environment variable at each comma and return the resulting array
    * where each value has been typecast according to the `type` parameter. An array can be
    * provided as `fallback`.
    */
  def apply(name: String): js.Array[String] = js.native
}

