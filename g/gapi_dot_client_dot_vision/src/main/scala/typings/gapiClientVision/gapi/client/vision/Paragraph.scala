package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paragraph extends js.Object {
  /**
    * The bounding box for the paragraph.
    * The vertices are in the order of top-left, top-right, bottom-right,
    * bottom-left. When a rotation of the bounding box is detected the rotation
    * is represented as around the top-left corner as defined when the text is
    * read in the 'natural' orientation.
    * For example:
    * &#42; when the text is horizontal it might look like:
    * 0----1
    * |    |
    * 3----2
    * &#42; when it's rotated 180 degrees around the top-left corner it becomes:
    * 2----3
    * |    |
    * 1----0
    * and the vertice order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[BoundingPoly] = js.native
  /** Additional information detected for the paragraph. */
  var property: js.UndefOr[TextProperty] = js.native
  /** List of words in this paragraph. */
  var words: js.UndefOr[js.Array[Word]] = js.native
}

object Paragraph {
  @scala.inline
  def apply(): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paragraph]
  }
  @scala.inline
  implicit class ParagraphOps[Self <: Paragraph] (val x: Self) extends AnyVal {
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
    def setBoundingBox(value: BoundingPoly): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    @scala.inline
    def setProperty(value: TextProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setWordsVarargs(value: Word*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[Word]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

