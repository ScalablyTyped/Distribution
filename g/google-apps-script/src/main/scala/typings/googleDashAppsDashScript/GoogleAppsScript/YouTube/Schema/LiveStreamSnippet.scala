package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var isDefaultStream: js.UndefOr[Boolean] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object LiveStreamSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    description: String = null,
    isDefaultStream: js.UndefOr[Boolean] = js.undefined,
    publishedAt: String = null,
    title: String = null
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

