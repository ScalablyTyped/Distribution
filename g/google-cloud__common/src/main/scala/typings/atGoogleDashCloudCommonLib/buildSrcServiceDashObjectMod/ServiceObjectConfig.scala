package typings
package atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceObjectConfig extends js.Object {
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The method which creates this object.
    */
  var createMethod: js.UndefOr[js.Function] = js.undefined
  /**
    * The identifier of the object. For example, the name of a Storage bucket or
    * Pub/Sub topic.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
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
    baseUrl: java.lang.String = null,
    createMethod: js.Function = null,
    id: java.lang.String = null,
    methods: Methods = null
  ): ServiceObjectConfig = {
    val __obj = js.Dynamic.literal(parent = parent)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (createMethod != null) __obj.updateDynamic("createMethod")(createMethod)
    if (id != null) __obj.updateDynamic("id")(id)
    if (methods != null) __obj.updateDynamic("methods")(methods)
    __obj.asInstanceOf[ServiceObjectConfig]
  }
}

