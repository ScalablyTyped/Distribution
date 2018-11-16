package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetReleaseExecutableResponse extends js.Object {
  /** Executable view of the `Ruleset` referenced by the `Release`. */
  var executable: js.UndefOr[java.lang.String] = js.undefined
  /** The Rules runtime version of the executable. */
  var executableVersion: js.UndefOr[java.lang.String] = js.undefined
  /** `Language` used to generate the executable bytes. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** `Ruleset` name associated with the `Release` executable. */
  var rulesetName: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp for the most recent `Release.update_time`. */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

