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
    val __obj = js.Dynamic.literal(apex_alias = apex_alias.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary_ns = primary_ns.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Zone]
  }
}

