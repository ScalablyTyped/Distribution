package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ServicePerimeterConfig` specifies a set of GCP resources that describe
  * specific Service Perimeter configuration.
  */
@js.native
trait SchemaServicePerimeterConfig extends js.Object {
  /**
    * A list of `AccessLevel` resource names that allow resources within the
    * `ServicePerimeter` to be accessed from the internet. `AccessLevels`
    * listed must be in the same policy as this `ServicePerimeter`. Referencing
    * a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names
    * are listed, resources within the perimeter can only be accessed via GCP
    * calls with request origins within the perimeter. Example:
    * `&quot;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&quot;`. For Service
    * Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of GCP resources that are inside of the service perimeter.
    * Currently only projects are allowed. Format: `projects/{project_number}`
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /**
    * GCP services that are subject to the Service Perimeter restrictions. For
    * example, if `storage.googleapis.com` is specified, access to the storage
    * buckets inside the perimeter must meet the perimeter&#39;s access
    * restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String]] = js.native
}

object SchemaServicePerimeterConfig {
  @scala.inline
  def apply(): SchemaServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeterConfig]
  }
  @scala.inline
  implicit class SchemaServicePerimeterConfigOps[Self <: SchemaServicePerimeterConfig] (val x: Self) extends AnyVal {
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
    def setAccessLevelsVarargs(value: String*): Self = this.set("accessLevels", js.Array(value :_*))
    @scala.inline
    def setAccessLevels(value: js.Array[String]): Self = this.set("accessLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLevels: Self = this.set("accessLevels", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRestrictedServicesVarargs(value: String*): Self = this.set("restrictedServices", js.Array(value :_*))
    @scala.inline
    def setRestrictedServices(value: js.Array[String]): Self = this.set("restrictedServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictedServices: Self = this.set("restrictedServices", js.undefined)
  }
  
}

