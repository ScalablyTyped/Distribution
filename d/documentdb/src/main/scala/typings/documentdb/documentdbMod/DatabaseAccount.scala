package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseAccount extends js.Object {
  var ConsistencyPolicy: typings.documentdb.documentdbMod.ConsistencyPolicy
  var CurrentMediaStorageUsageInMB: Double
  var DatabasesLink: String
  var MaxMediaStorageUsageInMB: Double
  var MediaLink: String
  var ReadableLocations: js.Array[String]
  var WritableLocations: js.Array[String]
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
    val __obj = js.Dynamic.literal(ConsistencyPolicy = ConsistencyPolicy, CurrentMediaStorageUsageInMB = CurrentMediaStorageUsageInMB, DatabasesLink = DatabasesLink, MaxMediaStorageUsageInMB = MaxMediaStorageUsageInMB, MediaLink = MediaLink, ReadableLocations = ReadableLocations, WritableLocations = WritableLocations)
  
    __obj.asInstanceOf[DatabaseAccount]
  }
}

