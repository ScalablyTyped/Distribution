package typings.getenv.mod

import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "array")
@js.native
object array_url extends js.Object {
  def apply(name: String, `type`: typings.getenv.getenvStrings.url): js.Array[UrlWithStringQuery] = js.native
  def apply(name: String, `type`: typings.getenv.getenvStrings.url, fallback: js.Array[UrlWithStringQuery]): js.Array[UrlWithStringQuery] = js.native
}

