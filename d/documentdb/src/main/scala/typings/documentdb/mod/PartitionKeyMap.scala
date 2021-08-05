package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionKeyMap extends StObject {
  
  var link: String
  
  var range: Range
}
object PartitionKeyMap {
  
  inline def apply(link: String, range: Range): PartitionKeyMap = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionKeyMap]
  }
  
  extension [Self <: PartitionKeyMap](x: Self) {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
