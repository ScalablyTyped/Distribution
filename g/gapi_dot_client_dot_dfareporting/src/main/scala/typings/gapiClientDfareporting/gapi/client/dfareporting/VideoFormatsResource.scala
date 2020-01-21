package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsIdKey
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsResource extends js.Object {
  /** Gets one video format by ID. */
  def get(request: AnonAltFieldsIdKey): Request_[VideoFormat]
  /** Lists available video formats. */
  def list(request: AnonAltFieldsKey): Request_[VideoFormatsListResponse]
}

object VideoFormatsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsIdKey => Request_[VideoFormat],
    list: AnonAltFieldsKey => Request_[VideoFormatsListResponse]
  ): VideoFormatsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoFormatsResource]
  }
}

