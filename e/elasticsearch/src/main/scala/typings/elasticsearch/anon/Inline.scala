package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inline extends js.Object {
  var `inline`: String
  var lang: String
}

object Inline {
  @scala.inline
  def apply(`inline`: String, lang: String): Inline = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
}

