package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

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
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultStream)) __obj.updateDynamic("isDefaultStream")(isDefaultStream.get.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStreamSnippet]
  }
}

