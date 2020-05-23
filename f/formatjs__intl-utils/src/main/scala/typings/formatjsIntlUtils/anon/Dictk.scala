package typings.formatjsIntlUtils.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictk extends /* k */ StringDictionary[String] {
  var localeMatcher: String
}

object Dictk {
  @scala.inline
  def apply(localeMatcher: String, StringDictionary: /* name */ StringDictionary[String] = null): Dictk = {
    val __obj = js.Dynamic.literal(localeMatcher = localeMatcher.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictk]
  }
}

