package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/common", "SequenceComparator")
  @js.native
  class SequenceComparator[T] protected () extends StObject {
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
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/common", "SesElem")
  @js.native
  class SesElem[T] protected () extends StObject {
    def this(elem: T, `type`: SesType) = this()
    
    var elem: T = js.native
    
    var `type`: SesType = js.native
  }
  
  @js.native
  sealed trait SesType extends StObject
  @JSImport("@devexpress/utils/lib/sequence-comparison/common", "SesType")
  @js.native
  object SesType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SesType with Double] = js.native
    
    @js.native
    sealed trait Add extends SesType
    /* 1 */ val Add: typings.devexpressUtils.commonMod.SesType.Add with Double = js.native
    
    @js.native
    sealed trait Common extends SesType
    /* 0 */ val Common: typings.devexpressUtils.commonMod.SesType.Common with Double = js.native
    
    @js.native
    sealed trait Delete extends SesType
    /* -1 */ val Delete: typings.devexpressUtils.commonMod.SesType.Delete with Double = js.native
  }
  
  @js.native
  trait ISequenceComparatorItertor[T] extends StObject {
    
    def getByIndex(index: Double): T = js.native
    
    def getComparer(): js.Function2[/* a */ T, /* b */ T, Boolean] = js.native
    
    var length: Double = js.native
  }
  object ISequenceComparatorItertor {
    
    @scala.inline
    def apply[T](
      getByIndex: Double => T,
      getComparer: () => js.Function2[/* a */ T, /* b */ T, Boolean],
      length: Double
    ): ISequenceComparatorItertor[T] = {
      val __obj = js.Dynamic.literal(getByIndex = js.Any.fromFunction1(getByIndex), getComparer = js.Any.fromFunction0(getComparer), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISequenceComparatorItertor[T]]
    }
    
    @scala.inline
    implicit class ISequenceComparatorItertorMutableBuilder[Self <: ISequenceComparatorItertor[_], T] (val x: Self with ISequenceComparatorItertor[T]) extends AnyVal {
      
      @scala.inline
      def setGetByIndex(value: Double => T): Self = StObject.set(x, "getByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetComparer(value: () => js.Function2[/* a */ T, /* b */ T, Boolean]): Self = StObject.set(x, "getComparer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PathElem extends StObject {
    
    var k: Double | Null = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object PathElem {
    
    @scala.inline
    def apply(x: Double, y: Double): PathElem = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathElem]
    }
    
    @scala.inline
    implicit class PathElemMutableBuilder[Self <: PathElem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKNull: Self = StObject.set(x, "k", null)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
