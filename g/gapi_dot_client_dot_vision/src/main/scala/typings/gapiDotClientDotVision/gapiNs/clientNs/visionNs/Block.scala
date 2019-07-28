package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  /** Detected block type (text, image etc) for this block. */
  var blockType: js.UndefOr[String] = js.undefined
  /**
    * The bounding box for the block.
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
  var boundingBox: js.UndefOr[BoundingPoly] = js.undefined
  /** List of paragraphs in this block (if this blocks is of type text). */
  var paragraphs: js.UndefOr[js.Array[Paragraph]] = js.undefined
  /** Additional information detected for the block. */
  var property: js.UndefOr[TextProperty] = js.undefined
}

object Block {
  @scala.inline
  def apply(
    blockType: String = null,
    boundingBox: BoundingPoly = null,
    paragraphs: js.Array[Paragraph] = null,
    property: TextProperty = null
  ): Block = {
    val __obj = js.Dynamic.literal()
    if (blockType != null) __obj.updateDynamic("blockType")(blockType)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Block]
  }
}

