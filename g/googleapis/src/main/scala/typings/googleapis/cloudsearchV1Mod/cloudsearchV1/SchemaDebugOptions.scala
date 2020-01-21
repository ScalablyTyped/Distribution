package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared request debug options for all cloudsearch RPC methods.
  */
@js.native
trait SchemaDebugOptions extends js.Object {
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  var enableDebugging: js.UndefOr[Boolean] = js.native
}

object SchemaDebugOptions {
  @scala.inline
  def apply(enableDebugging: js.UndefOr[Boolean] = js.undefined): SchemaDebugOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDebugging)) __obj.updateDynamic("enableDebugging")(enableDebugging.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDebugOptions]
  }
}

