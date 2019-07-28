package typings.formidable.formidableMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var lastModifiedDate: js.UndefOr[Date] = js.undefined
  var name: String
  var path: String
  var size: Double
  var `type`: String
  def toJSON(): js.Object
}

object File {
  @scala.inline
  def apply(
    name: String,
    path: String,
    size: Double,
    toJSON: () => js.Object,
    `type`: String,
    hash: String = null,
    lastModifiedDate: Date = null
  ): File = {
    val __obj = js.Dynamic.literal(name = name, path = path, size = size, toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    __obj.asInstanceOf[File]
  }
}

