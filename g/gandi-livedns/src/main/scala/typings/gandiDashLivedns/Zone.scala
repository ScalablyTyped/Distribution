package typings.gandiDashLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  var apex_alias: String
  var email: String
  var expire: Double
  var minimum: Double
  var name: String
  var primary_ns: String
  var refresh: Double
  var retry: Double
  var serial: Double
  var uuid: String
}

object Zone {
  @scala.inline
  def apply(
    apex_alias: String,
    email: String,
    expire: Double,
    minimum: Double,
    name: String,
    primary_ns: String,
    refresh: Double,
    retry: Double,
    serial: Double,
    uuid: String
  ): Zone = {
    val __obj = js.Dynamic.literal(apex_alias = apex_alias, email = email, expire = expire, minimum = minimum, name = name, primary_ns = primary_ns, refresh = refresh, retry = retry, serial = serial, uuid = uuid)
  
    __obj.asInstanceOf[Zone]
  }
}

