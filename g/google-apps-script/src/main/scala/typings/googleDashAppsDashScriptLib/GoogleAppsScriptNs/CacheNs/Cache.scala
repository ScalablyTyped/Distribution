package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def get(key: java.lang.String): java.lang.String = js.native
  def getAll(keys: js.Array[java.lang.String]): js.Any = js.native
  def put(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def put(
    key: java.lang.String,
    value: java.lang.String,
    expirationInSeconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def putAll(values: js.Any): scala.Unit = js.native
  def putAll(values: js.Any, expirationInSeconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def removeAll(keys: js.Array[java.lang.String]): scala.Unit = js.native
}

