package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdsResource extends js.Object {
  var ids: js.Array[java.lang.String]
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#generatedIds`
  var space: java.lang.String
}

object IdsResource {
  @scala.inline
  def apply(
    ids: js.Array[java.lang.String],
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#generatedIds`,
    space: java.lang.String
  ): IdsResource = {
    val __obj = js.Dynamic.literal(ids = ids, kind = kind, space = space)
  
    __obj.asInstanceOf[IdsResource]
  }
}

