package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParagraphBulletsRequest extends js.Object {
  var bulletPreset: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object CreateParagraphBulletsRequest {
  @scala.inline
  def apply(bulletPreset: String = null, range: Range = null): CreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (bulletPreset != null) __obj.updateDynamic("bulletPreset")(bulletPreset.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParagraphBulletsRequest]
  }
}

