package typings.googleapis.buildSrcApisComposerV1beta1Mod.composer_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An environment for running orchestration tasks.
  */
@js.native
trait Schema$Environment extends js.Object {
  /**
    * Configuration parameters for this environment.
    */
  var config: js.UndefOr[Schema$EnvironmentConfig] = js.native
  /**
    * Output only. The time at which this environment was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optional. User-defined labels for this environment. The labels map can
    * contain no more than 64 entries. Entries of the labels map are UTF8
    * strings that comply with the following restrictions:  * Keys must conform
    * to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally
    * constrained to be &lt;= 128 bytes in size.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The resource name of the environment, in the form:
    * &quot;projects/{projectId}/locations/{locationId}/environments/{environmentId}&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The current state of the environment.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which this environment was last modified.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. The UUID (Universally Unique IDentifier) associated with
    * this environment. This value is generated when the environment is
    * created.
    */
  var uuid: js.UndefOr[String] = js.native
}

object Schema$Environment {
  @scala.inline
  def apply(
    config: Schema$EnvironmentConfig = null,
    createTime: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    state: String = null,
    updateTime: String = null,
    uuid: String = null
  ): Schema$Environment = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Environment]
  }
}

