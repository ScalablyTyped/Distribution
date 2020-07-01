package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaName extends js.Object {
  /** Schema name used for payload. */
  var schemaName: String
  /** Schema version used for payload. */
  var schemaVersion: Double
}

object SchemaName {
  @scala.inline
  def apply(schemaName: String, schemaVersion: Double): SchemaName = {
    val __obj = js.Dynamic.literal(schemaName = schemaName.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaName]
  }
}

