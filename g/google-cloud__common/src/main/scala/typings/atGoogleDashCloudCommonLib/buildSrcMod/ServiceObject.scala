package typings
package atGoogleDashCloudCommonLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceObject is a base class, meant to be inherited from by a "service
  * object," like a BigQuery dataset or Storage bucket.
  *
  * Most of the time, these objects share common functionality; they can be
  * created or deleted, and you can get or set their metadata.
  *
  * By inheriting from this class, a service object will be extended with these
  * shared behaviors. Note that any method can be overridden when the service
  * object requires specific behavior.
  */
@JSImport("@google-cloud/common/build/src", "ServiceObject")
@js.native
class ServiceObject[T] protected ()
  extends atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.ServiceObject[T] {
  def this(config: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.ServiceObjectConfig) = this()
}

