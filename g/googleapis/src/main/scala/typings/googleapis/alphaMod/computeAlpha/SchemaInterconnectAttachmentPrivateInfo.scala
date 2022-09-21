package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectAttachmentPrivateInfo extends StObject {
  
  /**
    * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
    */
  var tag8021q: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInterconnectAttachmentPrivateInfo {
  
  inline def apply(): SchemaInterconnectAttachmentPrivateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentPrivateInfo]
  }
  
  extension [Self <: SchemaInterconnectAttachmentPrivateInfo](x: Self) {
    
    inline def setTag8021q(value: Double): Self = StObject.set(x, "tag8021q", value.asInstanceOf[js.Any])
    
    inline def setTag8021qNull: Self = StObject.set(x, "tag8021q", null)
    
    inline def setTag8021qUndefined: Self = StObject.set(x, "tag8021q", js.undefined)
  }
}
