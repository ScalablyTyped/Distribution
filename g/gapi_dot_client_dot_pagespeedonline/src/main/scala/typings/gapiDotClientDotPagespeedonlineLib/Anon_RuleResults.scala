package typings
package gapiDotClientDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_RuleResults extends js.Object {
  /** The locale of the formattedResults, e.g. "en_US". */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server. */
  var ruleResults: js.UndefOr[stdLib.Record[java.lang.String, Anon_LocalizedRuleName]] = js.undefined
}

