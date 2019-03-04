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
    val __obj = js.Dynamic.literal(apex_alias = apex_alias, email = email, expire = expire, minimum = minimum, name = name, primary_ns = primary_ns, refresh = refresh, retry = retry, serial = serial, uuid = uuid)
  
    __obj.asInstanceOf[Zone]
  }
}

