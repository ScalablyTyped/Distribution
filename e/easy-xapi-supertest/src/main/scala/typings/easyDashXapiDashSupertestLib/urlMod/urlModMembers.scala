package typings
package easyDashXapiDashSupertestLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", JSImport.Namespace)
@js.native
object urlModMembers extends js.Object {
  def format(url: UrlOptions): java.lang.String = js.native
  def parse(urlStr: java.lang.String): Url = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean): Url = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean, slashesDenoteHost: scala.Boolean): Url = js.native
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
}

