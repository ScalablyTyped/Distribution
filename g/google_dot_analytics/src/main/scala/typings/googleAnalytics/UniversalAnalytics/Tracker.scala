package typings.googleAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracker extends js.Object {
  def get(fieldName: String): js.Any = js.native
  def send(hitType: String, fieldsObject: js.Object): Unit = js.native
  def send(hitType: String, fields: js.Any*): Unit = js.native
  def set(fieldName: String, fieldValue: js.Any): Unit = js.native
  def set(fieldsObject: js.Object): Unit = js.native
}

