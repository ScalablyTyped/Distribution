package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

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
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The page elements rendered on the page. */
  var pageElements: js.UndefOr[js.Array[PageElement]] = js.undefined
  /** The properties of the page. */
  var pageProperties: js.UndefOr[PageProperties] = js.undefined
  /** The type of the page. */
  var pageType: js.UndefOr[java.lang.String] = js.undefined
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
  var revisionId: js.UndefOr[java.lang.String] = js.undefined
  /** Slide specific properties. Only set if page_type = SLIDE. */
  var slideProperties: js.UndefOr[SlideProperties] = js.undefined
}

