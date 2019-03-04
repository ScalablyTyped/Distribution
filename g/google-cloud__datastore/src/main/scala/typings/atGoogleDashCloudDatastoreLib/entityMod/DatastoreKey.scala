package typings
package atGoogleDashCloudDatastoreLib.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreKey extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[DatastoreKey] = js.undefined
  val path: DatastoreKeyPath
}

object DatastoreKey {
  @scala.inline
  def apply(
    kind: java.lang.String,
    path: DatastoreKeyPath,
    id: java.lang.String = null,
    name: java.lang.String = null,
    parent: DatastoreKey = null
  ): DatastoreKey = {
    val __obj = js.Dynamic.literal(kind = kind, path = path)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DatastoreKey]
  }
}

