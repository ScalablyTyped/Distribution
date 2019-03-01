package typings
package formidableLib.formidableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedDate: js.UndefOr[stdLib.Date] = js.undefined
  var name: java.lang.String
  var path: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  def toJSON(): js.Object
}

object File {
  @scala.inline
  def apply(
    name: java.lang.String,
    path: java.lang.String,
    size: scala.Double,
    toJSON: js.Function0[js.Object],
    `type`: java.lang.String,
    hash: java.lang.String = null,
    lastModifiedDate: stdLib.Date = null
  ): File = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("toJSON")(toJSON)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    __obj.asInstanceOf[File]
  }
}

