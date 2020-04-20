package typings.geodesy.latlonEllipsoidalReferenceframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TxParam extends js.Object {
  var epoch: String
  var params: js.Tuple6[Double, Double, Double, Double, Double, Double]
  var rates: js.Tuple6[Double, Double, Double, Double, Double, Double]
}

object TxParam {
  @scala.inline
  def apply(
    epoch: String,
    params: js.Tuple6[Double, Double, Double, Double, Double, Double],
    rates: js.Tuple6[Double, Double, Double, Double, Double, Double]
  ): TxParam = {
    val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxParam]
  }
}

