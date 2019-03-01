package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CsvInstance extends js.Object {
  /** A list of input features, these can be strings or doubles. */
  var csvInstance: js.UndefOr[js.Array[_]] = js.undefined
}

object Anon_CsvInstance {
  @scala.inline
  def apply(csvInstance: js.Array[_] = null): Anon_CsvInstance = {
    val __obj = js.Dynamic.literal()
    if (csvInstance != null) __obj.updateDynamic("csvInstance")(csvInstance)
    __obj.asInstanceOf[Anon_CsvInstance]
  }
}

