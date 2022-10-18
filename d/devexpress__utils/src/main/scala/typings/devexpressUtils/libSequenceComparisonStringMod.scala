package typings.devexpressUtils

import typings.devexpressUtils.libSequenceComparisonCommonMod.ISequenceComparatorItertor
import typings.devexpressUtils.libSequenceComparisonCommonMod.SesType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSequenceComparisonStringMod {
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSequenceComparator")
  @js.native
  open class StringSequenceComparator protected () extends StObject {
    def this(a: String, b: String) = this()
    
    /* private */ var a: Any = js.native
    
    /* private */ var b: Any = js.native
    
    def calculate(): js.Array[StringSesElem] = js.native
    
    var editDistance: Double | Null = js.native
    
    var lcs: String = js.native
    
    /* private */ var m: Any = js.native
    
    /* private */ var n: Any = js.native
    
    /* private */ val offset: Any = js.native
    
    /* private */ val path: Any = js.native
    
    /* private */ val pathposi: Any = js.native
    
    /* protected */ def recordSeq(epc: js.Array[PathElem]): Unit = js.native
    
    /* private */ val reverse: Any = js.native
    
    var ses: js.Array[StringSesElem] = js.native
    
    /* protected */ def snake(k: Double, p: Double, pp: Double): Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSequenceComparatorItertor")
  @js.native
  open class StringSequenceComparatorItertor protected ()
    extends StObject
       with ISequenceComparatorItertor[String] {
    def this(str: String) = this()
    
    /* CompleteClass */
    override def getByIndex(index: Double): String = js.native
    
    /* CompleteClass */
    override def getComparer(): js.Function2[String, String, Boolean] = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    @JSName("length")
    def length_MStringSequenceComparatorItertor: Double = js.native
    
    var str: String = js.native
  }
  
  @JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSesElem")
  @js.native
  open class StringSesElem protected () extends StObject {
    def this(elem: String, `type`: SesType) = this()
    
    var elem: String = js.native
    
    var `type`: SesType = js.native
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
