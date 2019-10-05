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
    if (layoutProperties != null) __obj.updateDynamic("layoutProperties")(layoutProperties)
    if (masterProperties != null) __obj.updateDynamic("masterProperties")(masterProperties)
    if (notesProperties != null) __obj.updateDynamic("notesProperties")(notesProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (pageElements != null) __obj.updateDynamic("pageElements")(pageElements)
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties)
    if (pageType != null) __obj.updateDynamic("pageType")(pageType)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (slideProperties != null) __obj.updateDynamic("slideProperties")(slideProperties)
    __obj.asInstanceOf[Page]
  }
}

