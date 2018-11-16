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
  val Edge_ContextVariable: /* 0 */ scala.Double = js.native
  val Edge_Element: /* 1 */ scala.Double = js.native
  val Edge_Hidden: /* 4 */ scala.Double = js.native
  val Edge_Internal: /* 3 */ scala.Double = js.native
  val Edge_Property: /* 2 */ scala.Double = js.native
  val Edge_Shortcut: /* 5 */ scala.Double = js.native
  val Edge_Weak: /* 6 */ scala.Double = js.native
  val Node_Array: /* 1 */ scala.Double = js.native
  val Node_Closure: /* 5 */ scala.Double = js.native
  val Node_Code: /* 4 */ scala.Double = js.native
  val Node_ConsString: /* 10 */ scala.Double = js.native
  val Node_HeapNumber: /* 7 */ scala.Double = js.native
  val Node_Hidden: /* 0 */ scala.Double = js.native
  val Node_Native: /* 8 */ scala.Double = js.native
  val Node_Object: /* 3 */ scala.Double = js.native
  val Node_RegExp: /* 6 */ scala.Double = js.native
  val Node_SimdValue: /* 13 */ scala.Double = js.native
  val Node_SlicedString: /* 11 */ scala.Double = js.native
  val Node_String: /* 2 */ scala.Double = js.native
  val Node_Symbol: /* 12 */ scala.Double = js.native
  val Node_Synthetic: /* 9 */ scala.Double = js.native
  def diff(test: js.Function): js.Object = js.native
  def loadSnapshot(fname: java.lang.String): fibjsLib.Class_HeapSnapshot = js.native
  def saveSnapshot(fname: java.lang.String): scala.Unit = js.native
  def start(fname: java.lang.String): fibjsLib.Class_Timer = js.native
  def start(fname: java.lang.String, time: scala.Double): fibjsLib.Class_Timer = js.native
  def start(fname: java.lang.String, time: scala.Double, interval: scala.Double): fibjsLib.Class_Timer = js.native
  def takeSnapshot(): fibjsLib.Class_HeapSnapshot = js.native
}

