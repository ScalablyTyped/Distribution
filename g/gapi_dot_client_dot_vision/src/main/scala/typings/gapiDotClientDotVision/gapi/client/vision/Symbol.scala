package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  /**
    * The bounding box for the symbol.
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
  /** Additional information detected for the symbol. */
  var property: js.UndefOr[TextProperty] = js.undefined
  /** The actual UTF-8 representation of the symbol. */
  var text: js.UndefOr[String] = js.undefined
}

object Symbol {
  @scala.inline
  def apply(boundingBox: BoundingPoly = null, property: TextProperty = null, text: String = null): Symbol = {
    val __obj = js.Dynamic.literal()
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox)
    if (property != null) __obj.updateDynamic("property")(property)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Symbol]
  }
}

