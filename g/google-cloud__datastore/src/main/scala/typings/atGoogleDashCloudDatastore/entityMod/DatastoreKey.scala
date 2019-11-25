package typings.atGoogleDashCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreKey extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: String
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[DatastoreKey] = js.undefined
  val path: DatastoreKeyPath
}

object DatastoreKey {
  @scala.inline
  def apply(
    kind: String,
    path: DatastoreKeyPath,
    id: String = null,
    name: String = null,
    parent: DatastoreKey = null
  ): DatastoreKey = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreKey]
  }
}

