package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`11`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`5`
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
  val CLASSES_ROOT: `0` = js.native
  val CURRENT_CONFIG: `5` = js.native
  val CURRENT_USER: `1` = js.native
  val DWORD: `4` = js.native
  val EXPAND_SZ: `2` = js.native
  val LOCAL_MACHINE: `2` = js.native
  val QWORD: `11` = js.native
  val SZ: `1` = js.native
  val USERS: `3` = js.native
  def del(root: Double, key: String): Unit = js.native
  def get(root: Double, key: String): js.Any = js.native
  def listSubKey(root: Double, key: String): js.Array[_] = js.native
  def listValue(root: Double, key: String): js.Array[_] = js.native
  def set(root: Double, key: String, value: String): Unit = js.native
  def set(root: Double, key: String, value: String, `type`: Double): Unit = js.native
  def set(root: Double, key: String, value: js.Array[_]): Unit = js.native
  def set(root: Double, key: String, value: Double): Unit = js.native
  def set(root: Double, key: String, value: Double, `type`: Double): Unit = js.native
  def set(root: Double, key: String, value: Class_Buffer): Unit = js.native
}

