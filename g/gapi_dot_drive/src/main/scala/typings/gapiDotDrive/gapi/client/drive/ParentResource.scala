package typings.gapiDotDrive.gapi.client.drive

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parentLink = parentLink.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParentResource]
  }
}

