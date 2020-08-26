package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information about the HTTP Cookie on which the hash function is based
  * for load balancing policies that use a consistent hash.
  */
@js.native
trait SchemaConsistentHashLoadBalancerSettingsHttpCookie extends js.Object {
  /**
    * Name of the cookie.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Path to set for the cookie.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Lifetime of the cookie.
    */
  var ttl: js.UndefOr[SchemaDuration] = js.native
}

object SchemaConsistentHashLoadBalancerSettingsHttpCookie {
  @scala.inline
  def apply(): SchemaConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettingsHttpCookie]
  }
  @scala.inline
  implicit class SchemaConsistentHashLoadBalancerSettingsHttpCookieOps[Self <: SchemaConsistentHashLoadBalancerSettingsHttpCookie] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTtl(value: SchemaDuration): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

