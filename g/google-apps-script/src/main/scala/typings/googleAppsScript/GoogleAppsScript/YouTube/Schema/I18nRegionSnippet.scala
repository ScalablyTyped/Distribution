package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionSnippet extends js.Object {
  var gl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object I18nRegionSnippet {
  @scala.inline
  def apply(gl: String = null, name: String = null): I18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nRegionSnippet]
  }
}

