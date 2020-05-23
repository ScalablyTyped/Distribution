package typings.fibjs

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
  val CLASSES_ROOT: /* 0 */ Double = js.native
  val CURRENT_CONFIG: /* 5 */ Double = js.native
  val CURRENT_USER: /* 1 */ Double = js.native
  val DWORD: /* 4 */ Double = js.native
  val EXPAND_SZ: /* 2 */ Double = js.native
  val LOCAL_MACHINE: /* 2 */ Double = js.native
  val QWORD: /* 11 */ Double = js.native
  val SZ: /* 1 */ Double = js.native
  val USERS: /* 3 */ Double = js.native
  def del(root: Double, key: String): Unit = js.native
  def get(root: Double, key: String): js.Any = js.native
  def listSubKey(root: Double, key: String): js.Array[_] = js.native
  def listValue(root: Double, key: String): js.Array[_] = js.native
  def set(root: Double, key: String, value: String): Unit = js.native
  def set(root: Double, key: String, value: String, `type`: Double): Unit = js.native
  def set(root: Double, key: String, value: js.Array[_]): Unit = js.native
  def set(root: Double, key: String, value: Double): Unit = js.native
  def set(root: Double, key: String, value: Double, `type`: Double): Unit = js.native
  def set(root: Double, key: String, value: ClassBuffer): Unit = js.native
}

