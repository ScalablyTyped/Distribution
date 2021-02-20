package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionKeyMap extends StObject {
  
  var link: String = js.native
  
  var range: Range = js.native
}
object PartitionKeyMap {
  
  @scala.inline
  def apply(link: String, range: Range): PartitionKeyMap = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionKeyMap]
  }
  
  @scala.inline
  implicit class PartitionKeyMapMutableBuilder[Self <: PartitionKeyMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
