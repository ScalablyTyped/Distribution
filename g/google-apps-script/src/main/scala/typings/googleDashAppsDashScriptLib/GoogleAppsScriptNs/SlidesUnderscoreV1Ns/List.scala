package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A List describes the look and feel of bullets belonging to paragraphs
// associated with a list. A paragraph that is part of a list has an implicit
// reference to that list's ID.
trait List extends js.Object {
  // The ID of the list.
  var list_id: java.lang.String
  // A map of nesting levels to the properties of bullets at the associated
  // level. A list has at most nine levels of nesting, so the possible values
  // for the keys of this map are 0 through 8, inclusive.
  var nesting_level: stdLib.Map[scala.Double, NestingLevel]
}

