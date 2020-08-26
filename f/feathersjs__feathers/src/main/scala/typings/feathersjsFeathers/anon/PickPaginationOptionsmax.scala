package typings.feathersjsFeathers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@feathersjs/feathers.@feathersjs/feathers.PaginationOptions, 'max'> */
@js.native
trait PickPaginationOptionsmax extends js.Object {
  var max: Double = js.native
}

object PickPaginationOptionsmax {
  @scala.inline
  def apply(max: Double): PickPaginationOptionsmax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPaginationOptionsmax]
  }
  @scala.inline
  implicit class PickPaginationOptionsmaxOps[Self <: PickPaginationOptionsmax] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
  }
  
}

