package typings.googleapis.buildSrcApisCustomsearchV1Mod.customsearch_v1

import typings.googleapis.Anon_HeightSource
import typings.googleapis.Anon_HtmlTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Promotion extends js.Object {
  var bodyLines: js.UndefOr[js.Array[Anon_HtmlTitle]] = js.native
  var displayLink: js.UndefOr[String] = js.native
  var htmlTitle: js.UndefOr[String] = js.native
  var image: js.UndefOr[Anon_HeightSource] = js.native
  var link: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Schema$Promotion {
  @scala.inline
  def apply(
    bodyLines: js.Array[Anon_HtmlTitle] = null,
    displayLink: String = null,
    htmlTitle: String = null,
    image: Anon_HeightSource = null,
    link: String = null,
    title: String = null
  ): Schema$Promotion = {
    val __obj = js.Dynamic.literal()
    if (bodyLines != null) __obj.updateDynamic("bodyLines")(bodyLines.asInstanceOf[js.Any])
    if (displayLink != null) __obj.updateDynamic("displayLink")(displayLink.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Promotion]
  }
}

