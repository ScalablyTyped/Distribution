package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResponse extends js.Object {
  /** The current app state version. */
  var currentStateVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The requested data. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#getResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The key for the data. */
  var stateKey: js.UndefOr[scala.Double] = js.undefined
}

object GetResponse {
  @scala.inline
  def apply(
    currentStateVersion: java.lang.String = null,
    data: java.lang.String = null,
    kind: java.lang.String = null,
    stateKey: scala.Int | scala.Double = null
  ): GetResponse = {
    val __obj = js.Dynamic.literal()
    if (currentStateVersion != null) __obj.updateDynamic("currentStateVersion")(currentStateVersion)
    if (data != null) __obj.updateDynamic("data")(data)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponse]
  }
}

