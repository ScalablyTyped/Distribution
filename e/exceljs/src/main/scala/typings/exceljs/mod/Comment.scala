package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var texts: js.Array[RichText]
}

object Comment {
  @scala.inline
  def apply(texts: js.Array[RichText]): Comment = {
    val __obj = js.Dynamic.literal(texts = texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

