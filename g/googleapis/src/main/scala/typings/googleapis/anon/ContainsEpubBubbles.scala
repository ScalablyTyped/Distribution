package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainsEpubBubbles extends js.Object {
  var containsEpubBubbles: js.UndefOr[Boolean] = js.native
  var containsImageBubbles: js.UndefOr[Boolean] = js.native
  var epubBubbleVersion: js.UndefOr[String] = js.native
  var imageBubbleVersion: js.UndefOr[String] = js.native
}

object ContainsEpubBubbles {
  @scala.inline
  def apply(): ContainsEpubBubbles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsEpubBubbles]
  }
  @scala.inline
  implicit class ContainsEpubBubblesOps[Self <: ContainsEpubBubbles] (val x: Self) extends AnyVal {
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
    def setContainsEpubBubbles(value: Boolean): Self = this.set("containsEpubBubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsEpubBubbles: Self = this.set("containsEpubBubbles", js.undefined)
    @scala.inline
    def setContainsImageBubbles(value: Boolean): Self = this.set("containsImageBubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsImageBubbles: Self = this.set("containsImageBubbles", js.undefined)
    @scala.inline
    def setEpubBubbleVersion(value: String): Self = this.set("epubBubbleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpubBubbleVersion: Self = this.set("epubBubbleVersion", js.undefined)
    @scala.inline
    def setImageBubbleVersion(value: String): Self = this.set("imageBubbleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBubbleVersion: Self = this.set("imageBubbleVersion", js.undefined)
  }
  
}

