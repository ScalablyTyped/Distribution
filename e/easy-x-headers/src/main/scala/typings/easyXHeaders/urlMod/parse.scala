package typings.easyXHeaders.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "parse")
@js.native
object parse extends js.Object {
  def apply(urlStr: String): Url = js.native
  def apply(urlStr: String, parseQueryString: Boolean): Url = js.native
  def apply(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
}

