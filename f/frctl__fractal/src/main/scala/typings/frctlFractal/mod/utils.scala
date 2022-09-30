package typings.frctlFractal.mod

import typings.frctlFractal.anon.Args
import typings.frctlFractal.anon.Color
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("@frctl/fractal", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultsDeep[T](args: T*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultsDeep")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
  
  inline def escapeForRegexp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeForRegexp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileExistsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(value: Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  inline def isPromise[T](value: PromiseLike[T]): /* is std.PromiseLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<T> */ Boolean]
  
  inline def isPromise_T[T](value: T): /* is std.PromiseLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<T> */ Boolean]
  
  inline def lang(filePath: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("lang")(filePath.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def md5(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeProp(prop: Any, upstream: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeProp")(prop.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseArgv(): Args = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgv")().asInstanceOf[Args]
  
  inline def relUrlPath(toPath: String, fromPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relUrlPath")(toPath.asInstanceOf[js.Any], fromPath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relUrlPath(toPath: String, fromPath: String, opts: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relUrlPath")(toPath.asInstanceOf[js.Any], fromPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def slugify(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slugify")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringify(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(data: Any, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def titlize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titlize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toJSON(item: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(item.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
