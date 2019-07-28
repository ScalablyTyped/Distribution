package typings.gapiDotDrive.gapiNs.clientNs.driveNs

import typings.gapiDotDrive.gapiDotDriveStrings.`drive#generatedIds`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdsResource extends js.Object {
  var ids: js.Array[String]
  var kind: `drive#generatedIds`
  var space: String
}

object IdsResource {
  @scala.inline
  def apply(ids: js.Array[String], kind: `drive#generatedIds`, space: String): IdsResource = {
    val __obj = js.Dynamic.literal(ids = ids, kind = kind, space = space)
  
    __obj.asInstanceOf[IdsResource]
  }
}

