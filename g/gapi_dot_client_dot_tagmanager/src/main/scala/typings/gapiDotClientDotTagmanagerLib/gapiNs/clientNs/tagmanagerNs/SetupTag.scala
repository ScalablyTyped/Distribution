package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetupTag extends js.Object {
  /** If true, fire the main tag if and only if the setup tag fires successfully. If false, fire the main tag regardless of setup tag firing status. */
  var stopOnSetupFailure: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the setup tag. */
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

