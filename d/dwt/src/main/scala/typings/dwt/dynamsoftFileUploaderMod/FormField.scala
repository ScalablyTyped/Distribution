package typings.dwt.dynamsoftFileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormField extends js.Object {
  /**
    * Specify the block size. By default, it's 10240.
    * @param key Specify the key of the field.
    * @param value Sepcify the value of the field.
    */
  def Add(key: String, value: String): Unit = js.native
}

object FormField {
  @scala.inline
  def apply(Add: (String, String) => Unit): FormField = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add))
    __obj.asInstanceOf[FormField]
  }
  @scala.inline
  implicit class FormFieldOps[Self <: FormField] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, String) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
  }
  
}

