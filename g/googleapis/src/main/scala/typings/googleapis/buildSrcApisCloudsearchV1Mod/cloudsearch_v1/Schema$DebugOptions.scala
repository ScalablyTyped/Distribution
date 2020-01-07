package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared request debug options for all cloudsearch RPC methods.
  */
@js.native
trait Schema$DebugOptions extends js.Object {
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  var enableDebugging: js.UndefOr[Boolean] = js.native
}

object Schema$DebugOptions {
  @scala.inline
  def apply(enableDebugging: js.UndefOr[Boolean] = js.undefined): Schema$DebugOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDebugging)) __obj.updateDynamic("enableDebugging")(enableDebugging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DebugOptions]
  }
}

