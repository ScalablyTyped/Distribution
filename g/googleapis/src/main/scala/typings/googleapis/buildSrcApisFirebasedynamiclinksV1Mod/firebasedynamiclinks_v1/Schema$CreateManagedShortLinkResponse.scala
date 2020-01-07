package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to create a short Dynamic Link.
  */
@js.native
trait Schema$CreateManagedShortLinkResponse extends js.Object {
  /**
    * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
    */
  var managedShortLink: js.UndefOr[Schema$ManagedShortLink] = js.native
  /**
    * Preview link to show the link flow chart. (debug info.)
    */
  var previewLink: js.UndefOr[String] = js.native
  /**
    * Information about potential warnings on link creation.
    */
  var warning: js.UndefOr[js.Array[Schema$DynamicLinkWarning]] = js.native
}

object Schema$CreateManagedShortLinkResponse {
  @scala.inline
  def apply(
    managedShortLink: Schema$ManagedShortLink = null,
    previewLink: String = null,
    warning: js.Array[Schema$DynamicLinkWarning] = null
  ): Schema$CreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (managedShortLink != null) __obj.updateDynamic("managedShortLink")(managedShortLink.asInstanceOf[js.Any])
    if (previewLink != null) __obj.updateDynamic("previewLink")(previewLink.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateManagedShortLinkResponse]
  }
}

