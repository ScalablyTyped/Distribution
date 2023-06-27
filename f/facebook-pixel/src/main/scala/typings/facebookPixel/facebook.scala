package typings.facebookPixel

import typings.facebookPixel.anon.Id
import typings.std.Record
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
      
      inline def apply(): AddPaymentInfoParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddPaymentInfoParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddPaymentInfoParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        inline def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        inline def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        inline def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        inline def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value*))
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
      
      inline def apply(): AddToCartParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddToCartParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddToCartParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        inline def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        inline def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value*))
        
        inline def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        inline def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
      
      inline def apply(): AddToWishlistParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddToWishlistParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddToWishlistParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        inline def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        inline def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        inline def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        inline def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value*))
        
        inline def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        inline def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait CompleteRegistrationParameters extends StObject {
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[Boolean] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object CompleteRegistrationParameters {
      
      inline def apply(): CompleteRegistrationParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CompleteRegistrationParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CompleteRegistrationParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        inline def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    type CustomParameters = Record[String, Any]
    
    // For Facebook Tag API using Dynamic Product Ads
    object DPA {
      
      trait AddToCartParameters
        extends StObject
           with typings.facebookPixel.facebook.Pixel.AddToCartParameters
      object AddToCartParameters {
        
        inline def apply(): typings.facebookPixel.facebook.Pixel.DPA.AddToCartParameters = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.facebookPixel.facebook.Pixel.DPA.AddToCartParameters]
        }
      }
      
      trait PurchaseParameters
        extends StObject
           with typings.facebookPixel.facebook.Pixel.PurchaseParameters
      object PurchaseParameters {
        
        inline def apply(currency: String, value: Double): typings.facebookPixel.facebook.Pixel.DPA.PurchaseParameters = {
          val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.facebookPixel.facebook.Pixel.DPA.PurchaseParameters]
        }
      }
      
      trait ViewContentParameters
        extends StObject
           with typings.facebookPixel.facebook.Pixel.ViewContentParameters
      object ViewContentParameters {
        
        inline def apply(): typings.facebookPixel.facebook.Pixel.DPA.ViewContentParameters = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.facebookPixel.facebook.Pixel.DPA.ViewContentParameters]
        }
      }
    }
    
    @js.native
    trait Event extends StObject {
      
      def apply(eventType: String, InitialAppId: String): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: AddPaymentInfoParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: AddPaymentInfoParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: AddToCartParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: AddToCartParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: AddToWishlistParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: AddToWishlistParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: CompleteRegistrationParameters
      ): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: CompleteRegistrationParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: CustomParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: CustomParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: InitiateCheckoutParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: InitiateCheckoutParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: LeadParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: LeadParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: PurchaseParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: PurchaseParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: SearchParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: SearchParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, InitialAppId: String, eventName: String, parameters: ViewContentParameters): Unit = js.native
      def apply(
        eventType: String,
        InitialAppId: String,
        eventName: String,
        parameters: ViewContentParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddPaymentInfoParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddPaymentInfoParameters, option: EventIDOptions): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddToCartParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddToCartParameters, option: EventIDOptions): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddToWishlistParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: AddToWishlistParameters, option: EventIDOptions): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: CompleteRegistrationParameters): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: CompleteRegistrationParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: CustomParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: CustomParameters, option: EventIDOptions): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.AddToCartParameters
      ): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.AddToCartParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.PurchaseParameters
      ): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.PurchaseParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.ViewContentParameters
      ): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: typings.facebookPixel.facebook.Pixel.DPA.ViewContentParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: InitiateCheckoutParameters): Unit = js.native
      def apply(
        eventType: String,
        eventName: String,
        parameters: InitiateCheckoutParameters,
        option: EventIDOptions
      ): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: LeadParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: LeadParameters, option: EventIDOptions): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: PurchaseParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: PurchaseParameters, option: EventIDOptions): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: SearchParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: SearchParameters, option: EventIDOptions): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: ViewContentParameters): Unit = js.native
      def apply(eventType: String, eventName: String, parameters: ViewContentParameters, option: EventIDOptions): Unit = js.native
    }
    
    trait EventIDOptions extends StObject {
      
      var eventID: String
    }
    object EventIDOptions {
      
      inline def apply(eventID: String): EventIDOptions = {
        val __obj = js.Dynamic.literal(eventID = eventID.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventIDOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EventIDOptions] (val x: Self) extends AnyVal {
        
        inline def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      }
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
      
      inline def apply(): InitiateCheckoutParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InitiateCheckoutParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InitiateCheckoutParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        inline def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        inline def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        inline def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        inline def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value*))
        
        inline def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        inline def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setNum_items(value: Double): Self = StObject.set(x, "num_items", value.asInstanceOf[js.Any])
        
        inline def setNum_itemsUndefined: Self = StObject.set(x, "num_items", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait LeadParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object LeadParameters {
      
      inline def apply(): LeadParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LeadParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: LeadParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        inline def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        inline def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        inline def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
      
      inline def apply(currency: String, value: Double): PurchaseParameters = {
        val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PurchaseParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PurchaseParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        inline def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        inline def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value*))
        
        inline def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        inline def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setNum_items(value: Double): Self = StObject.set(x, "num_items", value.asInstanceOf[js.Any])
        
        inline def setNum_itemsUndefined: Self = StObject.set(x, "num_items", js.undefined)
        
        inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
        
        inline def setOrder_idUndefined: Self = StObject.set(x, "order_id", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
      
      inline def apply(): SearchParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SearchParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        inline def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        inline def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        inline def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        inline def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value*))
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setSearch_string(value: String): Self = StObject.set(x, "search_string", value.asInstanceOf[js.Any])
        
        inline def setSearch_stringUndefined: Self = StObject.set(x, "search_string", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait ViewContentParameters extends StObject {
      
      var content_category: js.UndefOr[String] = js.undefined
      
      var content_ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var content_name: js.UndefOr[String] = js.undefined
      
      var content_type: js.UndefOr[String] = js.undefined
      
      var contents: js.UndefOr[js.Array[Id]] = js.undefined
      
      var currency: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double] = js.undefined
    }
    object ViewContentParameters {
      
      inline def apply(): ViewContentParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ViewContentParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ViewContentParameters] (val x: Self) extends AnyVal {
        
        inline def setContent_category(value: String): Self = StObject.set(x, "content_category", value.asInstanceOf[js.Any])
        
        inline def setContent_categoryUndefined: Self = StObject.set(x, "content_category", js.undefined)
        
        inline def setContent_ids(value: js.Array[String]): Self = StObject.set(x, "content_ids", value.asInstanceOf[js.Any])
        
        inline def setContent_idsUndefined: Self = StObject.set(x, "content_ids", js.undefined)
        
        inline def setContent_idsVarargs(value: String*): Self = StObject.set(x, "content_ids", js.Array(value*))
        
        inline def setContent_name(value: String): Self = StObject.set(x, "content_name", value.asInstanceOf[js.Any])
        
        inline def setContent_nameUndefined: Self = StObject.set(x, "content_name", js.undefined)
        
        inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        inline def setContents(value: js.Array[Id]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
        
        inline def setContentsVarargs(value: Id*): Self = StObject.set(x, "contents", js.Array(value*))
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
