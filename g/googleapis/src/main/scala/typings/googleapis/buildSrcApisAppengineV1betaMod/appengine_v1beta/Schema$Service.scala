package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Service resource is a logical component of an application that can share
  * state and communicate in a secure fashion with other services. For example,
  * an application that handles customer requests might include separate
  * services to handle tasks such as backend data analysis or API requests from
  * mobile devices. Each service has a collection of versions that define a
  * specific set of code used to implement the functionality of that service.
  */
@js.native
trait Schema$Service extends js.Object {
  /**
    * Relative name of the service within the application. Example:
    * default.@OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Full path to the Service resource in the API. Example:
    * apps/myapp/services/default.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Mapping that defines fractional HTTP traffic diversion to different
    * versions within the service.
    */
  var split: js.UndefOr[Schema$TrafficSplit] = js.native
}

object Schema$Service {
  @scala.inline
  def apply(id: String = null, name: String = null, split: Schema$TrafficSplit = null): Schema$Service = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Service]
  }
}

