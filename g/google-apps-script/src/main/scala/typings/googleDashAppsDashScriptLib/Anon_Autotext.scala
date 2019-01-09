package typings
package googleDashAppsDashScriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autotext extends js.Object {
  // A TextElement representing a spot in the text that is dynamically
  // replaced with content that can change over time.
  var auto_text: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.AutoText
  // A marker representing the beginning of a new paragraph.
  //
  // The `start_index` and `end_index` of this TextElement represent the
  // range of the paragraph. Other TextElements with an index range contained
  // inside this paragraph's range are considered to be part of this
  // paragraph. The range of indices of two separate paragraphs will never
  // overlap.
  var paragraph_marker: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphMarker
  // A TextElement representing a run of text where all of the characters
  // in the run have the same TextStyle.
  //
  // The `start_index` and `end_index` of TextRuns will always be fully
  // contained in the index range of a single `paragraph_marker` TextElement.
  // In other words, a TextRun will never span multiple paragraphs.
  var text_run: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.TextRun
}

