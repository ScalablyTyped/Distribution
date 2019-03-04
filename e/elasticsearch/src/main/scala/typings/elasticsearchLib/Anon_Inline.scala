package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inline extends js.Object {
  var `inline`: java.lang.String
  var lang: java.lang.String
}

object Anon_Inline {
  @scala.inline
  def apply(`inline`: java.lang.String, lang: java.lang.String): Anon_Inline = {
    val __obj = js.Dynamic.literal(lang = lang)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_Inline]
  }
}

