package typings.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleapisCommon.anon.Fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentResponse extends js.Object {
  var codeFragment: StringDictionary[Fragment] = js.native
}

object FragmentResponse {
  @scala.inline
  def apply(codeFragment: StringDictionary[Fragment]): FragmentResponse = {
    val __obj = js.Dynamic.literal(codeFragment = codeFragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentResponse]
  }
  @scala.inline
  implicit class FragmentResponseOps[Self <: FragmentResponse] (val x: Self) extends AnyVal {
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
    def setCodeFragment(value: StringDictionary[Fragment]): Self = this.set("codeFragment", value.asInstanceOf[js.Any])
  }
  
}

