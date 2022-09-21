package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 文件路径处理模块
  * @detail 引用方法：,```JavaScript,var path = require('path');,```
  */
object pathMod {
  
  @JSImport("path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def basename(path: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("path", "delimiter")
  @js.native
  val delimiter: String = js.native
  
  inline def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fullpath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fullpath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(ps: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("path", "posix")
  @js.native
  val posix: js.Object = js.native
  
  inline def relative(_from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(_from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolve(ps: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  @JSImport("path", "sep")
  @js.native
  val sep: String = js.native
  
  inline def toNamespacedPath(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toNamespacedPath")().asInstanceOf[Any]
  inline def toNamespacedPath(path: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toNamespacedPath")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("path", "win32")
  @js.native
  val win32: js.Object = js.native
}
