package typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceObjectConfig extends js.Object {
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * The method which creates this object.
    */
  var createMethod: js.UndefOr[js.Function] = js.undefined
  /**
    * The identifier of the object. For example, the name of a Storage bucket or
    * Pub/Sub topic.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A map of each method name that should be inherited.
    */
  var methods: js.UndefOr[Methods] = js.undefined
  /**
    * The parent service instance. For example, an instance of Storage if the
    * object is Bucket.
    */
  var parent: ServiceObjectParent
}

object ServiceObjectConfig {
  @scala.inline
  def apply(
    parent: ServiceObjectParent,
    baseUrl: String = null,
    createMethod: js.Function = null,
    id: String = null,
    methods: Methods = null
  ): ServiceObjectConfig = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (createMethod != null) __obj.updateDynamic("createMethod")(createMethod.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceObjectConfig]
  }
}

