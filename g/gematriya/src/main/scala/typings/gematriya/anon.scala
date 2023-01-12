package typings.gematriya

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Geresh extends StObject {
    
    var geresh: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var punctuate: js.UndefOr[Boolean] = js.undefined
  }
  object Geresh {
    
    inline def apply(): Geresh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Geresh]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Geresh] (val x: Self) extends AnyVal {
      
      inline def setGeresh(value: Boolean): Self = StObject.set(x, "geresh", value.asInstanceOf[js.Any])
      
      inline def setGereshUndefined: Self = StObject.set(x, "geresh", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPunctuate(value: Boolean): Self = StObject.set(x, "punctuate", value.asInstanceOf[js.Any])
      
      inline def setPunctuateUndefined: Self = StObject.set(x, "punctuate", js.undefined)
    }
  }
  
  trait Order extends StObject {
    
    var order: js.UndefOr[Boolean] = js.undefined
  }
  object Order {
    
    inline def apply(): Order = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Order]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
      
      inline def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
