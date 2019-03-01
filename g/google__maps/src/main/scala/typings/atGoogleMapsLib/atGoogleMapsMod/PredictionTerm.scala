package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictionTerm extends js.Object {
  /** start position of this term in the description, measured in Unicode characters. */
  var offset: scala.Double
  /** containing the text of the term. */
  var value: java.lang.String
}

object PredictionTerm {
  @scala.inline
  def apply(offset: scala.Double, value: java.lang.String): PredictionTerm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PredictionTerm]
  }
}

