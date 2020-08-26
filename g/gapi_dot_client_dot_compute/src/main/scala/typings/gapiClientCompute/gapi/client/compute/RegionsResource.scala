package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.RegionUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionsResource extends js.Object {
  /** Returns the specified Region resource. Get a list of available regions by making a list() request. */
  def get(request: RegionUserIp): Request[Region] = js.native
  /** Retrieves the list of region resources available to the specified project. */
  def list(request: Alt): Request[RegionList] = js.native
}

object RegionsResource {
  @scala.inline
  def apply(get: RegionUserIp => Request[Region], list: Alt => Request[RegionList]): RegionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionsResource]
  }
  @scala.inline
  implicit class RegionsResourceOps[Self <: RegionsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: RegionUserIp => Request[Region]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[RegionList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

