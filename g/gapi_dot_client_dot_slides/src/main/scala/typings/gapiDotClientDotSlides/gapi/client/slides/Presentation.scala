package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presentation extends js.Object {
  /**
    * The layouts in the presentation. A layout is a template that determines
    * how content is arranged and styled on the slides that inherit from that
    * layout.
    */
  var layouts: js.UndefOr[js.Array[Page]] = js.undefined
  /** The locale of the presentation, as an IETF BCP 47 language tag. */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * The slide masters in the presentation. A slide master contains all common
    * page elements and the common properties for a set of layouts. They serve
    * three purposes:
    *
    * - Placeholder shapes on a master contain the default text styles and shape
    * properties of all placeholder shapes on pages that use that master.
    * - The master page properties define the common page properties inherited by
    * its layouts.
    * - Any other shapes on the master slide will appear on all slides using that
    * master, regardless of their layout.
    */
  var masters: js.UndefOr[js.Array[Page]] = js.undefined
  /**
    * The notes master in the presentation. It serves three purposes:
    *
    * - Placeholder shapes on a notes master contain the default text styles and
    * shape properties of all placeholder shapes on notes pages. Specifically,
    * a `SLIDE_IMAGE` placeholder shape contains the slide thumbnail, and a
    * `BODY` placeholder shape contains the speaker notes.
    * - The notes master page properties define the common page properties
    * inherited by all notes pages.
    * - Any other shapes on the notes master will appear on all notes pages.
    *
    * The notes master is read-only.
    */
  var notesMaster: js.UndefOr[Page] = js.undefined
  /** The size of pages in the presentation. */
  var pageSize: js.UndefOr[Size] = js.undefined
  /** The ID of the presentation. */
  var presentationId: js.UndefOr[String] = js.undefined
  /**
    * The revision ID of the presentation. Can be used in update requests
    * to assert that the presentation revision hasn't changed since the last
    * read operation. Only populated if the user has edit access to the
    * presentation.
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
  /**
    * The slides in the presentation.
    * A slide inherits properties from a slide layout.
    */
  var slides: js.UndefOr[js.Array[Page]] = js.undefined
  /** The title of the presentation. */
  var title: js.UndefOr[String] = js.undefined
}

object Presentation {
  @scala.inline
  def apply(
    layouts: js.Array[Page] = null,
    locale: String = null,
    masters: js.Array[Page] = null,
    notesMaster: Page = null,
    pageSize: Size = null,
    presentationId: String = null,
    revisionId: String = null,
    slides: js.Array[Page] = null,
    title: String = null
  ): Presentation = {
    val __obj = js.Dynamic.literal()
    if (layouts != null) __obj.updateDynamic("layouts")(layouts)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (masters != null) __obj.updateDynamic("masters")(masters)
    if (notesMaster != null) __obj.updateDynamic("notesMaster")(notesMaster)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (slides != null) __obj.updateDynamic("slides")(slides)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Presentation]
  }
}

