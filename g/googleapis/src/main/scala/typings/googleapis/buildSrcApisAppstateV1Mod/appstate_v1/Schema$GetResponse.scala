package typings.googleapis.buildSrcApisAppstateV1Mod.appstate_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an app state resource.
  */
@js.native
trait Schema$GetResponse extends js.Object {
  /**
    * The current app state version.
    */
  var currentStateVersion: js.UndefOr[String] = js.native
  /**
    * The requested data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string appstate#getResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The key for the data.
    */
  var stateKey: js.UndefOr[Double] = js.native
}

object Schema$GetResponse {
  @scala.inline
  def apply(
    currentStateVersion: String = null,
    data: String = null,
    kind: String = null,
    stateKey: Int | Double = null
  ): Schema$GetResponse = {
    val __obj = js.Dynamic.literal()
    if (currentStateVersion != null) __obj.updateDynamic("currentStateVersion")(currentStateVersion.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetResponse]
  }
}

