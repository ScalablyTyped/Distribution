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

