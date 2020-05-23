package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsReliable extends js.Object {
  /** CLD detected language reliability */
  var isReliable: Boolean
  /** array of detectedLanguage */
  var languages: js.Array[Language]
}

object IsReliable {
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[Language]): IsReliable = {
    val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReliable]
  }
}

