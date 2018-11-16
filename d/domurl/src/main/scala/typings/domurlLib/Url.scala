package typings
package domurlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Url")
@js.native
class Url[T] () extends js.Object {
  def this(url: java.lang.String) = this()
  var hash: java.lang.String = js.native
  var host: java.lang.String = js.native
  var href: java.lang.String = js.native
  var pass: java.lang.String = js.native
  var path: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var query: T = js.native
  var user: java.lang.String = js.native
  def clearQuery(): Url[T] = js.native
  def decode(s: java.lang.String): java.lang.String = js.native
  def encode(s: java.lang.String): java.lang.String = js.native
  def isAbsolute(): scala.Boolean = js.native
  def isEmptyQuery(): scala.Boolean = js.native
  def paths(): js.Array[java.lang.String] = js.native
  def paths(paths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def queryLength(): scala.Double = js.native
}

