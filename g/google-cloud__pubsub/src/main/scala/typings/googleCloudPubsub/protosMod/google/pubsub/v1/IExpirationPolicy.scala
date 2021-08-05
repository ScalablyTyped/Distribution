package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExpirationPolicy. */
trait IExpirationPolicy extends StObject {
  
  /** ExpirationPolicy ttl */
  var ttl: js.UndefOr[IDuration | Null] = js.undefined
}
object IExpirationPolicy {
  
  inline def apply(): IExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpirationPolicy]
  }
  
  extension [Self <: IExpirationPolicy](x: Self) {
    
    inline def setTtl(value: IDuration): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
