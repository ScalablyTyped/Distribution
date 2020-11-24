package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseAccount extends js.Object {
  
  var ConsistencyPolicy: typings.documentdb.mod.ConsistencyPolicy = js.native
  
  var CurrentMediaStorageUsageInMB: Double = js.native
  
  var DatabasesLink: String = js.native
  
  var MaxMediaStorageUsageInMB: Double = js.native
  
  var MediaLink: String = js.native
  
  var ReadableLocations: js.Array[String] = js.native
  
  var WritableLocations: js.Array[String] = js.native
}
object DatabaseAccount {
  
  @scala.inline
  def apply(
    ConsistencyPolicy: ConsistencyPolicy,
    CurrentMediaStorageUsageInMB: Double,
    DatabasesLink: String,
    MaxMediaStorageUsageInMB: Double,
    MediaLink: String,
    ReadableLocations: js.Array[String],
    WritableLocations: js.Array[String]
  ): DatabaseAccount = {
    val __obj = js.Dynamic.literal(ConsistencyPolicy = ConsistencyPolicy.asInstanceOf[js.Any], CurrentMediaStorageUsageInMB = CurrentMediaStorageUsageInMB.asInstanceOf[js.Any], DatabasesLink = DatabasesLink.asInstanceOf[js.Any], MaxMediaStorageUsageInMB = MaxMediaStorageUsageInMB.asInstanceOf[js.Any], MediaLink = MediaLink.asInstanceOf[js.Any], ReadableLocations = ReadableLocations.asInstanceOf[js.Any], WritableLocations = WritableLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAccount]
  }
  
  @scala.inline
  implicit class DatabaseAccountOps[Self <: DatabaseAccount] (val x: Self) extends AnyVal {
    
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
    def setConsistencyPolicy(value: ConsistencyPolicy): Self = this.set("ConsistencyPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMediaStorageUsageInMB(value: Double): Self = this.set("CurrentMediaStorageUsageInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasesLink(value: String): Self = this.set("DatabasesLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMediaStorageUsageInMB(value: Double): Self = this.set("MaxMediaStorageUsageInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaLink(value: String): Self = this.set("MediaLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableLocationsVarargs(value: String*): Self = this.set("ReadableLocations", js.Array(value :_*))
    
    @scala.inline
    def setReadableLocations(value: js.Array[String]): Self = this.set("ReadableLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableLocationsVarargs(value: String*): Self = this.set("WritableLocations", js.Array(value :_*))
    
    @scala.inline
    def setWritableLocations(value: js.Array[String]): Self = this.set("WritableLocations", value.asInstanceOf[js.Any])
  }
}
