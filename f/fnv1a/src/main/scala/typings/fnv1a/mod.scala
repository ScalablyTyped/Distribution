package typings.fnv1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(s: String): Double = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(s: String, h: Double): Double = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("fnv1a", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fnv1a", "default.BASE")
    @js.native
    def BASE: Double = js.native
    inline def BASE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE")(x.asInstanceOf[js.Any])
  }
}
