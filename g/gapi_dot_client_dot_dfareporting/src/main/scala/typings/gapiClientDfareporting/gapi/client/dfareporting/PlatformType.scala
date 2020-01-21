package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformType extends js.Object {
  /** ID of this platform type. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#platformType". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this platform type. */
  var name: js.UndefOr[String] = js.undefined
}

object PlatformType {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): PlatformType = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformType]
  }
}

