package typings
package fibjsLib

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
  val Edge_ContextVariable: fibjsLib.fibjsLibNumbers.`0` = js.native
  val Edge_Element: fibjsLib.fibjsLibNumbers.`1` = js.native
  val Edge_Hidden: fibjsLib.fibjsLibNumbers.`4` = js.native
  val Edge_Internal: fibjsLib.fibjsLibNumbers.`3` = js.native
  val Edge_Property: fibjsLib.fibjsLibNumbers.`2` = js.native
  val Edge_Shortcut: fibjsLib.fibjsLibNumbers.`5` = js.native
  val Edge_Weak: fibjsLib.fibjsLibNumbers.`6` = js.native
  val Node_Array: fibjsLib.fibjsLibNumbers.`1` = js.native
  val Node_Closure: fibjsLib.fibjsLibNumbers.`5` = js.native
  val Node_Code: fibjsLib.fibjsLibNumbers.`4` = js.native
  val Node_ConsString: fibjsLib.fibjsLibNumbers.`10` = js.native
  val Node_HeapNumber: fibjsLib.fibjsLibNumbers.`7` = js.native
  val Node_Hidden: fibjsLib.fibjsLibNumbers.`0` = js.native
  val Node_Native: fibjsLib.fibjsLibNumbers.`8` = js.native
  val Node_Object: fibjsLib.fibjsLibNumbers.`3` = js.native
  val Node_RegExp: fibjsLib.fibjsLibNumbers.`6` = js.native
  val Node_SimdValue: fibjsLib.fibjsLibNumbers.`13` = js.native
  val Node_SlicedString: fibjsLib.fibjsLibNumbers.`11` = js.native
  val Node_String: fibjsLib.fibjsLibNumbers.`2` = js.native
  val Node_Symbol: fibjsLib.fibjsLibNumbers.`12` = js.native
  val Node_Synthetic: fibjsLib.fibjsLibNumbers.`9` = js.native
  def diff(test: js.Function): js.Object = js.native
  def loadSnapshot(fname: java.lang.String): fibjsLib.Class_HeapSnapshot = js.native
  def saveSnapshot(fname: java.lang.String): scala.Unit = js.native
  def start(fname: java.lang.String): fibjsLib.Class_Timer = js.native
  def start(fname: java.lang.String, time: scala.Double): fibjsLib.Class_Timer = js.native
  def start(fname: java.lang.String, time: scala.Double, interval: scala.Double): fibjsLib.Class_Timer = js.native
  def takeSnapshot(): fibjsLib.Class_HeapSnapshot = js.native
}

