package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryValue extends js.Object {
  /**
    * Value of the HTTP header if it cannot be represented by UTF-8, stored as individual byte values (0..255).
    */
  var binaryValue: js.UndefOr[js.Array[Double]] = js.native
  /** Name of the HTTP header. */
  var name: String = js.native
  /** Value of the HTTP header if it can be represented by UTF-8. */
  var value: js.UndefOr[String] = js.native
}

object BinaryValue {
  @scala.inline
  def apply(name: String): BinaryValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryValue]
  }
  @scala.inline
  implicit class BinaryValueOps[Self <: BinaryValue] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinaryValueVarargs(value: Double*): Self = this.set("binaryValue", js.Array(value :_*))
    @scala.inline
    def setBinaryValue(value: js.Array[Double]): Self = this.set("binaryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryValue: Self = this.set("binaryValue", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

