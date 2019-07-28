package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsReliable extends js.Object {
  /** CLD detected language reliability */
  var isReliable: Boolean
  /** array of detectedLanguage */
  var languages: js.Array[Anon_Language]
}

object Anon_IsReliable {
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[Anon_Language]): Anon_IsReliable = {
    val __obj = js.Dynamic.literal(isReliable = isReliable, languages = languages)
  
    __obj.asInstanceOf[Anon_IsReliable]
  }
}

