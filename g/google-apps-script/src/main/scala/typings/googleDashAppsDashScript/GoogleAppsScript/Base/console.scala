package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait console extends js.Object {
  def error(): Unit = js.native
  def error(formatOrObject: String, values: js.Any*): Unit = js.native
  def error(formatOrObject: js.Object, values: js.Any*): Unit = js.native
  def info(): Unit = js.native
  def info(formatOrObject: String, values: js.Any*): Unit = js.native
  def info(formatOrObject: js.Object, values: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(formatOrObject: String, values: js.Any*): Unit = js.native
  def log(formatOrObject: js.Object, values: js.Any*): Unit = js.native
  def time(label: String): Unit = js.native
  def timeEnd(label: String): Unit = js.native
  def warn(): Unit = js.native
  def warn(formatOrObject: String, values: js.Any*): Unit = js.native
  def warn(formatOrObject: js.Object, values: js.Any*): Unit = js.native
}

