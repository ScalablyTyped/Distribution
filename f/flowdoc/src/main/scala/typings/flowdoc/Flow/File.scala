package typings.flowdoc.Flow

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
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

