package typings.elasticlunrjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Tf extends StObject {
    
    var tf: js.UndefOr[Double] = js.undefined
  }
  object Tf {
    
    inline def apply(): Tf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tf]
    }
    
    extension [Self <: Tf](x: Self) {
      
      inline def setTf(value: Double): Self = StObject.set(x, "tf", value.asInstanceOf[js.Any])
      
      inline def setTfUndefined: Self = StObject.set(x, "tf", js.undefined)
    }
  }
}
