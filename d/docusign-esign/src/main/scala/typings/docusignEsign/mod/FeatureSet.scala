package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureSet extends js.Object {
  
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
  implicit class FeatureSetOps[Self <: FeatureSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrencyFeatureSetPricesVarargs(
      value: (/* Information about the price and currency associated with the feature set. Reserved for internal DocuSign use only. */ CurrencyFeatureSetPrice)*
    ): Self = this.set("currencyFeatureSetPrices", js.Array(value :_*))
    
    @scala.inline
    def setCurrencyFeatureSetPrices(
      value: js.Array[
          /* Information about the price and currency associated with the feature set. Reserved for internal DocuSign use only. */ CurrencyFeatureSetPrice
        ]
    ): Self = this.set("currencyFeatureSetPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyFeatureSetPrices: Self = this.set("currencyFeatureSetPrices", js.undefined)
    
    @scala.inline
    def setEnvelopeFee(value: String): Self = this.set("envelopeFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeFee: Self = this.set("envelopeFee", js.undefined)
    
    @scala.inline
    def setFeatureSetId(value: String): Self = this.set("featureSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureSetId: Self = this.set("featureSetId", js.undefined)
    
    @scala.inline
    def setFixedFee(value: String): Self = this.set("fixedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedFee: Self = this.set("fixedFee", js.undefined)
    
    @scala.inline
    def setIs21CFRPart11(value: String): Self = this.set("is21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs21CFRPart11: Self = this.set("is21CFRPart11", js.undefined)
    
    @scala.inline
    def setIsActive(value: String): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: String): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSeatFee(value: String): Self = this.set("seatFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeatFee: Self = this.set("seatFee", js.undefined)
  }
}
