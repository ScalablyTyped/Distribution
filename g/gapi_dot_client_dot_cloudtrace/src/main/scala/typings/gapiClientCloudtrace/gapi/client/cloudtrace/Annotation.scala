package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  /**
    * A set of attributes on the annotation. There is a limit of 4 attributes
    * per Annotation.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * A user-supplied message describing the event. The maximum length for
    * the description is 256 bytes.
    */
  var description: js.UndefOr[TruncatableString] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(attributes: Attributes = null, description: TruncatableString = null): Annotation = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

