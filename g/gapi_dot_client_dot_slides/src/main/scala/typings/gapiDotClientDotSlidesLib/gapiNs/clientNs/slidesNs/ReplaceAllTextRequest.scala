package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReplaceAllTextRequest extends js.Object {
  /** Finds text in a shape matching this substring. */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  /**
               * If non-empty, limits the matches to page elements only on the given pages.
               *
               * Returns a 400 bad request error if given the page object ID of a
               * notes master,
               * or if a page with that object ID doesn't exist in the presentation.
               */
  var pageObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The text that will replace the matched text. */
  var replaceText: js.UndefOr[java.lang.String] = js.undefined
}

