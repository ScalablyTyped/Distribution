package typings.gapiClientAppstate.gapi.client.appstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  /** The version of the data for this key on the server. */
  var currentStateVersion: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#writeResult. */
  var kind: js.UndefOr[String] = js.undefined
  /** The written key. */
  var stateKey: js.UndefOr[Double] = js.undefined
}

object WriteResult {
  @scala.inline
  def apply(
    currentStateVersion: String = null,
    kind: String = null,
    stateKey: js.UndefOr[Double] = js.undefined
  ): WriteResult = {
    val __obj = js.Dynamic.literal()
    if (currentStateVersion != null) __obj.updateDynamic("currentStateVersion")(currentStateVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(stateKey)) __obj.updateDynamic("stateKey")(stateKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
}

