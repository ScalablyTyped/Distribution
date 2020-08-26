package typings.draftJs.mod.Draft.Model.ImmutableData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterMetadataConfig extends js.Object {
  var entity: js.UndefOr[String] = js.native
  var style: js.UndefOr[DraftInlineStyle] = js.native
}

object CharacterMetadataConfig {
  @scala.inline
  def apply(): CharacterMetadataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterMetadataConfig]
  }
  @scala.inline
  implicit class CharacterMetadataConfigOps[Self <: CharacterMetadataConfig] (val x: Self) extends AnyVal {
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
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    @scala.inline
    def setStyle(value: DraftInlineStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

