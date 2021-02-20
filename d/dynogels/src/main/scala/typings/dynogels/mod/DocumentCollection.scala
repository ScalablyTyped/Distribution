package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentCollection extends StObject {
  
  var ConsumedCapacity: typings.dynogels.mod.ConsumedCapacity = js.native
  
  var Count: Double = js.native
  
  var Items: js.Array[Document] = js.native
  
  var LastEvaluatedKey: js.UndefOr[js.Any] = js.native
  
  var ScannedCount: Double = js.native
}
object DocumentCollection {
  
  @scala.inline
  def apply(ConsumedCapacity: ConsumedCapacity, Count: Double, Items: js.Array[Document], ScannedCount: Double): DocumentCollection = {
    val __obj = js.Dynamic.literal(ConsumedCapacity = ConsumedCapacity.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], ScannedCount = ScannedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCollection]
  }
  
  @scala.inline
  implicit class DocumentCollectionMutableBuilder[Self <: DocumentCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Document]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Document*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setLastEvaluatedKey(value: js.Any): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
    
    @scala.inline
    def setScannedCount(value: Double): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
  }
}
