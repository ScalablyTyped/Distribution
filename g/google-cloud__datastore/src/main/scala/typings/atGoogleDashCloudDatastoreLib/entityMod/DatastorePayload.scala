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

object DatastorePayload {
  @scala.inline
  def apply[T](data: T | js.Object, key: DatastoreKey, excludeFromIndexes: js.Array[java.lang.String] = null): DatastorePayload[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key)
    if (excludeFromIndexes != null) __obj.updateDynamic("excludeFromIndexes")(excludeFromIndexes)
    __obj.asInstanceOf[DatastorePayload[T]]
  }
}

