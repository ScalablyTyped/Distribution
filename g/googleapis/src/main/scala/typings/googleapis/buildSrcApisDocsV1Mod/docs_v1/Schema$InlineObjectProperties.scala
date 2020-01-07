package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of an InlineObject.
  */
@js.native
trait Schema$InlineObjectProperties extends js.Object {
  /**
    * The embedded object of this inline object.
    */
  var embeddedObject: js.UndefOr[Schema$EmbeddedObject] = js.native
}

object Schema$InlineObjectProperties {
  @scala.inline
  def apply(embeddedObject: Schema$EmbeddedObject = null): Schema$InlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (embeddedObject != null) __obj.updateDynamic("embeddedObject")(embeddedObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InlineObjectProperties]
  }
}

