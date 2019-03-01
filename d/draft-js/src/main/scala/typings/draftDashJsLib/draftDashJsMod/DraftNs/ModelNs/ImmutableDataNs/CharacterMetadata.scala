package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterMetadata extends js.Object {
  def getEntity(): java.lang.String
  def getStyle(): DraftInlineStyle
  def hasStyle(style: java.lang.String): scala.Boolean
}

object CharacterMetadata {
  @scala.inline
  def apply(
    getEntity: js.Function0[java.lang.String],
    getStyle: js.Function0[DraftInlineStyle],
    hasStyle: js.Function1[java.lang.String, scala.Boolean]
  ): CharacterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEntity")(getEntity)
    __obj.updateDynamic("getStyle")(getStyle)
    __obj.updateDynamic("hasStyle")(hasStyle)
    __obj.asInstanceOf[CharacterMetadata]
  }
}

