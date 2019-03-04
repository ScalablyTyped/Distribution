package typings
package atGoogleDashCloudDatastoreLib.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreKeyOptions extends js.Object {
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var path: DatastoreKeyPath
}

object DatastoreKeyOptions {
  @scala.inline
  def apply(path: DatastoreKeyPath, namespace: java.lang.String = null): DatastoreKeyOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[DatastoreKeyOptions]
  }
}

