package typings.devexpressUtils

import typings.devexpressUtils.typesMod.IEquatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparersMod {
  
  @JSImport("@devexpress/utils/lib/utils/comparers", "Comparers")
  @js.native
  open class Comparers () extends StObject
  /* static members */
  object Comparers {
    
    @JSImport("@devexpress/utils/lib/utils/comparers", "Comparers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def number(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def string(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def stringIgnoreCase(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stringIgnoreCase")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("@devexpress/utils/lib/utils/comparers", "Equals")
  @js.native
  open class Equals () extends StObject
  /* static members */
  object Equals {
    
    @JSImport("@devexpress/utils/lib/utils/comparers", "Equals")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `object`[T /* <: IEquatable[T] */](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def simpleType(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleType")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def simpleType(a: Boolean, b: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleType")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def simpleType(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleType")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
