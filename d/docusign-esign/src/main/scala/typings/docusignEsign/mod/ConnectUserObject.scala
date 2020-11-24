package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectUserObject extends js.Object {
  
  /**
    * The type of custom Connect configuration being accessed.
    */
  var configurationtype: js.UndefOr[String] = js.native
  
  /**
    * The ID of the custom Connect configuration being accessed.
    */
  var connectId: js.UndefOr[String] = js.native
  
  /**
    * Boolean value that indicates whether the custom Connect configuration is enabled or not.
    */
  var enabled: js.UndefOr[String] = js.native
  
  var hasAccess: js.UndefOr[String] = js.native
  
  var senderSearchableItems: js.UndefOr[js.Array[String]] = js.native
}
object ConnectUserObject {
  
  @scala.inline
  def apply(): ConnectUserObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectUserObject]
  }
  
  @scala.inline
  implicit class ConnectUserObjectOps[Self <: ConnectUserObject] (val x: Self) extends AnyVal {
    
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
    def setConfigurationtype(value: String): Self = this.set("configurationtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationtype: Self = this.set("configurationtype", js.undefined)
    
    @scala.inline
    def setConnectId(value: String): Self = this.set("connectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectId: Self = this.set("connectId", js.undefined)
    
    @scala.inline
    def setEnabled(value: String): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHasAccess(value: String): Self = this.set("hasAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAccess: Self = this.set("hasAccess", js.undefined)
    
    @scala.inline
    def setSenderSearchableItemsVarargs(value: String*): Self = this.set("senderSearchableItems", js.Array(value :_*))
    
    @scala.inline
    def setSenderSearchableItems(value: js.Array[String]): Self = this.set("senderSearchableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderSearchableItems: Self = this.set("senderSearchableItems", js.undefined)
  }
}
