package typings.gapiDotClientDotFirebaserules.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Release extends js.Object {
  /**
    * Time the release was created.
    * Output only.
    */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * Resource name for the `Release`.
    *
    * `Release` names may be structured `app1/prod/v2` or flat `app1_prod_v2`
    * which affords developers a great deal of flexibility in mapping the name
    * to the style that best fits their existing development practices. For
    * example, a name could refer to an environment, an app, a version, or some
    * combination of three.
    *
    * In the table below, for the project name `projects/foo`, the following
    * relative release paths show how flat and structured names might be chosen
    * to match a desired development / deployment strategy.
    *
    * Use Case     | Flat Name           | Structured Name
    * -------------|---------------------|----------------
    * Environments | releases/qa         | releases/qa
    * Apps         | releases/app1_qa    | releases/app1/qa
    * Versions     | releases/app1_v2_qa | releases/app1/v2/qa
    *
    * The delimiter between the release name path elements can be almost anything
    * and it should work equally well with the release name list filter, but in
    * many ways the structured paths provide a clearer picture of the
    * relationship between `Release` instances.
    *
    * Format: `projects/{project_id}/releases/{release_id}`
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must
    * exist the `Release` to be created.
    */
  var rulesetName: js.UndefOr[String] = js.undefined
  /**
    * Time the release was updated.
    * Output only.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}

object Release {
  @scala.inline
  def apply(
    createTime: String = null,
    name: String = null,
    rulesetName: String = null,
    updateTime: String = null
  ): Release = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rulesetName != null) __obj.updateDynamic("rulesetName")(rulesetName)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[Release]
  }
}

