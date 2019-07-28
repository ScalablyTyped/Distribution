package typings.easyDashXDashHeaders.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var delimiter: String = js.native
  var sep: String = js.native
  def basename(p: String): String = js.native
  def basename(p: String, ext: String): String = js.native
  def dirname(p: String): String = js.native
  def extname(p: String): String = js.native
  def format(pathObject: ParsedPath): String = js.native
  def isAbsolute(path: String): Boolean = js.native
  def join(paths: (js.Any | String)*): String = js.native
  def normalize(p: String): String = js.native
  def parse(pathString: String): ParsedPath = js.native
  def relative(from: String, to: String): String = js.native
  def resolve(pathSegments: js.Any*): String = js.native
}

