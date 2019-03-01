package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentResource extends js.Object {
  var id: java.lang.String
  var isRoot: scala.Boolean
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#parentReference`
  var parentLink: java.lang.String
  var selfLink: java.lang.String
}

object ParentResource {
  @scala.inline
  def apply(
    id: java.lang.String,
    isRoot: scala.Boolean,
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#parentReference`,
    parentLink: java.lang.String,
    selfLink: java.lang.String
  ): ParentResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isRoot")(isRoot)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("parentLink")(parentLink)
    __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ParentResource]
  }
}

