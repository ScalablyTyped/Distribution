package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The script project resource.
  */
@js.native
trait Schema$Project extends js.Object {
  /**
    * When the script was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * User who originally created the script.
    */
  var creator: js.UndefOr[Schema$GoogleAppsScriptTypeUser] = js.native
  /**
    * User who last modified the script.
    */
  var lastModifyUser: js.UndefOr[Schema$GoogleAppsScriptTypeUser] = js.native
  /**
    * The parent&#39;s Drive ID that the script will be attached to. This is
    * usually the ID of a Google Document or Google Sheet. This filed is
    * optional, and if not set, a stand-alone script will be created.
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * When the script was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$Project {
  @scala.inline
  def apply(
    createTime: String = null,
    creator: Schema$GoogleAppsScriptTypeUser = null,
    lastModifyUser: Schema$GoogleAppsScriptTypeUser = null,
    parentId: String = null,
    scriptId: String = null,
    title: String = null,
    updateTime: String = null
  ): Schema$Project = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (lastModifyUser != null) __obj.updateDynamic("lastModifyUser")(lastModifyUser.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Project]
  }
}

