package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The spec for modifying the path before sending the request to the matched
  * backend service.
  */
@js.native
trait SchemaUrlRewrite extends js.Object {
  /**
    * Prior to forwarding the request to the selected service, the
    * request&#39;s host header is replaced with contents of hostRewrite. The
    * value must be between 1 and 255 characters.
    */
  var hostRewrite: js.UndefOr[String] = js.native
  /**
    * Prior to forwarding the request to the selected backend service, the
    * matching portion of the request&#39;s path is replaced by
    * pathPrefixRewrite. The value must be between 1 and 1024 characters.
    */
  var pathPrefixRewrite: js.UndefOr[String] = js.native
}

object SchemaUrlRewrite {
  @scala.inline
  def apply(hostRewrite: String = null, pathPrefixRewrite: String = null): SchemaUrlRewrite = {
    val __obj = js.Dynamic.literal()
    if (hostRewrite != null) __obj.updateDynamic("hostRewrite")(hostRewrite.asInstanceOf[js.Any])
    if (pathPrefixRewrite != null) __obj.updateDynamic("pathPrefixRewrite")(pathPrefixRewrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlRewrite]
  }
}

