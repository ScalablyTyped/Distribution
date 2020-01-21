package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsHeight
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: AnonAltFields): Request_[Size]
  /** Inserts a new size. */
  def insert(request: AnonAltFieldsKey): Request_[Size]
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: AnonAltFieldsHeight): Request_[SizesListResponse]
}

object SizesResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Size],
    insert: AnonAltFieldsKey => Request_[Size],
    list: AnonAltFieldsHeight => Request_[SizesListResponse]
  ): SizesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SizesResource]
  }
}

