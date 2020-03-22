package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  projectId ? :string | number,   groupId ? :string | number} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait projectIdstringnumbergrou
  extends /* key */ StringDictionary[js.Any] {
  var groupId: js.UndefOr[String | Double] = js.undefined
  var projectId: js.UndefOr[String | Double] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object projectIdstringnumbergrou {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    groupId: String | Double = null,
    projectId: String | Double = null,
    sudo: String | Double = null
  ): projectIdstringnumbergrou = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[projectIdstringnumbergrou]
  }
}

