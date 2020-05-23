package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait License extends js.Object {
  /** [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee. */
  var chargesUseFee: js.UndefOr[Boolean] = js.undefined
  /** [Output Only] Type of resource. Always compute#license for licenses. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] Name of the resource. The name is 1-63 characters long and complies with RFC1035. */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object License {
  @scala.inline
  def apply(
    chargesUseFee: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    name: String = null,
    selfLink: String = null
  ): License = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chargesUseFee)) __obj.updateDynamic("chargesUseFee")(chargesUseFee.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[License]
  }
}

