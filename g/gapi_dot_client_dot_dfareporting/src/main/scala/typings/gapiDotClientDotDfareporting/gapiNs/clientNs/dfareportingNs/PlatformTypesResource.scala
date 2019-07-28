package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesResource extends js.Object {
  /** Gets one platform type by ID. */
  def get(request: Anon_AltFields): Request[PlatformType]
  /** Retrieves a list of platform types. */
  def list(request: Anon_AltFieldsKey): Request[PlatformTypesListResponse]
}

object PlatformTypesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[PlatformType],
    list: Anon_AltFieldsKey => Request[PlatformTypesListResponse]
  ): PlatformTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PlatformTypesResource]
  }
}

