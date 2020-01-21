package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHealthStatus extends js.Object {
  /**
    * Metadata defined as annotations for network endpoint.
    */
  var annotations: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Health state of the instance.
    */
  var healthState: js.UndefOr[String] = js.native
  /**
    * URL of the instance resource.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The IP address represented by this resource.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The port on the instance.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaHealthStatus {
  @scala.inline
  def apply(
    annotations: StringDictionary[String] = null,
    healthState: String = null,
    instance: String = null,
    ipAddress: String = null,
    port: Int | Double = null
  ): SchemaHealthStatus = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (healthState != null) __obj.updateDynamic("healthState")(healthState.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHealthStatus]
  }
}

