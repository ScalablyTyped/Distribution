package typings.ethers.anon

import typings.ethers.ethersStrings.transaction
import typings.ethers.typesProvidersAbstractProviderMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash
  extends StObject
     with Subscription {
  
  var hash: String
  
  var tag: String
  
  var `type`: transaction
}
object Hash {
  
  inline def apply(hash: String, tag: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("transaction")
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: transaction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
