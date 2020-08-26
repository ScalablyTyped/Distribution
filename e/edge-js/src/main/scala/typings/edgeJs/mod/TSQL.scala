package typings.edgeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQL extends js.Object {
  var commandTimeout: js.UndefOr[Double] = js.native
  var connectionString: js.UndefOr[String] = js.native
  var source: String = js.native
}

object TSQL {
  @scala.inline
  def apply(source: String): TSQL = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQL]
  }
  @scala.inline
  implicit class TSQLOps[Self <: TSQL] (val x: Self) extends AnyVal {
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandTimeout(value: Double): Self = this.set("commandTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandTimeout: Self = this.set("commandTimeout", js.undefined)
    @scala.inline
    def setConnectionString(value: String): Self = this.set("connectionString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionString: Self = this.set("connectionString", js.undefined)
  }
  
}

