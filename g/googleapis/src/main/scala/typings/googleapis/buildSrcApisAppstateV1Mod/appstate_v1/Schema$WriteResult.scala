package typings.googleapis.buildSrcApisAppstateV1Mod.appstate_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an app state write result.
  */
@js.native
trait Schema$WriteResult extends js.Object {
  /**
    * The version of the data for this key on the server.
    */
  var currentStateVersion: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string appstate#writeResult.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The written key.
    */
  var stateKey: js.UndefOr[Double] = js.native
}

object Schema$WriteResult {
  @scala.inline
  def apply(currentStateVersion: String = null, kind: String = null, stateKey: Int | Double = null): Schema$WriteResult = {
    val __obj = js.Dynamic.literal()
    if (currentStateVersion != null) __obj.updateDynamic("currentStateVersion")(currentStateVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WriteResult]
  }
}

