package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonHeight
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: AnonFields): Request_[Size]
  /** Inserts a new size. */
  def insert(request: AnonKey): Request_[Size]
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: AnonHeight): Request_[SizesListResponse]
}

object SizesResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Size],
    insert: AnonKey => Request_[Size],
    list: AnonHeight => Request_[SizesListResponse]
  ): SizesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SizesResource]
  }
}

