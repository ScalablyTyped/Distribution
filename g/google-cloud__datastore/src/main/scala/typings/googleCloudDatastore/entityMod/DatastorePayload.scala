package typings.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatastorePayload[T] extends js.Object {
  
  // TODO Include possibility of 'raw data' with indexing options, etc
  var data: T | js.Object = js.native
  
  var excludeFromIndexes: js.UndefOr[js.Array[String]] = js.native
  
  var key: DatastoreKey = js.native
}
object DatastorePayload {
  
  @scala.inline
  def apply[T](data: T | js.Object, key: DatastoreKey): DatastorePayload[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastorePayload[T]]
  }
  
  @scala.inline
  implicit class DatastorePayloadOps[Self <: DatastorePayload[_], T] (val x: Self with DatastorePayload[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: T | js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: DatastoreKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFromIndexesVarargs(value: String*): Self = this.set("excludeFromIndexes", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFromIndexes(value: js.Array[String]): Self = this.set("excludeFromIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFromIndexes: Self = this.set("excludeFromIndexes", js.undefined)
  }
}
