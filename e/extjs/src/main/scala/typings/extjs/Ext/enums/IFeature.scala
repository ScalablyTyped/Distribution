package typings.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFeature extends js.Object {
  
  /** [Property] (String) */
  var abstractsummary: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var feature: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var grouping: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var groupingsummary: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var rowbody: js.UndefOr[String] = js.native
  
  /** [Property] (String) */
  var summary: js.UndefOr[String] = js.native
}
object IFeature {
  
  @scala.inline
  def apply(): IFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeature]
  }
  
  @scala.inline
  implicit class IFeatureOps[Self <: IFeature] (val x: Self) extends AnyVal {
    
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
    def setAbstractsummary(value: String): Self = this.set("abstractsummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbstractsummary: Self = this.set("abstractsummary", js.undefined)
    
    @scala.inline
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setGrouping(value: String): Self = this.set("grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    
    @scala.inline
    def setGroupingsummary(value: String): Self = this.set("groupingsummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingsummary: Self = this.set("groupingsummary", js.undefined)
    
    @scala.inline
    def setRowbody(value: String): Self = this.set("rowbody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowbody: Self = this.set("rowbody", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
