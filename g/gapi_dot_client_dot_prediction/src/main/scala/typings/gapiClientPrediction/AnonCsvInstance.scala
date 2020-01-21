package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCsvInstance extends js.Object {
  /** A list of input features, these can be strings or doubles. */
  var csvInstance: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonCsvInstance {
  @scala.inline
  def apply(csvInstance: js.Array[_] = null): AnonCsvInstance = {
    val __obj = js.Dynamic.literal()
    if (csvInstance != null) __obj.updateDynamic("csvInstance")(csvInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCsvInstance]
  }
}

