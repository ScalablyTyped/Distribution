package typings.devexpressUtils.sequenceComparisonStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSequenceComparator")
@js.native
class StringSequenceComparator protected () extends js.Object {
  def this(a: String, b: String) = this()
  
  var a: js.Any = js.native
  
  var b: js.Any = js.native
  
  def calculate(): js.Array[StringSesElem] = js.native
  
  var editDistance: Double | Null = js.native
  
  var lcs: String = js.native
  
  var m: js.Any = js.native
  
  var n: js.Any = js.native
  
  val offset: js.Any = js.native
  
  val path: js.Any = js.native
  
  val pathposi: js.Any = js.native
  
  /* protected */ def recordSeq(epc: js.Array[PathElem]): Unit = js.native
  
  val reverse: js.Any = js.native
  
  var ses: js.Array[StringSesElem] = js.native
  
  /* protected */ def snake(k: Double, p: Double, pp: Double): Double = js.native
}
