package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource type supported by Deployment Manager.
  */
@js.native
trait Schema$Type extends js.Object {
  /**
    * Base Type (configurable service) that backs this Type.
    */
  var base: js.UndefOr[Schema$BaseType] = js.native
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Map of labels; provided by the client when the resource is created or
    * updated. Specifically: Label keys must be between 1 and 63 characters
    * long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[Schema$TypeLabelEntry]] = js.native
  /**
    * Name of the type.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this type.
    */
  var operation: js.UndefOr[Schema$Operation] = js.native
  /**
    * Output only. Server defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$Type {
  @scala.inline
  def apply(
    base: Schema$BaseType = null,
    description: String = null,
    id: String = null,
    insertTime: String = null,
    labels: js.Array[Schema$TypeLabelEntry] = null,
    name: String = null,
    operation: Schema$Operation = null,
    selfLink: String = null
  ): Schema$Type = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Type]
  }
}

