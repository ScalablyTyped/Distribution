package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//// FILE: requests.proto ////
//// FILE: slides.proto ////
// GetPage, CreatePresentation, BatchUpdatePresentation, GetPageThumbnail are not used.
// TODO export top level methods
//// FILE: text.proto ////
// A TextElement describes the content of a range of indices in the text content
// of a Shape or TableCell.
trait TextElement extends js.Object {
  // The zero-based end index of this text element, exclusive, in Unicode code
  // units.
  var end_index: scala.Double
  // The kind of text that this element represents.
  var kind: googleDashAppsDashScriptLib.Anon_Autotext
  // The zero-based start index of this text element, in Unicode code units.
  var start_index: scala.Double
}

