package typings.gapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClientCustomsearch.AnonHeight
import typings.gapiClientCustomsearch.AnonHtmlTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promotion extends js.Object {
  var bodyLines: js.UndefOr[js.Array[AnonHtmlTitle]] = js.undefined
  var displayLink: js.UndefOr[String] = js.undefined
  var htmlTitle: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[AnonHeight] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Promotion {
  @scala.inline
  def apply(
    bodyLines: js.Array[AnonHtmlTitle] = null,
    displayLink: String = null,
    htmlTitle: String = null,
    image: AnonHeight = null,
    link: String = null,
    title: String = null
  ): Promotion = {
    val __obj = js.Dynamic.literal()
    if (bodyLines != null) __obj.updateDynamic("bodyLines")(bodyLines.asInstanceOf[js.Any])
    if (displayLink != null) __obj.updateDynamic("displayLink")(displayLink.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promotion]
  }
}

