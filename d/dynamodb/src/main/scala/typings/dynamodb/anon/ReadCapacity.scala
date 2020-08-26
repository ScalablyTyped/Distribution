package typings.dynamodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadCapacity extends js.Object {
  var readCapacity: Double = js.native
  var writeCapacity: Double = js.native
}

object ReadCapacity {
  @scala.inline
  def apply(readCapacity: Double, writeCapacity: Double): ReadCapacity = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadCapacity]
  }
  @scala.inline
  implicit class ReadCapacityOps[Self <: ReadCapacity] (val x: Self) extends AnyVal {
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
    def setWriteCapacity(value: Double): Self = this.set("writeCapacity", value.asInstanceOf[js.Any])
  }
  
}

