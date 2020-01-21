package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.undefined
}

object PlatformTypesListResponse {
  @scala.inline
  def apply(kind: String = null, platformTypes: js.Array[PlatformType] = null): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
}

