package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effective extends js.Object {
  /**
    * All the permissions that the user has for this web property. These include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions
    * from the parent account.
    */
  var effective: js.UndefOr[js.Array[String]] = js.native
}

object Effective {
  @scala.inline
  def apply(): Effective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Effective]
  }
  @scala.inline
  implicit class EffectiveOps[Self <: Effective] (val x: Self) extends AnyVal {
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
    def setEffectiveVarargs(value: String*): Self = this.set("effective", js.Array(value :_*))
    @scala.inline
    def setEffective(value: js.Array[String]): Self = this.set("effective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffective: Self = this.set("effective", js.undefined)
  }
  
}

