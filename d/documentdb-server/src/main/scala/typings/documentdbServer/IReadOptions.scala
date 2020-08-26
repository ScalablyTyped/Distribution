package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a read operation. */
@js.native
trait IReadOptions extends js.Object {
  /** The conditional HTTP method ifNoneMatch value. */
  var ifNoneMatch: js.UndefOr[String] = js.native
}

object IReadOptions {
  @scala.inline
  def apply(): IReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadOptions]
  }
  @scala.inline
  implicit class IReadOptionsOps[Self <: IReadOptions] (val x: Self) extends AnyVal {
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
    def setIfNoneMatch(value: String): Self = this.set("ifNoneMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfNoneMatch: Self = this.set("ifNoneMatch", js.undefined)
  }
  
}

