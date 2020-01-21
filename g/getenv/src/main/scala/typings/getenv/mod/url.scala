package typings.getenv.mod

import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "url")
@js.native
object url extends js.Object {
  /**
    * Return a parsed URL as per Node's `require("url").parse`. N.B `url` doesn't validate URLs, so be sure it includes a protocol or you'll get deeply weird results.
    */
  def apply(name: String): UrlWithStringQuery = js.native
  def apply(name: String, fallback: UrlWithStringQuery): UrlWithStringQuery = js.native
}

