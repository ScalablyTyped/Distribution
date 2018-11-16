package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 文件路径处理模块
	* @detail 引用方法：,```JavaScript,var path = require('path').posix;,```
	*/
@JSImport("path_posix", JSImport.Namespace)
@js.native
object pathUnderscorePosixMod extends js.Object {
  val delimiter: java.lang.String = js.native
  val posix: js.Object = js.native
  val sep: java.lang.String = js.native
  val win32: js.Object = js.native
  def basename(path: java.lang.String): java.lang.String = js.native
  def basename(path: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def dirname(path: java.lang.String): java.lang.String = js.native
  def extname(path: java.lang.String): java.lang.String = js.native
  def fullpath(path: java.lang.String): java.lang.String = js.native
  def isAbsolute(path: java.lang.String): scala.Boolean = js.native
  def join(ps: js.Any*): java.lang.String = js.native
  def normalize(path: java.lang.String): java.lang.String = js.native
  def relative(_from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  def resolve(ps: js.Any*): java.lang.String = js.native
  def toNamespacedPath(): js.Any = js.native
  def toNamespacedPath(path: js.Any): js.Any = js.native
}

