package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection Type List Response
  */
@js.native
trait Schema$ConnectionTypesListResponse extends js.Object {
  /**
    * Collection of connection types such as broadband and mobile.
    */
  var connectionTypes: js.UndefOr[js.Array[Schema$ConnectionType]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#connectionTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ConnectionTypesListResponse {
  @scala.inline
  def apply(connectionTypes: js.Array[Schema$ConnectionType] = null, kind: String = null): Schema$ConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (connectionTypes != null) __obj.updateDynamic("connectionTypes")(connectionTypes.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConnectionTypesListResponse]
  }
}

