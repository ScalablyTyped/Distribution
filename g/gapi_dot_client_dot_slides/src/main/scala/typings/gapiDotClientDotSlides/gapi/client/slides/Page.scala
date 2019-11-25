package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /** Layout specific properties. Only set if page_type = LAYOUT. */
  var layoutProperties: js.UndefOr[LayoutProperties] = js.undefined
  /** Master specific properties. Only set if page_type = MASTER. */
  var masterProperties: js.UndefOr[MasterProperties] = js.undefined
  /** Notes specific properties. Only set if page_type = NOTES. */
  var notesProperties: js.UndefOr[NotesProperties] = js.undefined
  /**
    * The object ID for this page. Object IDs used by
    * Page and
    * PageElement share the same namespace.
    */
  var objectId: js.UndefOr[String] = js.undefined
  /** The page elements rendered on the page. */
  var pageElements: js.UndefOr[js.Array[PageElement]] = js.undefined
  /** The properties of the page. */
  var pageProperties: js.UndefOr[PageProperties] = js.undefined
  /** The type of the page. */
  var pageType: js.UndefOr[String] = js.undefined
  /**
    * The revision ID of the presentation containing this page. Can be used in
    * update requests to assert that the presentation revision hasn't changed
    * since the last read operation. Only populated if the user has edit access
    * to the presentation.
    *
    * The format of the revision ID may change over time, so it should be treated
    * opaquely. A returned revision ID is only guaranteed to be valid for 24
    * hours after it has been returned and cannot be shared across users. If the
    * revision ID is unchanged between calls, then the presentation has not
    * changed. Conversely, a changed ID (for the same presentation and user)
    * usually means the presentation has been updated; however, a changed ID can
    * also be due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  /** Slide specific properties. Only set if page_type = SLIDE. */
  var slideProperties: js.UndefOr[SlideProperties] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    layoutProperties: LayoutProperties = null,
    masterProperties: MasterProperties = null,
    notesProperties: NotesProperties = null,
    objectId: String = null,
    pageElements: js.Array[PageElement] = null,
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

