package typings.eggLogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Excludes extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.native
}

object Excludes {
  @scala.inline
  def apply(): Excludes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Excludes]
  }
  @scala.inline
  implicit class ExcludesOps[Self <: Excludes] (val x: Self) extends AnyVal {
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
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
  }
  
}

