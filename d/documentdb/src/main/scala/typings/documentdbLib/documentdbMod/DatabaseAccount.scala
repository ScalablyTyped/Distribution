package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseAccount extends js.Object {
  var ConsistencyPolicy: ConsistencyPolicy
  var CurrentMediaStorageUsageInMB: scala.Double
  var DatabasesLink: java.lang.String
  var MaxMediaStorageUsageInMB: scala.Double
  var MediaLink: java.lang.String
  var ReadableLocations: js.Array[java.lang.String]
  var WritableLocations: js.Array[java.lang.String]
}

object DatabaseAccount {
  @scala.inline
  def apply(
    ConsistencyPolicy: ConsistencyPolicy,
    CurrentMediaStorageUsageInMB: scala.Double,
    DatabasesLink: java.lang.String,
    MaxMediaStorageUsageInMB: scala.Double,
    MediaLink: java.lang.String,
    ReadableLocations: js.Array[java.lang.String],
    WritableLocations: js.Array[java.lang.String]
  ): DatabaseAccount = {
    val __obj = js.Dynamic.literal(ConsistencyPolicy = ConsistencyPolicy, CurrentMediaStorageUsageInMB = CurrentMediaStorageUsageInMB, DatabasesLink = DatabasesLink, MaxMediaStorageUsageInMB = MaxMediaStorageUsageInMB, MediaLink = MediaLink, ReadableLocations = ReadableLocations, WritableLocations = WritableLocations)
  
    __obj.asInstanceOf[DatabaseAccount]
  }
}

