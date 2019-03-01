package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  /** The version of the data for this key on the server. */
  var currentStateVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#writeResult. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The written key. */
  var stateKey: js.UndefOr[scala.Double] = js.undefined
}

object WriteResult {
  @scala.inline
  def apply(
    currentStateVersion: java.lang.String = null,
    kind: java.lang.String = null,
    stateKey: scala.Int | scala.Double = null
  ): WriteResult = {
    val __obj = js.Dynamic.literal()
    if (currentStateVersion != null) __obj.updateDynamic("currentStateVersion")(currentStateVersion)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
}

