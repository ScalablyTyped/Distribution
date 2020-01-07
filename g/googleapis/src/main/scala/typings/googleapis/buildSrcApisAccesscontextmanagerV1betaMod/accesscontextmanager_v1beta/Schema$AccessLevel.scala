package typings.googleapis.buildSrcApisAccesscontextmanagerV1betaMod.accesscontextmanager_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `AccessLevel` is a label that can be applied to requests to GCP
  * services, along with a list of requirements necessary for the label to be
  * applied.
  */
@js.native
trait Schema$AccessLevel extends js.Object {
  /**
    * A `BasicLevel` composed of `Conditions`.
    */
  var basic: js.UndefOr[Schema$BasicLevel] = js.native
  /**
    * Output only. Time the `AccessLevel` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Description of the `AccessLevel` and its use. Does not affect behavior.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. Resource name for the Access Level. The `short_name` component
    * must begin with a letter and only include alphanumeric and &#39;_&#39;.
    * Format: `accessPolicies/{policy_id}/accessLevels/{short_name}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. Time the `AccessLevel` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$AccessLevel {
  @scala.inline
  def apply(
    basic: Schema$BasicLevel = null,
    createTime: String = null,
    description: String = null,
    name: String = null,
    title: String = null,
    updateTime: String = null
  ): Schema$AccessLevel = {
    val __obj = js.Dynamic.literal()
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccessLevel]
  }
}

