package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureSet extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var currencyFeatureSetPrices: js.UndefOr[
    js.Array[
      /* Information about the price and currency associated with the feature set. Reserved for internal DocuSign use only. */ CurrencyFeatureSetPrice
    ]
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var envelopeFee: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var featureSetId: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var fixedFee: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var is21CFRPart11: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var isActive: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the feature set is actively enabled as part of the plan.
    */
  var isEnabled: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var seatFee: js.UndefOr[String] = js.native
}
object FeatureSet {
  
  @scala.inline
  def apply(): FeatureSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSet]
  }
  
  @scala.inline
  implicit class FeatureSetMutableBuilder[Self <: FeatureSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyFeatureSetPrices(
      value: js.Array[
          /* Information about the price and currency associated with the feature set. Reserved for internal DocuSign use only. */ CurrencyFeatureSetPrice
        ]
    ): Self = StObject.set(x, "currencyFeatureSetPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyFeatureSetPricesUndefined: Self = StObject.set(x, "currencyFeatureSetPrices", js.undefined)
    
    @scala.inline
    def setCurrencyFeatureSetPricesVarargs(
      value: (/* Information about the price and currency associated with the feature set. Reserved for internal DocuSign use only. */ CurrencyFeatureSetPrice)*
    ): Self = StObject.set(x, "currencyFeatureSetPrices", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeFee(value: String): Self = StObject.set(x, "envelopeFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeFeeUndefined: Self = StObject.set(x, "envelopeFee", js.undefined)
    
    @scala.inline
    def setFeatureSetId(value: String): Self = StObject.set(x, "featureSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureSetIdUndefined: Self = StObject.set(x, "featureSetId", js.undefined)
    
    @scala.inline
    def setFixedFee(value: String): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    @scala.inline
    def setIs21CFRPart11(value: String): Self = StObject.set(x, "is21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs21CFRPart11Undefined: Self = StObject.set(x, "is21CFRPart11", js.undefined)
    
    @scala.inline
    def setIsActive(value: String): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: String): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSeatFee(value: String): Self = StObject.set(x, "seatFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeatFeeUndefined: Self = StObject.set(x, "seatFee", js.undefined)
  }
}
