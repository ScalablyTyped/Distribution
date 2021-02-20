package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 文件路径处理模块
  * @detail 引用方法：,```JavaScript,var path = require('path');,```
  */
object pathMod {
  
  @JSImport("path", "basename")
  @js.native
  def basename(path: String): String = js.native
  @JSImport("path", "basename")
  @js.native
  def basename(path: String, ext: String): String = js.native
  
  @JSImport("path", "delimiter")
  @js.native
  val delimiter: String = js.native
  
  @JSImport("path", "dirname")
  @js.native
  def dirname(path: String): String = js.native
  
  @JSImport("path", "extname")
  @js.native
  def extname(path: String): String = js.native
  
  @JSImport("path", "fullpath")
  @js.native
  def fullpath(path: String): String = js.native
  
  @JSImport("path", "isAbsolute")
  @js.native
  def isAbsolute(path: String): Boolean = js.native
  
  @JSImport("path", "join")
  @js.native
  def join(ps: js.Any*): String = js.native
  
  @JSImport("path", "normalize")
  @js.native
  def normalize(path: String): String = js.native
  
  @JSImport("path", "posix")
  @js.native
  val posix: js.Object = js.native
  
  @JSImport("path", "relative")
  @js.native
  def relative(_from: String, to: String): String = js.native
  
  @JSImport("path", "resolve")
  @js.native
  def resolve(ps: js.Any*): String = js.native
  
  @JSImport("path", "sep")
  @js.native
  val sep: String = js.native
  
  @JSImport("path", "toNamespacedPath")
  @js.native
  def toNamespacedPath(): js.Any = js.native
  @JSImport("path", "toNamespacedPath")
  @js.native
  def toNamespacedPath(path: js.Any): js.Any = js.native
  
  @JSImport("path", "win32")
  @js.native
  val win32: js.Object = js.native
}
