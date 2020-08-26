package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pingtype extends js.Object {
  var ping_type: String = js.native
  var pioneer_id: js.UndefOr[Boolean] = js.native
  var public_key: Key = js.native
  var schemaNamespace: String = js.native
  var study_name: js.UndefOr[String] = js.native
}

object Pingtype {
  @scala.inline
  def apply(ping_type: String, public_key: Key, schemaNamespace: String): Pingtype = {
    val __obj = js.Dynamic.literal(ping_type = ping_type.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], schemaNamespace = schemaNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pingtype]
  }
  @scala.inline
  implicit class PingtypeOps[Self <: Pingtype] (val x: Self) extends AnyVal {
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
    def setPing_type(value: String): Self = this.set("ping_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic_key(value: Key): Self = this.set("public_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaNamespace(value: String): Self = this.set("schemaNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setPioneer_id(value: Boolean): Self = this.set("pioneer_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePioneer_id: Self = this.set("pioneer_id", js.undefined)
    @scala.inline
    def setStudy_name(value: String): Self = this.set("study_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudy_name: Self = this.set("study_name", js.undefined)
  }
  
}

