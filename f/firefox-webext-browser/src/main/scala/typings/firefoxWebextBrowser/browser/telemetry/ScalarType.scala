package typings.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* telemetry types */
/**
  * Type of scalar: 'count' for numeric values, 'string' for string values, 'boolean' for boolean values. Maps to
  * `nsITelemetry.SCALAR_TYPE_*`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.count
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.string
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.boolean
*/
trait ScalarType extends js.Object

object ScalarType {
  @scala.inline
  def boolean: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.count = this.cast("count")
  @scala.inline
  def string: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.string = this.cast("string")
}

