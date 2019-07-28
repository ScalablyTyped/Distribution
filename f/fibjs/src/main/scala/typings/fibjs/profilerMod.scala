package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`10`
import typings.fibjs.fibjsNumbers.`11`
import typings.fibjs.fibjsNumbers.`12`
import typings.fibjs.fibjsNumbers.`13`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`5`
import typings.fibjs.fibjsNumbers.`6`
import typings.fibjs.fibjsNumbers.`7`
import typings.fibjs.fibjsNumbers.`8`
import typings.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 内存 profiler 模块
	* @detail 使用方法：,```JavaScript,var profiler = require('profiler');,```
	*/
@JSImport("profiler", JSImport.Namespace)
@js.native
object profilerMod extends js.Object {
  val Edge_ContextVariable: `0` = js.native
  val Edge_Element: `1` = js.native
  val Edge_Hidden: `4` = js.native
  val Edge_Internal: `3` = js.native
  val Edge_Property: `2` = js.native
  val Edge_Shortcut: `5` = js.native
  val Edge_Weak: `6` = js.native
  val Node_Array: `1` = js.native
  val Node_Closure: `5` = js.native
  val Node_Code: `4` = js.native
  val Node_ConsString: `10` = js.native
  val Node_HeapNumber: `7` = js.native
  val Node_Hidden: `0` = js.native
  val Node_Native: `8` = js.native
  val Node_Object: `3` = js.native
  val Node_RegExp: `6` = js.native
  val Node_SimdValue: `13` = js.native
  val Node_SlicedString: `11` = js.native
  val Node_String: `2` = js.native
  val Node_Symbol: `12` = js.native
  val Node_Synthetic: `9` = js.native
  def diff(test: js.Function): js.Object = js.native
  def loadSnapshot(fname: String): Class_HeapSnapshot = js.native
  def saveSnapshot(fname: String): Unit = js.native
  def start(fname: String): Class_Timer = js.native
  def start(fname: String, time: Double): Class_Timer = js.native
  def start(fname: String, time: Double, interval: Double): Class_Timer = js.native
  def takeSnapshot(): Class_HeapSnapshot = js.native
}

