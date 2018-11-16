package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief Windows 注册表访问模块
	* @detail 引用方式：,```JavaScript,var registry = require('registry');,var value = registry.get(registry.CLASSES_ROOT, "\node1\node2\value");,```
	*/
@JSImport("registry", JSImport.Namespace)
@js.native
object registryMod extends js.Object {
  val CLASSES_ROOT: /* 0 */ scala.Double = js.native
  val CURRENT_CONFIG: /* 5 */ scala.Double = js.native
  val CURRENT_USER: /* 1 */ scala.Double = js.native
  val DWORD: /* 4 */ scala.Double = js.native
  val EXPAND_SZ: /* 2 */ scala.Double = js.native
  val LOCAL_MACHINE: /* 2 */ scala.Double = js.native
  val QWORD: /* 11 */ scala.Double = js.native
  val SZ: /* 1 */ scala.Double = js.native
  val USERS: /* 3 */ scala.Double = js.native
  def del(root: scala.Double, key: java.lang.String): scala.Unit = js.native
  def get(root: scala.Double, key: java.lang.String): js.Any = js.native
  def listSubKey(root: scala.Double, key: java.lang.String): js.Array[_] = js.native
  def listValue(root: scala.Double, key: java.lang.String): js.Array[_] = js.native
  def set(root: scala.Double, key: java.lang.String, value: fibjsLib.Class_Buffer): scala.Unit = js.native
  def set(root: scala.Double, key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(root: scala.Double, key: java.lang.String, value: java.lang.String, `type`: scala.Double): scala.Unit = js.native
  def set(root: scala.Double, key: java.lang.String, value: js.Array[_]): scala.Unit = js.native
  def set(root: scala.Double, key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def set(root: scala.Double, key: java.lang.String, value: scala.Double, `type`: scala.Double): scala.Unit = js.native
}

