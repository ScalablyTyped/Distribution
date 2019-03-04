package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsResource extends js.Object {
  /** Gets one video format by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsIdKey): gapiDotClientLib.gapiNs.clientNs.Request[VideoFormat]
  /** Lists available video formats. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[VideoFormatsListResponse]
}

object VideoFormatsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsIdKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[VideoFormat]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[VideoFormatsListResponse]
    ]
  ): VideoFormatsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[VideoFormatsResource]
  }
}

