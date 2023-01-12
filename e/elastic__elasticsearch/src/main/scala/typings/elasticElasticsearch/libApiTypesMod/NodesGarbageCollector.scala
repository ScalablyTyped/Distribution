package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesGarbageCollector extends StObject {
  
  var collectors: js.UndefOr[Record[String, NodesGarbageCollectorTotal]] = js.undefined
}
object NodesGarbageCollector {
  
  inline def apply(): NodesGarbageCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGarbageCollector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesGarbageCollector] (val x: Self) extends AnyVal {
    
    inline def setCollectors(value: Record[String, NodesGarbageCollectorTotal]): Self = StObject.set(x, "collectors", value.asInstanceOf[js.Any])
    
    inline def setCollectorsUndefined: Self = StObject.set(x, "collectors", js.undefined)
  }
}
