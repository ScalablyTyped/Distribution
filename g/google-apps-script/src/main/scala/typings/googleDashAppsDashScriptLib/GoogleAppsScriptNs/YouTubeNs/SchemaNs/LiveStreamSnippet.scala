package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamSnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isDefaultStream: js.UndefOr[scala.Boolean] = js.undefined
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object LiveStreamSnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    description: java.lang.String = null,
    isDefaultStream: js.UndefOr[scala.Boolean] = js.undefined,
    publishedAt: java.lang.String = null,
    title: java.lang.String = null
  ): LiveStreamSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isDefaultStream)) __obj.updateDynamic("isDefaultStream")(isDefaultStream)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LiveStreamSnippet]
  }
}

