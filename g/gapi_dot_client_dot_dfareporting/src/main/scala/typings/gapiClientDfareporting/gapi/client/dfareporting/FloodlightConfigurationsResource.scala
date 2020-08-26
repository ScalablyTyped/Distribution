package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AltFields
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightConfigurationsResource extends js.Object {
  /** Gets one floodlight configuration by ID. */
  def get(request: Fields): Request[FloodlightConfiguration] = js.native
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(request: AltFields): Request[FloodlightConfigurationsListResponse] = js.native
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: Fields): Request[FloodlightConfiguration] = js.native
  /** Updates an existing floodlight configuration. */
  def update(request: Key): Request[FloodlightConfiguration] = js.native
}

object FloodlightConfigurationsResource {
  @scala.inline
  def apply(
    get: Fields => Request[FloodlightConfiguration],
    list: AltFields => Request[FloodlightConfigurationsListResponse],
    patch: Fields => Request[FloodlightConfiguration],
    update: Key => Request[FloodlightConfiguration]
  ): FloodlightConfigurationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightConfigurationsResource]
  }
  @scala.inline
  implicit class FloodlightConfigurationsResourceOps[Self <: FloodlightConfigurationsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[FloodlightConfiguration]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AltFields => Request[FloodlightConfigurationsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[FloodlightConfiguration]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[FloodlightConfiguration]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

