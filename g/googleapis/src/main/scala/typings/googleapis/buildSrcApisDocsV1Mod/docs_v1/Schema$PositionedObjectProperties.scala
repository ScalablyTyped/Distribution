package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of a PositionedObject.
  */
@js.native
trait Schema$PositionedObjectProperties extends js.Object {
  /**
    * The embedded object of this positioned object.
    */
  var embeddedObject: js.UndefOr[Schema$EmbeddedObject] = js.native
  /**
    * The positioning of this positioned object relative to the newline of the
    * Paragraph that references this positioned object.
    */
  var positioning: js.UndefOr[Schema$PositionedObjectPositioning] = js.native
}

object Schema$PositionedObjectProperties {
  @scala.inline
  def apply(
    embeddedObject: Schema$EmbeddedObject = null,
    positioning: Schema$PositionedObjectPositioning = null
  ): Schema$PositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (embeddedObject != null) __obj.updateDynamic("embeddedObject")(embeddedObject.asInstanceOf[js.Any])
    if (positioning != null) __obj.updateDynamic("positioning")(positioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PositionedObjectProperties]
  }
}

