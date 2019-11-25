package typings.gapiDotClientDotAppstate.gapi.client.appstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResponse extends js.Object {
  /** The current app state version. */
  var currentStateVersion: js.UndefOr[String] = js.undefined
  /** The requested data. */
  var data: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#getResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** The key for the data. */
  var stateKey: js.UndefOr[Double] = js.undefined
}

object GetResponse {
  @scala.inline
  def apply(
    currentStateVersion: String = null,
    data: String = null,
    kind: String = null,
    stateKey: Int | Double = null
  ): GetResponse = {
    val __obj = js.Dynamic.literal()
    if (currentStateVersion != null) __obj.updateDynamic("currentStateVersion")(currentStateVersion.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponse]
  }
}

