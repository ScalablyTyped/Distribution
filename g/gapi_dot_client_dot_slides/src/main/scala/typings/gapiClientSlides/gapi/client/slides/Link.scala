package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  /**
    * If set, indicates this is a link to the specific page in this
    * presentation with this ID. A page with this ID may not exist.
    */
  var pageObjectId: js.UndefOr[String] = js.undefined
  /**
    * If set, indicates this is a link to a slide in this presentation,
    * addressed by its position.
    */
  var relativeLink: js.UndefOr[String] = js.undefined
  /**
    * If set, indicates this is a link to the slide at this zero-based index
    * in the presentation. There may not be a slide at this index.
    */
  var slideIndex: js.UndefOr[Double] = js.undefined
  /** If set, indicates this is a link to the external web page at this URL. */
  var url: js.UndefOr[String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    pageObjectId: String = null,
    relativeLink: String = null,
    slideIndex: Int | Double = null,
    url: String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId.asInstanceOf[js.Any])
    if (relativeLink != null) __obj.updateDynamic("relativeLink")(relativeLink.asInstanceOf[js.Any])
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

