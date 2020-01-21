package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enterprise signup URL.
  */
@js.native
trait SchemaSignupUrl extends js.Object {
  /**
    * The name of the resource. Use this value in the signupUrl field when
    * calling enterprises.create to complete the enterprise signup flow.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A URL where an enterprise admin can register their enterprise. The page
    * can&#39;t be rendered in an iframe.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaSignupUrl {
  @scala.inline
  def apply(name: String = null, url: String = null): SchemaSignupUrl = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignupUrl]
  }
}

