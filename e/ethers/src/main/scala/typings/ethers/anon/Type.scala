package typings.ethers.anon

import typings.ethers.ethersStrings.orphan
import typings.ethers.typesProvidersAbstractProviderMod.Subscription
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with Subscription {
  
  var filter: OrphanFilter
  
  var tag: String
  
  var `type`: orphan
}
object Type {
  
  inline def apply(filter: OrphanFilter, tag: String): Type = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("orphan")
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: OrphanFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: orphan): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
