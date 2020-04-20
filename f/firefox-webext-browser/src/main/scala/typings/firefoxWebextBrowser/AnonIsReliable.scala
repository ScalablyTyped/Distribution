package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsReliable extends js.Object {
  /** CLD detected language reliability */
  var isReliable: Boolean
  /** array of detectedLanguage */
  var languages: js.Array[AnonLanguage]
}

object AnonIsReliable {
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[AnonLanguage]): AnonIsReliable = {
    val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsReliable]
  }
}

