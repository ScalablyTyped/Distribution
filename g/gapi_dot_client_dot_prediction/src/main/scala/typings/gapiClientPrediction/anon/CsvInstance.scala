package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvInstance extends js.Object {
  /** A list of input features, these can be strings or doubles. */
  var csvInstance: js.UndefOr[js.Array[_]] = js.undefined
}

object CsvInstance {
  @scala.inline
  def apply(csvInstance: js.Array[_] = null): CsvInstance = {
    val __obj = js.Dynamic.literal()
    if (csvInstance != null) __obj.updateDynamic("csvInstance")(csvInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvInstance]
  }
}

