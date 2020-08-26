package typings.draftJs.mod.Draft.Model.ImmutableData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterMetadata extends js.Object {
  def getEntity(): String = js.native
  def getStyle(): DraftInlineStyle = js.native
  def hasStyle(style: String): Boolean = js.native
}

object CharacterMetadata {
  @scala.inline
  def apply(getEntity: () => String, getStyle: () => DraftInlineStyle, hasStyle: String => Boolean): CharacterMetadata = {
    val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity), getStyle = js.Any.fromFunction0(getStyle), hasStyle = js.Any.fromFunction1(hasStyle))
    __obj.asInstanceOf[CharacterMetadata]
  }
  @scala.inline
  implicit class CharacterMetadataOps[Self <: CharacterMetadata] (val x: Self) extends AnyVal {
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
    def setGetEntity(value: () => String): Self = this.set("getEntity", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStyle(value: () => DraftInlineStyle): Self = this.set("getStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setHasStyle(value: String => Boolean): Self = this.set("hasStyle", js.Any.fromFunction1(value))
  }
  
}

