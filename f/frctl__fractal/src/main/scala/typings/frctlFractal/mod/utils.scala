package typings.frctlFractal.mod

import typings.frctlFractal.AnonArgs
import typings.frctlFractal.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "utils")
@js.native
object utils extends js.Object {
  def defaultsDeep[T](args: T*): T = js.native
  def escapeForRegexp(str: String): String = js.native
  def fileExistsSync(path: String): Boolean = js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  def isPromise[T](value: T): /* is std.PromiseLike<T> */ Boolean = js.native
  def isPromise[T](value: js.Thenable[T]): /* is std.PromiseLike<T> */ Boolean = js.native
  def lang(filePath: String): AnonColor = js.native
  def md5(str: String): String = js.native
  def mergeProp(prop: js.Any, upstream: js.Any): js.Any = js.native
  def parseArgv(): AnonArgs = js.native
  def relUrlPath(toPath: String, fromPath: String): String = js.native
  def relUrlPath(toPath: String, fromPath: String, opts: js.Any): String = js.native
  def slugify(str: String): String = js.native
  def stringify(data: js.Any): String = js.native
  def stringify(data: js.Any, indent: Double): String = js.native
  def titlize(str: String): String = js.native
  def toJSON(item: js.Any): js.Object = js.native
}

