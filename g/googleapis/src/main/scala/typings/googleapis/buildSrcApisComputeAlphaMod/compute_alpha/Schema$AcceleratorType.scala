package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Accelerator Type resource. (== resource_for beta.acceleratorTypes ==)
  * (== resource_for v1.acceleratorTypes ==)
  */
@js.native
trait Schema$AcceleratorType extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] The deprecation status associated with this accelerator
    * type.
    */
  var deprecated: js.UndefOr[Schema$DeprecationStatus] = js.native
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

object Schema$AcceleratorType {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    deprecated: Schema$DeprecationStatus = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    maximumCardsPerInstance: Int | Double = null,
    name: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    zone: String = null
  ): Schema$AcceleratorType = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maximumCardsPerInstance != null) __obj.updateDynamic("maximumCardsPerInstance")(maximumCardsPerInstance.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcceleratorType]
  }
}

