package typings.ethers.anon

import typings.ethers.ethersStrings.event
import typings.ethers.typesProvidersAbstractProviderMod.Subscription
import typings.ethers.typesProvidersProviderMod.EventFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter
  extends StObject
     with Subscription {
  
  var filter: EventFilter
  
  var tag: String
  
  var `type`: event
}
object Filter {
  
  inline def apply(filter: EventFilter, tag: String): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: EventFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
