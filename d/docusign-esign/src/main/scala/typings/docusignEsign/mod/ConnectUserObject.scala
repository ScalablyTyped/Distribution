package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectUserObject extends StObject {
  
  /**
    * The type of custom Connect configuration being accessed.
    */
  var configurationtype: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the custom Connect configuration being accessed.
    */
  var connectId: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean value that indicates whether the custom Connect configuration is enabled or not.
    */
  var enabled: js.UndefOr[String] = js.undefined
  
  var hasAccess: js.UndefOr[String] = js.undefined
  
  var senderSearchableItems: js.UndefOr[js.Array[String]] = js.undefined
}
object ConnectUserObject {
  
  @scala.inline
  def apply(): ConnectUserObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectUserObject]
  }
  
  @scala.inline
  implicit class ConnectUserObjectMutableBuilder[Self <: ConnectUserObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationtype(value: String): Self = StObject.set(x, "configurationtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationtypeUndefined: Self = StObject.set(x, "configurationtype", js.undefined)
    
    @scala.inline
    def setConnectId(value: String): Self = StObject.set(x, "connectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectIdUndefined: Self = StObject.set(x, "connectId", js.undefined)
    
    @scala.inline
    def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHasAccess(value: String): Self = StObject.set(x, "hasAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAccessUndefined: Self = StObject.set(x, "hasAccess", js.undefined)
    
    @scala.inline
    def setSenderSearchableItems(value: js.Array[String]): Self = StObject.set(x, "senderSearchableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderSearchableItemsUndefined: Self = StObject.set(x, "senderSearchableItems", js.undefined)
    
    @scala.inline
    def setSenderSearchableItemsVarargs(value: String*): Self = StObject.set(x, "senderSearchableItems", js.Array(value :_*))
  }
}
