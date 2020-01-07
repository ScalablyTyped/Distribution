package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource representing a script project version. A version is a
  * &quot;snapshot&quot; of a script project and is similar to a read-only
  * branched release. When creating deployments, the version to use must be
  * specified.
  */
@js.native
trait Schema$Version extends js.Object {
  /**
    * When the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The description for this version.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * The incremental ID that is created by Apps Script when a version is
    * created. This is system assigned number and is immutable once created.
    */
  var versionNumber: js.UndefOr[Double] = js.native
}

object Schema$Version {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    scriptId: String = null,
    versionNumber: Int | Double = null
  ): Schema$Version = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId.asInstanceOf[js.Any])
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Version]
  }
}

