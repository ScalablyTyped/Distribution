package typings.devexpressUtils

import typings.devexpressUtils.commonMod.ISequenceComparatorItertor
import typings.devexpressUtils.commonMod.SesType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequenceComparisonStringMod {
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSequenceComparator")
  @js.native
  class StringSequenceComparator protected () extends StObject {
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
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSequenceComparatorItertor")
  @js.native
  class StringSequenceComparatorItertor protected () extends ISequenceComparatorItertor[String] {
    def this(str: String) = this()
    
    var str: String = js.native
  }
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSesElem")
  @js.native
  class StringSesElem protected () extends StObject {
    def this(elem: String, `type`: SesType) = this()
    
    var elem: String = js.native
    
    var `type`: SesType = js.native
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
