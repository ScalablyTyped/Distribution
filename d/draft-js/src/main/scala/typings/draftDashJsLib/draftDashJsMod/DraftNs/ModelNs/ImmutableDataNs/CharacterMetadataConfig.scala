package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterMetadataConfig extends js.Object {
  var entity: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[DraftInlineStyle] = js.undefined
}

object CharacterMetadataConfig {
  @scala.inline
  def apply(entity: java.lang.String = null, style: DraftInlineStyle = null): CharacterMetadataConfig = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CharacterMetadataConfig]
  }
}

