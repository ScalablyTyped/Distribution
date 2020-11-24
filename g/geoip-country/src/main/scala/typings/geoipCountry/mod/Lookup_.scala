package typings.geoipCountry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lookup_ extends js.Object {
  
  /** 2 letter ISO-3166-1 country code https://www.iban.com/country-codes */
  var country: String = js.native
  
  /** [ <low bound of IP block>, <high bound of IP block> ] */
  var range: js.Tuple2[Double, Double] = js.native
}
object Lookup_ {
  
  @scala.inline
  def apply(country: String, range: js.Tuple2[Double, Double]): Lookup_ = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lookup_]
  }
  
  @scala.inline
  implicit class Lookup_Ops[Self <: Lookup_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Tuple2[Double, Double]): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
