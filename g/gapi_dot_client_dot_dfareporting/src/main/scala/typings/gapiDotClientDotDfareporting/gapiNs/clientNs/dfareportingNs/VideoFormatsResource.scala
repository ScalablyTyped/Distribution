package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIdKey
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsResource extends js.Object {
  /** Gets one video format by ID. */
  def get(request: Anon_AltFieldsIdKey): Request[VideoFormat]
  /** Lists available video formats. */
  def list(request: Anon_AltFieldsKey): Request[VideoFormatsListResponse]
}

object VideoFormatsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsIdKey => Request[VideoFormat],
    list: Anon_AltFieldsKey => Request[VideoFormatsListResponse]
  ): VideoFormatsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoFormatsResource]
  }
}

