package typings.esfxTypeModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Then extends js.Object {
  def `then`(
    onfulfilled: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ): js.Any = js.native
}

object Then {
  @scala.inline
  def apply(
    `then`: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any => js.Any
  ): Then = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Then]
  }
  @scala.inline
  implicit class ThenOps[Self <: Then] (val x: Self) extends AnyVal {
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
    def setThen(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any => js.Any
    ): Self = this.set("then", js.Any.fromFunction1(value))
  }
  
}

