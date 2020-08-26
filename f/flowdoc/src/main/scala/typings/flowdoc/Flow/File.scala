package typings.flowdoc.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var document: Document = js.native
  var schemaVersion: SchemaVersion = js.native
  var settings: Settings = js.native
}

object File {
  @scala.inline
  def apply(document: Document, schemaVersion: SchemaVersion, settings: Settings): File = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaVersion(value: SchemaVersion): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

