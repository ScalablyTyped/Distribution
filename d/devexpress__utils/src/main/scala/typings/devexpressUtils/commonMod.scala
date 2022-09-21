package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/common", "SequenceComparator")
  @js.native
  open class SequenceComparator[T] protected () extends StObject {
    def this(a: ISequenceComparatorItertor[T], b: ISequenceComparatorItertor[T]) = this()
    
    /* private */ var a: Any = js.native
    
    /* private */ var b: Any = js.native
    
    def calculate(): js.Array[SesElem[T]] = js.native
    
    /* private */ val comparer: Any = js.native
    
    var editDistance: Double | Null = js.native
    
    var lcs: String = js.native
    
    /* private */ var m: Any = js.native
    
    /* private */ var n: Any = js.native
    
    /* private */ val offset: Any = js.native
    
    /* private */ val path: Any = js.native
    
    /* private */ val pathposi: Any = js.native
    
    /* protected */ def recordSeq(epc: js.Array[PathElem]): Unit = js.native
    
    /* private */ val reverse: Any = js.native
    
    var ses: js.Array[SesElem[T]] = js.native
    
    /* protected */ def snake(k: Double, p: Double, pp: Double): Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/common", "SesElem")
  @js.native
  open class SesElem[T] protected () extends StObject {
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
    def apply(value: Double): js.UndefOr[SesType & Double] = js.native
    
    @js.native
    sealed trait Add
      extends StObject
         with SesType
    /* 1 */ val Add: typings.devexpressUtils.commonMod.SesType.Add & Double = js.native
    
    @js.native
    sealed trait Common
      extends StObject
         with SesType
    /* 0 */ val Common: typings.devexpressUtils.commonMod.SesType.Common & Double = js.native
    
    @js.native
    sealed trait Delete
      extends StObject
         with SesType
    /* -1 */ val Delete: typings.devexpressUtils.commonMod.SesType.Delete & Double = js.native
  }
  
  trait ISequenceComparatorItertor[T] extends StObject {
    
    def getByIndex(index: Double): T
    
    def getComparer(): js.Function2[/* a */ T, /* b */ T, Boolean]
    
    var length: Double
  }
  object ISequenceComparatorItertor {
    
    inline def apply[T](
      getByIndex: Double => T,
      getComparer: () => js.Function2[/* a */ T, /* b */ T, Boolean],
      length: Double
    ): ISequenceComparatorItertor[T] = {
      val __obj = js.Dynamic.literal(getByIndex = js.Any.fromFunction1(getByIndex), getComparer = js.Any.fromFunction0(getComparer), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISequenceComparatorItertor[T]]
    }
    
    extension [Self <: ISequenceComparatorItertor[?], T](x: Self & ISequenceComparatorItertor[T]) {
      
      inline def setGetByIndex(value: Double => T): Self = StObject.set(x, "getByIndex", js.Any.fromFunction1(value))
      
      inline def setGetComparer(value: () => js.Function2[/* a */ T, /* b */ T, Boolean]): Self = StObject.set(x, "getComparer", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathElem extends StObject {
    
    var k: Double | Null
    
    var x: Double
    
    var y: Double
  }
  object PathElem {
    
    inline def apply(x: Double, y: Double): PathElem = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], k = null)
      __obj.asInstanceOf[PathElem]
    }
    
    extension [Self <: PathElem](x: Self) {
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setKNull: Self = StObject.set(x, "k", null)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
