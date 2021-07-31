package typings.facebookPixel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebook {
  
  object Pixel {
    
    trait AddPaymentInfoParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object AddPaymentInfoParameters {
      
      @scala.inline
      def apply(): AddPaymentInfoParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddPaymentInfoParameters]
      }
      
      @scala.inline
      implicit class AddPaymentInfoParametersMutableBuilder[Self <: AddPaymentInfoParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        @scala.inline
        def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        @scala.inline
        def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value :_*))
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait AddToCartParameters extends StObject {
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var content_type: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object AddToCartParameters {
      
      @scala.inline
      def apply(): AddToCartParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddToCartParameters]
      }
      
      @scala.inline
      implicit class AddToCartParametersMutableBuilder[Self <: AddToCartParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        @scala.inline
        def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value :_*))
        
        @scala.inline
        def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        @scala.inline
        def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait AddToWishlistParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object AddToWishlistParameters {
      
      @scala.inline
      def apply(): AddToWishlistParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddToWishlistParameters]
      }
      
      @scala.inline
      implicit class AddToWishlistParametersMutableBuilder[Self <: AddToWishlistParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        @scala.inline
        def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        @scala.inline
        def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value :_*))
        
        @scala.inline
        def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait CompleteRegistrationParameters extends StObject {
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object CompleteRegistrationParameters {
      
      @scala.inline
      def apply(): CompleteRegistrationParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CompleteRegistrationParameters]
      }
      
      @scala.inline
      implicit class CompleteRegistrationParametersMutableBuilder[Self <: CompleteRegistrationParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    // For Facebook Tag API using Dynamic Product Ads
    object DPA {
      
      trait AddToCartParameters
        extends StObject
           with typings.facebookPixel.facebook.Pixel.AddToCartParameters
      object AddToCartParameters {
        
        @scala.inline
        def apply(): typings.facebookPixel.facebook.Pixel.DPA.AddToCartParameters = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.facebookPixel.facebook.Pixel.DPA.AddToCartParameters]
        }
      }
      
      trait PurchaseParameters
        extends StObject
           with typings.facebookPixel.facebook.Pixel.PurchaseParameters
      object PurchaseParameters {
        
        @scala.inline
        def apply(currency: String, value: Double): typings.facebookPixel.facebook.Pixel.DPA.PurchaseParameters = {
          val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.facebookPixel.facebook.Pixel.DPA.PurchaseParameters]
        }
      }
      
      trait ViewContentParameters
        extends StObject
           with typings.facebookPixel.facebook.Pixel.ViewContentParameters
      object ViewContentParameters {
        
        @scala.inline
        def apply(): typings.facebookPixel.facebook.Pixel.DPA.ViewContentParameters = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.facebookPixel.facebook.Pixel.DPA.ViewContentParameters]
        }
      }
    }
    
    @js.native
    trait Event extends StObject {
      
      def apply(eventType: String, InitialAppId: String): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: AddPaymentInfoParameters): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: AddToCartParameters): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: AddToWishlistParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: CompleteRegistrationParameters
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: InitiateCheckoutParameters): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: LeadParameters): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: PurchaseParameters): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: SearchParameters): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: ViewContentParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddPaymentInfoParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddToCartParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddToWishlistParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: CompleteRegistrationParameters): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.AddToCartParameters
      ): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.PurchaseParameters
      ): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.ViewContentParameters
      ): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: InitiateCheckoutParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: LeadParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: PurchaseParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: SearchParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: ViewContentParameters): Unit = js.native
    }
    
    trait InitiateCheckoutParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var num_items: js.UndefOr[Double] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object InitiateCheckoutParameters {
      
      @scala.inline
      def apply(): InitiateCheckoutParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InitiateCheckoutParameters]
      }
      
      @scala.inline
      implicit class InitiateCheckoutParametersMutableBuilder[Self <: InitiateCheckoutParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        @scala.inline
        def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        @scala.inline
        def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value :_*))
        
        @scala.inline
        def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setNum_items(value: Double): Self = StObject.set(x, "num_items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNum_itemsUndefined: Self = StObject.set(x, "num_items", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait LeadParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object LeadParameters {
      
      @scala.inline
      def apply(): LeadParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LeadParameters]
      }
      
      @scala.inline
      implicit class LeadParametersMutableBuilder[Self <: LeadParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        @scala.inline
        def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait PurchaseParameters extends StObject {
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var content_type: js.UndefOr[String] = js.undefined
      
      var currency: String
      
      var num_items: js.UndefOr[Double] = js.undefined
      
      var order_id: js.UndefOr[String] = js.undefined
      
      var value: Double
    }
    object PurchaseParameters {
      
      @scala.inline
      def apply(currency: String, value: Double): PurchaseParameters = {
        val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PurchaseParameters]
      }
      
      @scala.inline
      implicit class PurchaseParametersMutableBuilder[Self <: PurchaseParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        @scala.inline
        def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value :_*))
        
        @scala.inline
        def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        @scala.inline
        def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNum_items(value: Double): Self = StObject.set(x, "num_items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNum_itemsUndefined: Self = StObject.set(x, "num_items", js.undefined)
        
        @scala.inline
        def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait SearchParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var search_string: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object SearchParameters {
      
      @scala.inline
      def apply(): SearchParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchParameters]
      }
      
      @scala.inline
      implicit class SearchParametersMutableBuilder[Self <: SearchParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        @scala.inline
        def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        @scala.inline
        def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value :_*))
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setSearch_string(value: String): Self = StObject.set(x, "search_string", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearch_stringUndefined: Self = StObject.set(x, "search_string", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait ViewContentParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var content_type: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object ViewContentParameters {
      
      @scala.inline
      def apply(): ViewContentParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ViewContentParameters]
      }
      
      @scala.inline
      implicit class ViewContentParametersMutableBuilder[Self <: ViewContentParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        @scala.inline
        def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        @scala.inline
        def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value :_*))
        
        @scala.inline
        def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        @scala.inline
        def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        @scala.inline
        def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
