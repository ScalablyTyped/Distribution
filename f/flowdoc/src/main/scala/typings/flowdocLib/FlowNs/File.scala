package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var document: Document
  var schemaVersion: SchemaVersion
  var settings: Settings
}

object File {
  @scala.inline
  def apply(document: Document, schemaVersion: SchemaVersion, settings: Settings): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("schemaVersion")(schemaVersion)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[File]
  }
}

