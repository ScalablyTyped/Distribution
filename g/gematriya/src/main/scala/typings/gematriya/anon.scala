package typings.gematriya

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Geresh extends StObject {
    
    var geresh: js.UndefOr[Boolean] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var punctuate: js.UndefOr[Boolean] = js.native
  }
  object Geresh {
    
    @scala.inline
    def apply(): Geresh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Geresh]
    }
    
    @scala.inline
    implicit class GereshMutableBuilder[Self <: Geresh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeresh(value: Boolean): Self = StObject.set(x, "geresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGereshUndefined: Self = StObject.set(x, "geresh", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setPunctuate(value: Boolean): Self = StObject.set(x, "punctuate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPunctuateUndefined: Self = StObject.set(x, "punctuate", js.undefined)
    }
  }
  
  @js.native
  trait Order extends StObject {
    
    var order: js.UndefOr[Boolean] = js.native
  }
  object Order {
    
    @scala.inline
    def apply(): Order = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Order]
    }
    
    @scala.inline
    implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
