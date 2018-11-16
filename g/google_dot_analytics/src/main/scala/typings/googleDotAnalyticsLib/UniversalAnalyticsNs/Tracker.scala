package typings
package googleDotAnalyticsLib.UniversalAnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracker extends js.Object {
  def get(fieldName: java.lang.String): js.Any = js.native
  def send(hitType: java.lang.String, fieldsObject: js.Object): scala.Unit = js.native
  def send(hitType: java.lang.String, fields: js.Any*): scala.Unit = js.native
  def set(fieldName: java.lang.String, fieldValue: js.Any): scala.Unit = js.native
  def set(fieldsObject: js.Object): scala.Unit = js.native
}

