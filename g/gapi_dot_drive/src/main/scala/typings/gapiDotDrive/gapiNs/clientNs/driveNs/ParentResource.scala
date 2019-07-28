package typings.gapiDotDrive.gapiNs.clientNs.driveNs

import typings.gapiDotDrive.gapiDotDriveStrings.`drive#parentReference`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentResource extends js.Object {
  var id: String
  var isRoot: Boolean
  var kind: `drive#parentReference`
  var parentLink: String
  var selfLink: String
}

object ParentResource {
  @scala.inline
  def apply(id: String, isRoot: Boolean, kind: `drive#parentReference`, parentLink: String, selfLink: String): ParentResource = {
    val __obj = js.Dynamic.literal(id = id, isRoot = isRoot, kind = kind, parentLink = parentLink, selfLink = selfLink)
  
    __obj.asInstanceOf[ParentResource]
  }
}

