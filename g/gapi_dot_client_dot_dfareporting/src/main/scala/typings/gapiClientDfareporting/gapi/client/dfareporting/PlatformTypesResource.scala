package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformTypesResource extends js.Object {
  /** Gets one platform type by ID. */
  def get(request: Fields): Request[PlatformType] = js.native
  /** Retrieves a list of platform types. */
  def list(request: Key): Request[PlatformTypesListResponse] = js.native
}

object PlatformTypesResource {
  @scala.inline
  def apply(get: Fields => Request[PlatformType], list: Key => Request[PlatformTypesListResponse]): PlatformTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PlatformTypesResource]
  }
  @scala.inline
  implicit class PlatformTypesResourceOps[Self <: PlatformTypesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[PlatformType]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[PlatformTypesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

