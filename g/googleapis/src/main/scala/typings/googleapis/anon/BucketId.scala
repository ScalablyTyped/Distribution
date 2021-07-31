package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketId extends StObject {
  
  var bucketId: js.UndefOr[String] = js.undefined
  
  var objectId: js.UndefOr[String] = js.undefined
}
object BucketId {
  
  @scala.inline
  def apply(): BucketId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketId]
  }
  
  @scala.inline
  implicit class BucketIdMutableBuilder[Self <: BucketId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
