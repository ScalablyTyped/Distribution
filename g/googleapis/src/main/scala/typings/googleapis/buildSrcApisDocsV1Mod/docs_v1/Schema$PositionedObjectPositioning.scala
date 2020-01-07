package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The positioning of a PositionedObject. The positioned object is positioned
  * relative to the beginning of the Paragraph it is tethered to.
  */
@js.native
trait Schema$PositionedObjectPositioning extends js.Object {
  /**
    * The layout of this positioned object.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * The offset of the left edge of the positioned object relative to the
    * beginning of the Paragraph it is tethered to. The exact positioning of
    * the object can depend on other content in the document and the
    * document&#39;s styling.
    */
  var leftOffset: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The offset of the top edge of the positioned object relative to the
    * beginning of the Paragraph it is tethered to. The exact positioning of
    * the object can depend on other content in the document and the
    * document&#39;s styling.
    */
  var topOffset: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$PositionedObjectPositioning {
  @scala.inline
  def apply(layout: String = null, leftOffset: Schema$Dimension = null, topOffset: Schema$Dimension = null): Schema$PositionedObjectPositioning = {
    val __obj = js.Dynamic.literal()
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (leftOffset != null) __obj.updateDynamic("leftOffset")(leftOffset.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PositionedObjectPositioning]
  }
}

