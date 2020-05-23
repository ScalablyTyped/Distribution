package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.FieldsId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsResource extends js.Object {
  /** Gets one video format by ID. */
  def get(request: FieldsId): Request[VideoFormat]
  /** Lists available video formats. */
  def list(request: Key): Request[VideoFormatsListResponse]
}

object VideoFormatsResource {
  @scala.inline
  def apply(get: FieldsId => Request[VideoFormat], list: Key => Request[VideoFormatsListResponse]): VideoFormatsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VideoFormatsResource]
  }
}

