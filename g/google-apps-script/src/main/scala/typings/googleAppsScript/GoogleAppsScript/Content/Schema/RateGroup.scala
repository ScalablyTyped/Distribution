package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateGroup extends js.Object {
  
  var applicableShippingLabels: js.UndefOr[js.Array[String]] = js.native
  
  var carrierRates: js.UndefOr[js.Array[CarrierRate]] = js.native
  
  var mainTable: js.UndefOr[Table] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var singleValue: js.UndefOr[Value] = js.native
  
  var subtables: js.UndefOr[js.Array[Table]] = js.native
}
object RateGroup {
  
  @scala.inline
  def apply(): RateGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateGroup]
  }
  
  @scala.inline
  implicit class RateGroupOps[Self <: RateGroup] (val x: Self) extends AnyVal {
    
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
    def setApplicableShippingLabelsVarargs(value: String*): Self = this.set("applicableShippingLabels", js.Array(value :_*))
    
    @scala.inline
    def setApplicableShippingLabels(value: js.Array[String]): Self = this.set("applicableShippingLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableShippingLabels: Self = this.set("applicableShippingLabels", js.undefined)
    
    @scala.inline
    def setCarrierRatesVarargs(value: CarrierRate*): Self = this.set("carrierRates", js.Array(value :_*))
    
    @scala.inline
    def setCarrierRates(value: js.Array[CarrierRate]): Self = this.set("carrierRates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierRates: Self = this.set("carrierRates", js.undefined)
    
    @scala.inline
    def setMainTable(value: Table): Self = this.set("mainTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainTable: Self = this.set("mainTable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSingleValue(value: Value): Self = this.set("singleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValue: Self = this.set("singleValue", js.undefined)
    
    @scala.inline
    def setSubtablesVarargs(value: Table*): Self = this.set("subtables", js.Array(value :_*))
    
    @scala.inline
    def setSubtables(value: js.Array[Table]): Self = this.set("subtables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtables: Self = this.set("subtables", js.undefined)
  }
}
