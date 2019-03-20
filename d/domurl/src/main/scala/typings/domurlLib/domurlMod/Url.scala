package typings
package domurlLib.domurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Url[T] extends js.Object {
  var hash: java.lang.String = js.native
  var host: java.lang.String = js.native
  var href: java.lang.String = js.native
  var pass: java.lang.String = js.native
  var path: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var query: domurlLib.domurlMod.domurlNs.QueryString[T] = js.native
  var user: java.lang.String = js.native
  def clearQuery(): Url[js.Object] = js.native
  def decode(s: java.lang.String): java.lang.String = js.native
  def encode(s: java.lang.String): java.lang.String = js.native
  def isAbsolute(): scala.Boolean = js.native
  def isEmptyQuery(): scala.Boolean = js.native
  def paths(): js.Array[java.lang.String] = js.native
  def paths(paths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def queryLength(): scala.Double = js.native
}

