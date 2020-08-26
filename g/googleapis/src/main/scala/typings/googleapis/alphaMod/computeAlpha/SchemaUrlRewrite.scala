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
  def apply(): SchemaUrlRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlRewrite]
  }
  @scala.inline
  implicit class SchemaUrlRewriteOps[Self <: SchemaUrlRewrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostRewrite(value: String): Self = this.set("hostRewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostRewrite: Self = this.set("hostRewrite", js.undefined)
    @scala.inline
    def setPathPrefixRewrite(value: String): Self = this.set("pathPrefixRewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathPrefixRewrite: Self = this.set("pathPrefixRewrite", js.undefined)
  }
  
}

