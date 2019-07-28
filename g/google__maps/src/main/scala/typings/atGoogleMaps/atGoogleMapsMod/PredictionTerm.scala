package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictionTerm extends js.Object {
  /** start position of this term in the description, measured in Unicode characters. */
  var offset: Double
  /** containing the text of the term. */
  var value: String
}

object PredictionTerm {
  @scala.inline
  def apply(offset: Double, value: String): PredictionTerm = {
    val __obj = js.Dynamic.literal(offset = offset, value = value)
  
    __obj.asInstanceOf[PredictionTerm]
  }
}

