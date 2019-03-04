package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presentation extends js.Object {
  // The layouts in the presentation. A layout is a template that determines
  // how content is arranged and styled on the slides that inherit from that
  // layout.
  var layouts: js.Array[Page]
  // The locale of the presentation, as an IETF BCP 47 language tag.
  var locale: java.lang.String
  // The slide masters in the presentation. A slide master contains all common
  // page elements and the common properties for a set of layouts. They serve
  // three purposes:
  //
  // - Placeholder shapes on a master contain the default text styles and shape
  //   properties of all placeholder shapes on pages that use that master.
  // - The master page properties define the common page properties inherited by
  //   its layouts.
  // - Any other shapes on the master slide will appear on all slides using that
  //   master, regardless of their layout.
  var masters: js.Array[Page]
  // The notes master in the presentation. It serves three purposes:
  //
  // - Placeholder shapes on a notes master contain the default text styles and
  //   shape properties of all placeholder shapes on notes pages. Specifically,
  //   a `SLIDE_IMAGE` placeholder shape contains the slide thumbnail, and a
  //   `BODY` placeholder shape contains the speaker notes.
  // - The notes master page properties define the common page properties
  //   inherited by all notes pages.
  // - Any other shapes on the notes master will appear on all notes pages.
  //
  // The notes master is read-only.
  var notes_master: Page
  // The size of pages in the presentation.
  var page_size: Size
  // The ID of the presentation.
  var presentation_id: java.lang.String
  // The revision ID of the presentation. Can be used in update requests
  // to assert that the presentation revision hasn't changed since the last
  // read operation. Only populated if the user has edit access to the
  // presentation.
  //
  // The format of the revision ID may change over time, so it should be treated
  // opaquely. A returned revision ID is only guaranteed to be valid for 24
  // hours after it has been returned and cannot be shared across users. If the
  // revision ID is unchanged between calls, then the presentation has not
  // changed. Conversely, a changed ID (for the same presentation and user)
  // usually means the presentation has been updated; however, a changed ID can
  // also be due to internal factors such as ID format changes.
  var revision_id: java.lang.String
  // The slides in the presentation.
  // A slide inherits properties from a slide layout.
  var slides: js.Array[Page]
  // The title of the presentation.
  var title: java.lang.String
}

object Presentation {
  @scala.inline
  def apply(
    layouts: js.Array[Page],
    locale: java.lang.String,
    masters: js.Array[Page],
    notes_master: Page,
    page_size: Size,
    presentation_id: java.lang.String,
    revision_id: java.lang.String,
    slides: js.Array[Page],
    title: java.lang.String
  ): Presentation = {
    val __obj = js.Dynamic.literal(layouts = layouts, locale = locale, masters = masters, notes_master = notes_master, page_size = page_size, presentation_id = presentation_id, revision_id = revision_id, slides = slides, title = title)
  
    __obj.asInstanceOf[Presentation]
  }
}

