package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesResource extends js.Object {
  /** Gets one platform type by ID. */
  def get(request: Fields): Request[PlatformType]
  /** Retrieves a list of platform types. */
  def list(request: Key): Request[PlatformTypesListResponse]
}

object PlatformTypesResource {
  @scala.inline
  def apply(get: Fields => Request[PlatformType], list: Key => Request[PlatformTypesListResponse]): PlatformTypesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PlatformTypesResource]
  }
}

