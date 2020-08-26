package typings.googleCloudCommon.serviceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceObjectConfig extends js.Object {
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * The method which creates this object.
    */
  var createMethod: js.UndefOr[js.Function] = js.native
  /**
    * The identifier of the object. For example, the name of a Storage bucket or
    * Pub/Sub topic.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of each method name that should be inherited.
    */
  var methods: js.UndefOr[Methods] = js.native
  /**
    * The parent service instance. For example, an instance of Storage if the
    * object is Bucket.
    */
  var parent: ServiceObjectParent = js.native
  /**
    * For long running operations, how often should the client poll
    * for completion.
    */
  var pollIntervalMs: js.UndefOr[Double] = js.native
}

object ServiceObjectConfig {
  @scala.inline
  def apply(parent: ServiceObjectParent): ServiceObjectConfig = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceObjectConfig]
  }
  @scala.inline
  implicit class ServiceObjectConfigOps[Self <: ServiceObjectConfig] (val x: Self) extends AnyVal {
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
    def setParent(value: ServiceObjectParent): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setCreateMethod(value: js.Function): Self = this.set("createMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateMethod: Self = this.set("createMethod", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMethods(value: Methods): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setPollIntervalMs(value: Double): Self = this.set("pollIntervalMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollIntervalMs: Self = this.set("pollIntervalMs", js.undefined)
  }
  
}

