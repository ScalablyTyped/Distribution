package typings.fetchMock.mod

import typings.fetchMock.fetchMockStrings.HEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockOptionsMethodHead extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodHead: js.UndefOr[HEAD] = js.native
}

object MockOptionsMethodHead {
  @scala.inline
  def apply(): MockOptionsMethodHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptionsMethodHead]
  }
  @scala.inline
  implicit class MockOptionsMethodHeadOps[Self <: MockOptionsMethodHead] (val x: Self) extends AnyVal {
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
    def setMethod(value: HEAD): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

