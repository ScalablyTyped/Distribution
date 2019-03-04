package typings
package atGoogleDashCloudDatastoreLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult extends js.Object {
  var conflictDetected: scala.Boolean
  var key: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey
  var version: scala.Double
}

object MutationResult {
  @scala.inline
  def apply(
    conflictDetected: scala.Boolean,
    key: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey,
    version: scala.Double
  ): MutationResult = {
    val __obj = js.Dynamic.literal(conflictDetected = conflictDetected, key = key, version = version)
  
    __obj.asInstanceOf[MutationResult]
  }
}

