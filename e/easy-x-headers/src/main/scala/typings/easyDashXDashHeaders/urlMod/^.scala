package typings.easyDashXDashHeaders.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(url: UrlOptions): String = js.native
  def parse(urlStr: String): Url = js.native
  def parse(urlStr: String, parseQueryString: Boolean): Url = js.native
  def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
  def resolve(from: String, to: String): String = js.native
}

