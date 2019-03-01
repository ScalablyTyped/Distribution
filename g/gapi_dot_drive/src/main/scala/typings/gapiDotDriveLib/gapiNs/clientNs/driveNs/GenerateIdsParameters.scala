package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateIdsParameters extends js.Object {
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var space: js.UndefOr[java.lang.String] = js.undefined
}

object GenerateIdsParameters {
  @scala.inline
  def apply(maxResults: scala.Int | scala.Double = null, space: java.lang.String = null): GenerateIdsParameters = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[GenerateIdsParameters]
  }
}

