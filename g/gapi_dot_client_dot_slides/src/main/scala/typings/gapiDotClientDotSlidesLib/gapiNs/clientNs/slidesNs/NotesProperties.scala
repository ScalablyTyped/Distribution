package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotesProperties extends js.Object {
  /**
               * The object ID of the shape on this notes page that contains the speaker
               * notes for the corresponding slide.
               * The actual shape may not always exist on the notes page. Inserting text
               * using this object ID will automatically create the shape. In this case, the
               * actual shape may have different object ID. The `GetPresentation` or
               * `GetPage` action will always return the latest object ID.
               */
  var speakerNotesObjectId: js.UndefOr[java.lang.String] = js.undefined
}

