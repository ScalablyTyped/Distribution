package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the paragraph style settings.
  */
@js.native
trait ParagraphStyle extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: CharacterStyle = js.native
  /**
    * Gets the index of the list item associated with the paragraph formatted with the current style.
    */
  val listIndex: Double = js.native
  /**
    * Gets the index of the list level applied to the paragraph formatted with the current style.
    */
  val listLevelIndex: Double = js.native
  /**
    * Gets or sets the default style for a paragraph that immediately follows the current paragraph.
    */
  val nextStyle: ParagraphStyle = js.native
  /**
    * Gets or sets the style from which the current style inherits.
    */
  val parent: ParagraphStyle = js.native
}

object ParagraphStyle {
  @scala.inline
  def apply(
    isDeleted: Boolean,
    linkedStyle: CharacterStyle,
    listIndex: Double,
    listLevelIndex: Double,
    name: String,
    nextStyle: ParagraphStyle,
    parent: ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], linkedStyle = linkedStyle.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextStyle = nextStyle.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphStyle]
  }
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
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
    def setLinkedStyle(value: CharacterStyle): Self = this.set("linkedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setListIndex(value: Double): Self = this.set("listIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setListLevelIndex(value: Double): Self = this.set("listLevelIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextStyle(value: ParagraphStyle): Self = this.set("nextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: ParagraphStyle): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

