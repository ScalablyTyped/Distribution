package typings.googleDashMapsDashReact.googleDashMapsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiOptions extends js.Object {
  var LoadingContainer: js.UndefOr[js.Any] = js.undefined
  var apiKey: String
  var client: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var libraries: js.UndefOr[js.Array[String]] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object GoogleApiOptions {
  @scala.inline
  def apply(
    apiKey: String,
    LoadingContainer: js.Any = null,
    client: String = null,
    language: String = null,
    libraries: js.Array[String] = null,
    region: String = null,
    url: String = null,
    version: String = null
  ): GoogleApiOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
    if (LoadingContainer != null) __obj.updateDynamic("LoadingContainer")(LoadingContainer)
    if (client != null) __obj.updateDynamic("client")(client)
    if (language != null) __obj.updateDynamic("language")(language)
    if (libraries != null) __obj.updateDynamic("libraries")(libraries)
    if (region != null) __obj.updateDynamic("region")(region)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GoogleApiOptions]
  }
}

