package typings
package gandiDashLivednsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  var apex_alias: java.lang.String
  var email: java.lang.String
  var expire: scala.Double
  var minimum: scala.Double
  var name: java.lang.String
  var primary_ns: java.lang.String
  var refresh: scala.Double
  var retry: scala.Double
  var serial: scala.Double
  var uuid: java.lang.String
}

object Zone {
  @scala.inline
  def apply(
    apex_alias: java.lang.String,
    email: java.lang.String,
    expire: scala.Double,
    minimum: scala.Double,
    name: java.lang.String,
    primary_ns: java.lang.String,
    refresh: scala.Double,
    retry: scala.Double,
    serial: scala.Double,
    uuid: java.lang.String
  ): Zone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apex_alias")(apex_alias)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("expire")(expire)
    __obj.updateDynamic("minimum")(minimum)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("primary_ns")(primary_ns)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("serial")(serial)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Zone]
  }
}

