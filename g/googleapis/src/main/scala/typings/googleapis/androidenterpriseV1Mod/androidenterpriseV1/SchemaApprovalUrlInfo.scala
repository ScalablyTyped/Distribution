package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information on an approval URL.
  */
trait SchemaApprovalUrlInfo extends StObject {
  
  /**
    * A URL that displays a product&#39;s permissions and that can also be used
    * to approve the product with the Products.approve call.
    */
  var approvalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#approvalUrlInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaApprovalUrlInfo {
  
  inline def apply(): SchemaApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApprovalUrlInfo]
  }
  
  extension [Self <: SchemaApprovalUrlInfo](x: Self) {
    
    inline def setApprovalUrl(value: String): Self = StObject.set(x, "approvalUrl", value.asInstanceOf[js.Any])
    
    inline def setApprovalUrlUndefined: Self = StObject.set(x, "approvalUrl", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
