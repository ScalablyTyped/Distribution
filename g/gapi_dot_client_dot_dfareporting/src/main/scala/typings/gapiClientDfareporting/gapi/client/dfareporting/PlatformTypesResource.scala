package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesResource extends js.Object {
  /** Gets one platform type by ID. */
  def get(request: AnonFields): Request_[PlatformType]
  /** Retrieves a list of platform types. */
  def list(request: AnonKey): Request_[PlatformTypesListResponse]
}

object PlatformTypesResource {
  @scala.inline
  def apply(get: AnonFields => Request_[PlatformType], list: AnonKey => Request_[PlatformTypesListResponse]): PlatformTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PlatformTypesResource]
  }
}

