package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarCodeTypes extends js.Object {
  var barCodeTypes: js.UndefOr[js.Array[String | Double]] = js.undefined
}

object Anon_BarCodeTypes {
  @scala.inline
  def apply(barCodeTypes: js.Array[String | Double] = null): Anon_BarCodeTypes = {
    val __obj = js.Dynamic.literal()
    if (barCodeTypes != null) __obj.updateDynamic("barCodeTypes")(barCodeTypes)
    __obj.asInstanceOf[Anon_BarCodeTypes]
  }
}

