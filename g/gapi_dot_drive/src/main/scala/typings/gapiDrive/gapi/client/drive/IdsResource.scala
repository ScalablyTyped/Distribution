package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.driveNumbersigngeneratedIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdsResource extends js.Object {
  var ids: js.Array[String]
  var kind: driveNumbersigngeneratedIds
  var space: String
}

object IdsResource {
  @scala.inline
  def apply(ids: js.Array[String], kind: driveNumbersigngeneratedIds, space: String): IdsResource = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdsResource]
  }
}

