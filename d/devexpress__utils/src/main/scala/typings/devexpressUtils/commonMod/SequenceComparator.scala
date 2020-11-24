package typings.devexpressUtils.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/sequence-comparison/common", "SequenceComparator")
@js.native
class SequenceComparator[T] protected () extends js.Object {
  def this(a: ISequenceComparatorItertor[T], b: ISequenceComparatorItertor[T]) = this()
  
  var a: js.Any = js.native
  
  var b: js.Any = js.native
  
  def calculate(): js.Array[SesElem[T]] = js.native
  
  val comparer: js.Any = js.native
  
  var editDistance: Double | Null = js.native
  
  var lcs: String = js.native
  
  var m: js.Any = js.native
  
  var n: js.Any = js.native
  
  val offset: js.Any = js.native
  
  val path: js.Any = js.native
  
  val pathposi: js.Any = js.native
  
  /* protected */ def recordSeq(epc: js.Array[PathElem]): Unit = js.native
  
  val reverse: js.Any = js.native
  
  var ses: js.Array[SesElem[T]] = js.native
  
  /* protected */ def snake(k: Double, p: Double, pp: Double): Double = js.native
}
