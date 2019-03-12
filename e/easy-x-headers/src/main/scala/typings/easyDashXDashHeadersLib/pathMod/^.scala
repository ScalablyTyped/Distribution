package typings
package easyDashXDashHeadersLib.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var delimiter: java.lang.String = js.native
  var sep: java.lang.String = js.native
  def basename(p: java.lang.String): java.lang.String = js.native
  def basename(p: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def dirname(p: java.lang.String): java.lang.String = js.native
  def extname(p: java.lang.String): java.lang.String = js.native
  def format(pathObject: ParsedPath): java.lang.String = js.native
  def isAbsolute(path: java.lang.String): scala.Boolean = js.native
  def join(paths: (js.Any | java.lang.String)*): java.lang.String = js.native
  def normalize(p: java.lang.String): java.lang.String = js.native
  def parse(pathString: java.lang.String): ParsedPath = js.native
  def relative(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  def resolve(pathSegments: js.Any*): java.lang.String = js.native
}

