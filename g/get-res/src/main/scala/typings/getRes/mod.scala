package typings.getRes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get ten most popular screen resolutions
    *
    * @returns An array with the details of ten most popular screen resolutions
    */
  inline def apply(): js.Promise[js.Array[Resolution]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[Resolution]]]
  
  @JSImport("get-res", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Resolution extends StObject {
    
    var item: String
    
    var percent: String
  }
  object Resolution {
    
    inline def apply(item: String, percent: String): Resolution = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resolution]
    }
    
    extension [Self <: Resolution](x: Self) {
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
}
