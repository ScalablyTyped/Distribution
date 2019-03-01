package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#platformTypesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Platform type collection. */
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.undefined
}

object PlatformTypesListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, platformTypes: js.Array[PlatformType] = null): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes)
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
}

