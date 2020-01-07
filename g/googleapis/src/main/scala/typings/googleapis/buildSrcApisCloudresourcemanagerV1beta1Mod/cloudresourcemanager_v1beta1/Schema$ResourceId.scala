package typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container to reference an id for any resource type. A `resource` in
  * Google Cloud Platform is a generic term for something you (a developer) may
  * want to interact with through one of our API&#39;s. Some examples are an
  * App Engine app, a Compute Engine instance, a Cloud SQL database, and so on.
  */
@js.native
trait Schema$ResourceId extends js.Object {
  /**
    * Required field for the type-specific id. This should correspond to the id
    * used in the type-specific API&#39;s.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Required field representing the resource type this id is for. At present,
    * the valid types are &quot;project&quot;, &quot;folder&quot;, and
    * &quot;organization&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ResourceId {
  @scala.inline
  def apply(id: String = null, `type`: String = null): Schema$ResourceId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceId]
  }
}

