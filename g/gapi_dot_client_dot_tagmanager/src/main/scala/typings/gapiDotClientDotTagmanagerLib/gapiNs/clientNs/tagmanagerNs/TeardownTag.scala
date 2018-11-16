package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TeardownTag extends js.Object {
  /** If true, fire the teardown tag if and only if the main tag fires successfully. If false, fire the teardown tag regardless of main tag firing status. */
  var stopTeardownOnFailure: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the teardown tag. */
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

