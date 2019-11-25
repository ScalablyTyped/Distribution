package typings.atGoogleDashCloudDatastore.requestMod

import typings.atGoogleDashCloudDatastore.entityMod.DatastoreKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult extends js.Object {
  var conflictDetected: Boolean
  var key: DatastoreKey
  var version: Double
}

object MutationResult {
  @scala.inline
  def apply(conflictDetected: Boolean, key: DatastoreKey, version: Double): MutationResult = {
    val __obj = js.Dynamic.literal(conflictDetected = conflictDetected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MutationResult]
  }
}

