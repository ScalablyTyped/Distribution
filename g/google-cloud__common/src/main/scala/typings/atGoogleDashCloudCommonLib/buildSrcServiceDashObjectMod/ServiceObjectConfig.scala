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
  /**
       * Dependency for HTTP calls.
       */
  var requestModule: js.Any
}

