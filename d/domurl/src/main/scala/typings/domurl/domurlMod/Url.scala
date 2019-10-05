package typings.domurl.domurlMod

import typings.domurl.domurlMod.domurl.QueryString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Url[T] extends js.Object {
  var hash: String = js.native
  var host: String = js.native
  var href: String = js.native
  var pass: String = js.native
  var path: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var query: QueryString[T] = js.native
  var user: String = js.native
  def clearQuery(): Url[js.Object] = js.native
  def decode(s: String): String = js.native
  def encode(s: String): String = js.native
  def isAbsolute(): Boolean = js.native
  def isEmptyQuery(): Boolean = js.native
  def paths(): js.Array[String] = js.native
  def paths(paths: js.Array[String]): js.Array[String] = js.native
  def queryLength(): Double = js.native
}

