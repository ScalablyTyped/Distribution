package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Accelerator Type resource. (== resource_for beta.acceleratorTypes ==)
  * (== resource_for v1.acceleratorTypes ==)
  */
@js.native
trait SchemaAcceleratorType extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] The deprecation status associated with this accelerator
    * type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.native
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The type of the resource. Always compute#acceleratorType
    * for accelerator types.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Maximum accelerator cards allowed per instance.
    */
  var maximumCardsPerInstance: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource&#39;s resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The name of the zone where the accelerator type resides,
    * such as us-central1-a. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaAcceleratorType {
  @scala.inline
  def apply(): SchemaAcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorType]
  }
  @scala.inline
  implicit class SchemaAcceleratorTypeOps[Self <: SchemaAcceleratorType] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDeprecated(value: SchemaDeprecationStatus): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaximumCardsPerInstance(value: Double): Self = this.set("maximumCardsPerInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumCardsPerInstance: Self = this.set("maximumCardsPerInstance", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSelfLinkWithId(value: String): Self = this.set("selfLinkWithId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLinkWithId: Self = this.set("selfLinkWithId", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

