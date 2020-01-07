package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines core attributes for a resource. A resource is an
  * addressable (named) entity provided by the destination service. For
  * example, a file stored on a network storage service.
  */
@js.native
trait Schema$Resource extends js.Object {
  /**
    * The labels or tags on the resource, such as AWS resource tags and
    * Kubernetes resource labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The stable identifier (name) of a resource on the `service`. A resource
    * can be logically identified as
    * &quot;//{resource.service}/{resource.name}&quot;. The differences between
    * a resource name and a URI are:  *   Resource name is a logical
    * identifier, independent of network     protocol and API version. For
    * example,     `//pubsub.googleapis.com/projects/123/topics/news-feed`. *
    * URI often includes protocol and version information, so it can     be
    * used directly by applications. For example,
    * `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`.  See
    * https://cloud.google.com/apis/design/resource_names for details.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the service that this resource belongs to, such as
    * `pubsub.googleapis.com`. The service may be different from the DNS
    * hostname that actually serves the request.
    */
  var service: js.UndefOr[String] = js.native
  /**
    * The type of the resource. The scheme is platform-specific because
    * different platforms define their resources differently.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Resource {
  @scala.inline
  def apply(
    labels: StringDictionary[String] = null,
    name: String = null,
    service: String = null,
    `type`: String = null
  ): Schema$Resource = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Resource]
  }
}

