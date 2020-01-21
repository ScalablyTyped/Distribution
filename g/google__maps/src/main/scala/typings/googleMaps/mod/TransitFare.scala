package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitFare extends js.Object {
  /** An [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217) indicating the currency that the amount is expressed in. */
  var currency: String
  /** The total fare amount, formatted in the requested language. */
  var text: String
  /** The total fare amount, in the currency specified above. */
  var value: Double
}

object TransitFare {
  @scala.inline
  def apply(currency: String, text: String, value: Double): TransitFare = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitFare]
  }
}

