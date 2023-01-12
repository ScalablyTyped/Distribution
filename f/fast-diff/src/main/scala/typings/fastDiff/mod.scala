package typings.fastDiff

import typings.fastDiff.anon.Index
import typings.fastDiff.fastDiffInts.`-1`
import typings.fastDiff.fastDiffInts.`0`
import typings.fastDiff.fastDiffInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text1: String, text2: String): js.Array[Diff] = (^.asInstanceOf[js.Dynamic].apply(text1.asInstanceOf[js.Any], text2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff]]
  inline def apply(text1: String, text2: String, cursorPos: Double): js.Array[Diff] = (^.asInstanceOf[js.Dynamic].apply(text1.asInstanceOf[js.Any], text2.asInstanceOf[js.Any], cursorPos.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff]]
  inline def apply(text1: String, text2: String, cursorPos: CursorInfo): js.Array[Diff] = (^.asInstanceOf[js.Dynamic].apply(text1.asInstanceOf[js.Any], text2.asInstanceOf[js.Any], cursorPos.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff]]
  
  @JSImport("fast-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fast-diff", "DELETE")
  @js.native
  val DELETE: `-1` = js.native
  
  @JSImport("fast-diff", "EQUAL")
  @js.native
  val EQUAL: `0` = js.native
  
  @JSImport("fast-diff", "INSERT")
  @js.native
  val INSERT: `1` = js.native
  
  trait CursorInfo extends StObject {
    
    var newRange: Index
    
    var oldRange: Index
  }
  object CursorInfo {
    
    inline def apply(newRange: Index, oldRange: Index): CursorInfo = {
      val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CursorInfo] (val x: Self) extends AnyVal {
      
      inline def setNewRange(value: Index): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
      
      inline def setOldRange(value: Index): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    }
  }
  
  type Diff = js.Tuple2[`-1` | `0` | `1`, String]
}
