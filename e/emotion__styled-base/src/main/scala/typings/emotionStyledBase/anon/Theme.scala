package typings.emotionStyledBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any = js.native
}

object Theme {
  @scala.inline
  def apply(theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setTheme(value: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

