package typings.gapiClientSearchconsole.gapi.client.searchconsole

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSearchconsole.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileFriendlyTestResource extends js.Object {
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: Accesstoken): Request[RunMobileFriendlyTestResponse] = js.native
}

object MobileFriendlyTestResource {
  @scala.inline
  def apply(run: Accesstoken => Request[RunMobileFriendlyTestResponse]): MobileFriendlyTestResource = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[MobileFriendlyTestResource]
  }
  @scala.inline
  implicit class MobileFriendlyTestResourceOps[Self <: MobileFriendlyTestResource] (val x: Self) extends AnyVal {
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
    def setRun(value: Accesstoken => Request[RunMobileFriendlyTestResponse]): Self = this.set("run", js.Any.fromFunction1(value))
  }
  
}

