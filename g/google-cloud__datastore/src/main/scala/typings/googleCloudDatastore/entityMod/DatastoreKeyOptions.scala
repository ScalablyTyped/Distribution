package typings.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreKeyOptions extends js.Object {
  var namespace: js.UndefOr[String] = js.undefined
  var path: DatastoreKeyPath
}

object DatastoreKeyOptions {
  @scala.inline
  def apply(path: DatastoreKeyPath, namespace: String = null): DatastoreKeyOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreKeyOptions]
  }
}

