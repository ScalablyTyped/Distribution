package typings.getenv.mod

import typings.node.urlMod.UrlWithStringQuery
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
  def apply(
    name: String,
    `type`: js.UndefOr[scala.Nothing],
    fallback: js.Array[Boolean | Double | String | UrlWithStringQuery]
  ): js.Array[String] = js.native
}

