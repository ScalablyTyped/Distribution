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
    getEntity: () => java.lang.String,
    getStyle: () => DraftInlineStyle,
    hasStyle: java.lang.String => scala.Boolean
  ): CharacterMetadata = {
    val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity), getStyle = js.Any.fromFunction0(getStyle), hasStyle = js.Any.fromFunction1(hasStyle))
  
    __obj.asInstanceOf[CharacterMetadata]
  }
}

