package typings.googleDashMapDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var libraries: js.UndefOr[js.Array[String] | String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object Anon_Language {
  @scala.inline
  def apply(language: String = null, libraries: js.Array[String] | String = null, region: String = null): Anon_Language = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (libraries != null) __obj.updateDynamic("libraries")(libraries.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Language]
  }
}

