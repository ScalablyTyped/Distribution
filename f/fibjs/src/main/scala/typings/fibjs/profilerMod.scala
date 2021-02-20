package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 内存 profiler 模块
  * @detail 使用方法：,```JavaScript,var profiler = require('profiler');,```
  */
object profilerMod {
  
  @JSImport("profiler", "Edge_ContextVariable")
  @js.native
  val EdgeContextVariable: /* 0 */ Double = js.native
  
  @JSImport("profiler", "Edge_Element")
  @js.native
  val EdgeElement: /* 1 */ Double = js.native
  
  @JSImport("profiler", "Edge_Hidden")
  @js.native
  val EdgeHidden: /* 4 */ Double = js.native
  
  @JSImport("profiler", "Edge_Internal")
  @js.native
  val EdgeInternal: /* 3 */ Double = js.native
  
  @JSImport("profiler", "Edge_Property")
  @js.native
  val EdgeProperty: /* 2 */ Double = js.native
  
  @JSImport("profiler", "Edge_Shortcut")
  @js.native
  val EdgeShortcut: /* 5 */ Double = js.native
  
  @JSImport("profiler", "Edge_Weak")
  @js.native
  val EdgeWeak: /* 6 */ Double = js.native
  
  @JSImport("profiler", "Node_Array")
  @js.native
  val NodeArray: /* 1 */ Double = js.native
  
  @JSImport("profiler", "Node_Closure")
  @js.native
  val NodeClosure: /* 5 */ Double = js.native
  
  @JSImport("profiler", "Node_Code")
  @js.native
  val NodeCode: /* 4 */ Double = js.native
  
  @JSImport("profiler", "Node_ConsString")
  @js.native
  val NodeConsString: /* 10 */ Double = js.native
  
  @JSImport("profiler", "Node_HeapNumber")
  @js.native
  val NodeHeapNumber: /* 7 */ Double = js.native
  
  @JSImport("profiler", "Node_Hidden")
  @js.native
  val NodeHidden: /* 0 */ Double = js.native
  
  @JSImport("profiler", "Node_Native")
  @js.native
  val NodeNative: /* 8 */ Double = js.native
  
  @JSImport("profiler", "Node_Object")
  @js.native
  val NodeObject: /* 3 */ Double = js.native
  
  @JSImport("profiler", "Node_RegExp")
  @js.native
  val NodeRegExp: /* 6 */ Double = js.native
  
  @JSImport("profiler", "Node_SimdValue")
  @js.native
  val NodeSimdValue: /* 13 */ Double = js.native
  
  @JSImport("profiler", "Node_SlicedString")
  @js.native
  val NodeSlicedString: /* 11 */ Double = js.native
  
  @JSImport("profiler", "Node_String")
  @js.native
  val NodeString: /* 2 */ Double = js.native
  
  @JSImport("profiler", "Node_Symbol")
  @js.native
  val NodeSymbol: /* 12 */ Double = js.native
  
  @JSImport("profiler", "Node_Synthetic")
  @js.native
  val NodeSynthetic: /* 9 */ Double = js.native
  
  @JSImport("profiler", "diff")
  @js.native
  def diff(test: js.Function): js.Object = js.native
  
  @JSImport("profiler", "loadSnapshot")
  @js.native
  def loadSnapshot(fname: String): ClassHeapSnapshot = js.native
  
  @JSImport("profiler", "saveSnapshot")
  @js.native
  def saveSnapshot(fname: String): Unit = js.native
  
  @JSImport("profiler", "start")
  @js.native
  def start(fname: String): ClassTimer = js.native
  @JSImport("profiler", "start")
  @js.native
  def start(fname: String, time: js.UndefOr[scala.Nothing], interval: Double): ClassTimer = js.native
  @JSImport("profiler", "start")
  @js.native
  def start(fname: String, time: Double): ClassTimer = js.native
  @JSImport("profiler", "start")
  @js.native
  def start(fname: String, time: Double, interval: Double): ClassTimer = js.native
  
  @JSImport("profiler", "takeSnapshot")
  @js.native
  def takeSnapshot(): ClassHeapSnapshot = js.native
}
