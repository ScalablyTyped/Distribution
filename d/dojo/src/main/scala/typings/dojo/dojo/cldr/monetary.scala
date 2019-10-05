package typings.dojo.dojo.cldr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/cldr/monetary.html
  *
  * TODOC
  *
  */
trait monetary extends js.Object {
  /**
    * A mapping of currency code to currency-specific formatting information. Returns a unique object with properties: places, round.
    *
    * @param code an ISO 4217 currency code
    */
  def getData(code: String): js.Object
}

object monetary {
  @scala.inline
  def apply(getData: String => js.Object): monetary = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction1(getData))
  
    __obj.asInstanceOf[monetary]
  }
}

