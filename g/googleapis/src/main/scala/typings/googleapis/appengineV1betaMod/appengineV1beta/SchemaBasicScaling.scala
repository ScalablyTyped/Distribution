package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service with basic scaling will create an instance when the application
  * receives a request. The instance will be turned down when the app becomes
  * idle. Basic scaling is ideal for work that is intermittent or driven by
  * user activity.
  */
@js.native
trait SchemaBasicScaling extends js.Object {
  /**
    * Duration of time after the last request that an instance must wait before
    * the instance is shut down.
    */
  var idleTimeout: js.UndefOr[String] = js.native
  /**
    * Maximum number of instances to create for this version.
    */
  var maxInstances: js.UndefOr[Double] = js.native
}

object SchemaBasicScaling {
  @scala.inline
  def apply(idleTimeout: String = null, maxInstances: Int | Double = null): SchemaBasicScaling = {
    val __obj = js.Dynamic.literal()
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicScaling]
  }
}

