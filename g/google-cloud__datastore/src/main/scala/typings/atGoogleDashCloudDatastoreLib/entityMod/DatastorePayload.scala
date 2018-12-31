package typings
package atGoogleDashCloudDatastoreLib.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastorePayload[T] extends js.Object {
  // TODO Include possibility of 'raw data' with indexing options, etc
  var data: T | js.Object
  var excludeFromIndexes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var key: DatastoreKey
}

