package typings.dynogels.mod

import typings.dynogels.anon.StreamEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTablesOptions extends js.Object {
  var readCapacity: js.UndefOr[Double] = js.native
  var streamSpecification: js.UndefOr[StreamEnabled] = js.native
  var writeCapacity: js.UndefOr[Double] = js.native
}

object CreateTablesOptions {
  @scala.inline
  def apply(): CreateTablesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTablesOptions]
  }
  @scala.inline
  implicit class CreateTablesOptionsOps[Self <: CreateTablesOptions] (val x: Self) extends AnyVal {
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
    def setReadCapacity(value: Double): Self = this.set("readCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadCapacity: Self = this.set("readCapacity", js.undefined)
    @scala.inline
    def setStreamSpecification(value: StreamEnabled): Self = this.set("streamSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamSpecification: Self = this.set("streamSpecification", js.undefined)
    @scala.inline
    def setWriteCapacity(value: Double): Self = this.set("writeCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteCapacity: Self = this.set("writeCapacity", js.undefined)
  }
  
}

