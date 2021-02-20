package typings.frctlFractal.mod

import typings.frctlFractal.anon.Args
import typings.frctlFractal.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("@frctl/fractal", "utils.defaultsDeep")
  @js.native
  def defaultsDeep[T](args: T*): T = js.native
  
  @JSImport("@frctl/fractal", "utils.escapeForRegexp")
  @js.native
  def escapeForRegexp(str: String): String = js.native
  
  @JSImport("@frctl/fractal", "utils.fileExistsSync")
  @js.native
  def fileExistsSync(path: String): Boolean = js.native
  
  @JSImport("@frctl/fractal", "utils.isPromise")
  @js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  @JSImport("@frctl/fractal", "utils.isPromise")
  @js.native
  def isPromise[T](value: T): /* is std.PromiseLike<T> */ Boolean = js.native
  @JSImport("@frctl/fractal", "utils.isPromise")
  @js.native
  def isPromise[T](value: js.Thenable[T]): /* is std.PromiseLike<T> */ Boolean = js.native
  
  @JSImport("@frctl/fractal", "utils.lang")
  @js.native
  def lang(filePath: String): Color = js.native
  
  @JSImport("@frctl/fractal", "utils.md5")
  @js.native
  def md5(str: String): String = js.native
  
  @JSImport("@frctl/fractal", "utils.mergeProp")
  @js.native
  def mergeProp(prop: js.Any, upstream: js.Any): js.Any = js.native
  
  @JSImport("@frctl/fractal", "utils.parseArgv")
  @js.native
  def parseArgv(): Args = js.native
  
  @JSImport("@frctl/fractal", "utils.relUrlPath")
  @js.native
  def relUrlPath(toPath: String, fromPath: String): String = js.native
  @JSImport("@frctl/fractal", "utils.relUrlPath")
  @js.native
  def relUrlPath(toPath: String, fromPath: String, opts: js.Any): String = js.native
  
  @JSImport("@frctl/fractal", "utils.slugify")
  @js.native
  def slugify(str: String): String = js.native
  
  @JSImport("@frctl/fractal", "utils.stringify")
  @js.native
  def stringify(data: js.Any): String = js.native
  @JSImport("@frctl/fractal", "utils.stringify")
  @js.native
  def stringify(data: js.Any, indent: Double): String = js.native
  
  @JSImport("@frctl/fractal", "utils.titlize")
  @js.native
  def titlize(str: String): String = js.native
  
  @JSImport("@frctl/fractal", "utils.toJSON")
  @js.native
  def toJSON(item: js.Any): js.Object = js.native
}
