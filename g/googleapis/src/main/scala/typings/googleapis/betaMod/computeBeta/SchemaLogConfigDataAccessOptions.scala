package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Write a Data Access (Gin) log
  */
@js.native
trait SchemaLogConfigDataAccessOptions extends js.Object {
  /**
    * Whether Gin logging should happen in a fail-closed manner at the caller.
    * This is relevant only in the LocalIAM implementation, for now.  NOTE:
    * Logging to Gin in a fail-closed manner is currently unsupported while
    * work is being done to satisfy the requirements of go/345. Currently,
    * setting LOG_FAIL_CLOSED mode will have no effect, but still exists
    * because there is active work being done to support it (b/115874152).
    */
  var logMode: js.UndefOr[String] = js.native
}

object SchemaLogConfigDataAccessOptions {
  @scala.inline
  def apply(): SchemaLogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigDataAccessOptions]
  }
  @scala.inline
  implicit class SchemaLogConfigDataAccessOptionsOps[Self <: SchemaLogConfigDataAccessOptions] (val x: Self) extends AnyVal {
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
    def setLogMode(value: String): Self = this.set("logMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogMode: Self = this.set("logMode", js.undefined)
  }
  
}

