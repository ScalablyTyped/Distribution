package typings.googleMapsReact.mod

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
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (LoadingContainer != null) __obj.updateDynamic("LoadingContainer")(LoadingContainer.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (libraries != null) __obj.updateDynamic("libraries")(libraries.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOptions]
  }
}

