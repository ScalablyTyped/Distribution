package typings.draftJs.mod.Draft.Model.ImmutableData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterMetadata extends js.Object {
  def getEntity(): String
  def getStyle(): DraftInlineStyle
  def hasStyle(style: String): Boolean
}

object CharacterMetadata {
  @scala.inline
  def apply(getEntity: () => String, getStyle: () => DraftInlineStyle, hasStyle: String => Boolean): CharacterMetadata = {
    val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity), getStyle = js.Any.fromFunction0(getStyle), hasStyle = js.Any.fromFunction1(hasStyle))
  
    __obj.asInstanceOf[CharacterMetadata]
  }
}

