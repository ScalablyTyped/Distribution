package typings.diff3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Given three files, A, O, and B, where both A and B are independently derived from O, returns a fairly complicated internal representation of merge decisions it's taken. */
  inline def apply(a: js.Array[String], o: js.Array[String], b: js.Array[String]): js.Array[DiffResult] = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], o.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiffResult]]
  
  @JSImport("diff3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Conflict extends StObject {
    
    var a: js.Array[String]
    
    var aIndex: Double
    
    var b: js.Array[String]
    
    var bIndex: Double
    
    var o: js.Array[String]
    
    var oIndex: Double
  }
  object Conflict {
    
    inline def apply(
      a: js.Array[String],
      aIndex: Double,
      b: js.Array[String],
      bIndex: Double,
      o: js.Array[String],
      oIndex: Double
    ): Conflict = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], aIndex = aIndex.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], bIndex = bIndex.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], oIndex = oIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conflict]
    }
    
    extension [Self <: Conflict](x: Self) {
      
      inline def setA(value: js.Array[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAIndex(value: Double): Self = StObject.set(x, "aIndex", value.asInstanceOf[js.Any])
      
      inline def setAVarargs(value: String*): Self = StObject.set(x, "a", js.Array(value*))
      
      inline def setB(value: js.Array[String]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBIndex(value: Double): Self = StObject.set(x, "bIndex", value.asInstanceOf[js.Any])
      
      inline def setBVarargs(value: String*): Self = StObject.set(x, "b", js.Array(value*))
      
      inline def setO(value: js.Array[String]): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOIndex(value: Double): Self = StObject.set(x, "oIndex", value.asInstanceOf[js.Any])
      
      inline def setOVarargs(value: String*): Self = StObject.set(x, "o", js.Array(value*))
    }
  }
  
  trait DiffResult extends StObject {
    
    var conflict: js.UndefOr[Conflict] = js.undefined
    
    var ok: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DiffResult {
    
    inline def apply(): DiffResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffResult]
    }
    
    extension [Self <: DiffResult](x: Self) {
      
      inline def setConflict(value: Conflict): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
      
      inline def setConflictUndefined: Self = StObject.set(x, "conflict", js.undefined)
      
      inline def setOk(value: js.Array[String]): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setOkVarargs(value: String*): Self = StObject.set(x, "ok", js.Array(value*))
    }
  }
}
