package typings
package fechaLib.fechaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Masks
  extends /* myMask */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var default: java.lang.String
  var fullDate: java.lang.String
  var longDate: java.lang.String
  var longTime: java.lang.String
  var mediumDate: java.lang.String
  var mediumTime: java.lang.String
  var shortDate: java.lang.String
  var shortTime: java.lang.String
}

object Masks {
  @scala.inline
  def apply(
    default: java.lang.String,
    fullDate: java.lang.String,
    longDate: java.lang.String,
    longTime: java.lang.String,
    mediumDate: java.lang.String,
    mediumTime: java.lang.String,
    shortDate: java.lang.String,
    shortTime: java.lang.String,
    StringDictionary: /* myMask */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Masks = {
    val __obj = js.Dynamic.literal(default = default, fullDate = fullDate, longDate = longDate, longTime = longTime, mediumDate = mediumDate, mediumTime = mediumTime, shortDate = shortDate, shortTime = shortTime)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Masks]
  }
}

