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
  def apply(): SchemaDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDebugOptions]
  }
  @scala.inline
  implicit class SchemaDebugOptionsOps[Self <: SchemaDebugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableDebugging(value: Boolean): Self = this.set("enableDebugging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDebugging: Self = this.set("enableDebugging", js.undefined)
  }
  
}

