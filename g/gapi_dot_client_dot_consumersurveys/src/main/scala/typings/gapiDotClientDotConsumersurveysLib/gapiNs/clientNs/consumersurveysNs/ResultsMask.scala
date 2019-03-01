package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsMask extends js.Object {
  var fields: js.UndefOr[js.Array[FieldMask]] = js.undefined
  var projection: js.UndefOr[java.lang.String] = js.undefined
}

object ResultsMask {
  @scala.inline
  def apply(fields: js.Array[FieldMask] = null, projection: java.lang.String = null): ResultsMask = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[ResultsMask]
  }
}

