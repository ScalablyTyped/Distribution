package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text annotation with a set of attributes.
  */
@js.native
trait Schema$Annotation extends js.Object {
  /**
    * A set of attributes on the annotation. You can have up to 4 attributes
    * per Annotation.
    */
  var attributes: js.UndefOr[Schema$Attributes] = js.native
  /**
    * A user-supplied message describing the event. The maximum length for the
    * description is 256 bytes.
    */
  var description: js.UndefOr[Schema$TruncatableString] = js.native
}

object Schema$Annotation {
  @scala.inline
  def apply(attributes: Schema$Attributes = null, description: Schema$TruncatableString = null): Schema$Annotation = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Annotation]
  }
}

