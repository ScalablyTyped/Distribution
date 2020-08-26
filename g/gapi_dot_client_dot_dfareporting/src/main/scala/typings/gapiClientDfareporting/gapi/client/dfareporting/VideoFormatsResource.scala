package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.FieldsId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoFormatsResource extends js.Object {
  /** Gets one video format by ID. */
  def get(request: FieldsId): Request[VideoFormat] = js.native
  /** Lists available video formats. */
  def list(request: Key): Request[VideoFormatsListResponse] = js.native
}

object VideoFormatsResource {
  @scala.inline
  def apply(get: FieldsId => Request[VideoFormat], list: Key => Request[VideoFormatsListResponse]): VideoFormatsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VideoFormatsResource]
  }
  @scala.inline
  implicit class VideoFormatsResourceOps[Self <: VideoFormatsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: FieldsId => Request[VideoFormat]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[VideoFormatsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

