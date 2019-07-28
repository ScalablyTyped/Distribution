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
    val __obj = js.Dynamic.literal(kind = kind, path = path)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DatastoreKey]
  }
}

