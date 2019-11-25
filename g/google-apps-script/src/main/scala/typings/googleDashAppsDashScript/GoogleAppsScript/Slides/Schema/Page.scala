package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var layoutProperties: js.UndefOr[LayoutProperties] = js.undefined
  var masterProperties: js.UndefOr[MasterProperties] = js.undefined
  var notesProperties: js.UndefOr[NotesProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var pageElements: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.PageElement]
  ] = js.undefined
  var pageProperties: js.UndefOr[PageProperties] = js.undefined
  var pageType: js.UndefOr[String] = js.undefined
  var revisionId: js.UndefOr[String] = js.undefined
  var slideProperties: js.UndefOr[SlideProperties] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    layoutProperties: LayoutProperties = null,
    masterProperties: MasterProperties = null,
    notesProperties: NotesProperties = null,
    objectId: String = null,
    pageElements: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.PageElement] = null,
    pageProperties: PageProperties = null,
    pageType: String = null,
    revisionId: String = null,
    slideProperties: SlideProperties = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    if (layoutProperties != null) __obj.updateDynamic("layoutProperties")(layoutProperties.asInstanceOf[js.Any])
    if (masterProperties != null) __obj.updateDynamic("masterProperties")(masterProperties.asInstanceOf[js.Any])
    if (notesProperties != null) __obj.updateDynamic("notesProperties")(notesProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (pageElements != null) __obj.updateDynamic("pageElements")(pageElements.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    if (pageType != null) __obj.updateDynamic("pageType")(pageType.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (slideProperties != null) __obj.updateDynamic("slideProperties")(slideProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

