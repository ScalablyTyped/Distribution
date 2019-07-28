package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesListResponse extends js.Object {
  /** Collection of connection types such as broadband and mobile. */
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#connectionTypesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object ConnectionTypesListResponse {
  @scala.inline
  def apply(connectionTypes: js.Array[ConnectionType] = null, kind: String = null): ConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (connectionTypes != null) __obj.updateDynamic("connectionTypes")(connectionTypes)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ConnectionTypesListResponse]
  }
}

