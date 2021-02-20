package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief Windows 注册表访问模块
  * @detail 引用方式：,```JavaScript,var registry = require('registry');,var value = registry.get(registry.CLASSES_ROOT, "\node1\node2\value");,```
  */
object registryMod {
  
  @JSImport("registry", "CLASSES_ROOT")
  @js.native
  val CLASSES_ROOT: /* 0 */ Double = js.native
  
  @JSImport("registry", "CURRENT_CONFIG")
  @js.native
  val CURRENT_CONFIG: /* 5 */ Double = js.native
  
  @JSImport("registry", "CURRENT_USER")
  @js.native
  val CURRENT_USER: /* 1 */ Double = js.native
  
  @JSImport("registry", "DWORD")
  @js.native
  val DWORD: /* 4 */ Double = js.native
  
  @JSImport("registry", "EXPAND_SZ")
  @js.native
  val EXPAND_SZ: /* 2 */ Double = js.native
  
  @JSImport("registry", "LOCAL_MACHINE")
  @js.native
  val LOCAL_MACHINE: /* 2 */ Double = js.native
  
  @JSImport("registry", "QWORD")
  @js.native
  val QWORD: /* 11 */ Double = js.native
  
  @JSImport("registry", "SZ")
  @js.native
  val SZ: /* 1 */ Double = js.native
  
  @JSImport("registry", "USERS")
  @js.native
  val USERS: /* 3 */ Double = js.native
  
  @JSImport("registry", "del")
  @js.native
  def del(root: Double, key: String): Unit = js.native
  
  @JSImport("registry", "get")
  @js.native
  def get(root: Double, key: String): js.Any = js.native
  
  @JSImport("registry", "listSubKey")
  @js.native
  def listSubKey(root: Double, key: String): js.Array[_] = js.native
  
  @JSImport("registry", "listValue")
  @js.native
  def listValue(root: Double, key: String): js.Array[_] = js.native
  
  @JSImport("registry", "set")
  @js.native
  def set(root: Double, key: String, value: String): Unit = js.native
  @JSImport("registry", "set")
  @js.native
  def set(root: Double, key: String, value: String, `type`: Double): Unit = js.native
  @JSImport("registry", "set")
  @js.native
  def set(root: Double, key: String, value: js.Array[_]): Unit = js.native
  @JSImport("registry", "set")
  @js.native
  def set(root: Double, key: String, value: Double): Unit = js.native
  @JSImport("registry", "set")
  @js.native
  def set(root: Double, key: String, value: Double, `type`: Double): Unit = js.native
  @JSImport("registry", "set")
  @js.native
  def set(root: Double, key: String, value: ClassBuffer): Unit = js.native
}
