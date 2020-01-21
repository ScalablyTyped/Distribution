package typings.draftJs.mod.Draft.Model.ImmutableData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterMetadataConfig extends js.Object {
  var entity: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[DraftInlineStyle] = js.undefined
}

object CharacterMetadataConfig {
  @scala.inline
  def apply(entity: String = null, style: DraftInlineStyle = null): CharacterMetadataConfig = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterMetadataConfig]
  }
}

