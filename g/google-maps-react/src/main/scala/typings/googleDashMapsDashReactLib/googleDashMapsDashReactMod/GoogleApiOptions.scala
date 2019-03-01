package typings
package googleDashMapsDashReactLib.googleDashMapsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiOptions extends js.Object {
  var LoadingContainer: js.UndefOr[js.Any] = js.undefined
  var apiKey: java.lang.String
  var client: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var libraries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleApiOptions {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    LoadingContainer: js.Any = null,
    client: java.lang.String = null,
    language: java.lang.String = null,
    libraries: js.Array[java.lang.String] = null,
    region: java.lang.String = null,
    url: java.lang.String = null,
    version: java.lang.String = null
  ): GoogleApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiKey")(apiKey)
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

