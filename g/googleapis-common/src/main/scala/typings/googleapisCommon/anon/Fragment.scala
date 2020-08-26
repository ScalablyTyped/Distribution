package typings.googleapisCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment extends js.Object {
  var fragment: String = js.native
}

object Fragment {
  @scala.inline
  def apply(fragment: String): Fragment = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
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
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
  }
  
}

