package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

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
trait SchemaResourceId extends js.Object {
  /**
    * Required field for the type-specific id. This should correspond to the id
    * used in the type-specific API&#39;s.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Required field representing the resource type this id is for. At present,
    * the valid types are: &quot;organization&quot; and &quot;folder&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaResourceId {
  @scala.inline
  def apply(): SchemaResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceId]
  }
  @scala.inline
  implicit class SchemaResourceIdOps[Self <: SchemaResourceId] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

