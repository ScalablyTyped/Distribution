package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  var buffer: Buffer
  var extension: String
  	// image,background
  var name: String
  var `type`: String
}

object Media {
  @scala.inline
  def apply(buffer: Buffer, extension: String, name: String, `type`: String): Media = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

