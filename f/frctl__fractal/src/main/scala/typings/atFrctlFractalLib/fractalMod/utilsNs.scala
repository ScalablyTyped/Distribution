package typings
package atFrctlFractalLib.fractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "utils")
@js.native
object utilsNs extends js.Object {
  def defaultsDeep[T](args: T*): T = js.native
  def escapeForRegexp(str: java.lang.String): java.lang.String = js.native
  def fileExistsSync(path: java.lang.String): scala.Boolean = js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ scala.Boolean = js.native
  def isPromise[T](value: T): /* is std.PromiseLike<T> */ scala.Boolean = js.native
  def isPromise[T](value: js.Thenable[T]): /* is std.PromiseLike<T> */ scala.Boolean = js.native
  def lang(filePath: java.lang.String): atFrctlFractalLib.Anon_Color = js.native
  def md5(str: java.lang.String): java.lang.String = js.native
  def mergeProp(prop: js.Any, upstream: js.Any): js.Any = js.native
  def parseArgv(): atFrctlFractalLib.Anon_Args = js.native
  def relUrlPath(toPath: java.lang.String, fromPath: java.lang.String): java.lang.String = js.native
  def relUrlPath(toPath: java.lang.String, fromPath: java.lang.String, opts: js.Any): java.lang.String = js.native
  def slugify(str: java.lang.String): java.lang.String = js.native
  def stringify(data: js.Any): java.lang.String = js.native
  def stringify(data: js.Any, indent: scala.Double): java.lang.String = js.native
  def titlize(str: java.lang.String): java.lang.String = js.native
  def toJSON(item: js.Any): js.Object = js.native
}

