package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TargetHttpProxy resource. This resource defines an HTTP proxy. (==
  * resource_for beta.targetHttpProxies ==) (== resource_for
  * v1.targetHttpProxies ==)
  */
@js.native
trait SchemaTargetHttpProxy extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of resource. Always compute#targetHttpProxy for target
    * HTTP proxies.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * URL to the UrlMap resource that defines the mapping from URL to the
    * BackendService.
    */
  var urlMap: js.UndefOr[String] = js.native
}

object SchemaTargetHttpProxy {
  @scala.inline
  def apply(): SchemaTargetHttpProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpProxy]
  }
  @scala.inline
  implicit class SchemaTargetHttpProxyOps[Self <: SchemaTargetHttpProxy] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setUrlMap(value: String): Self = this.set("urlMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlMap: Self = this.set("urlMap", js.undefined)
  }
  
}

