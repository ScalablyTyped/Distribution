package typings.fetchMock.mod

import typings.fetchMock.fetchMockStrings.GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockOptionsMethodGet extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodGet: js.UndefOr[GET] = js.native
}

object MockOptionsMethodGet {
  @scala.inline
  def apply(): MockOptionsMethodGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptionsMethodGet]
  }
  @scala.inline
  implicit class MockOptionsMethodGetOps[Self <: MockOptionsMethodGet] (val x: Self) extends AnyVal {
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
    def setMethod(value: GET): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

