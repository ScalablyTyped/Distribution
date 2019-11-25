package typings.fecha.fechaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Masks extends /* myMask */ StringDictionary[String] {
  var default: String
  var fullDate: String
  var longDate: String
  var longTime: String
  var mediumDate: String
  var mediumTime: String
  var shortDate: String
  var shortTime: String
}

object Masks {
  @scala.inline
  def apply(
    default: String,
    fullDate: String,
    longDate: String,
    longTime: String,
    mediumDate: String,
    mediumTime: String,
    shortDate: String,
    shortTime: String,
    StringDictionary: /* myMask */ StringDictionary[String] = null
  ): Masks = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Masks]
  }
}

