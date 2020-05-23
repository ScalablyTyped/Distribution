package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Height
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: Fields): Request[Size]
  /** Inserts a new size. */
  def insert(request: Key): Request[Size]
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: Height): Request[SizesListResponse]
}

object SizesResource {
  @scala.inline
  def apply(
    get: Fields => Request[Size],
    insert: Key => Request[Size],
    list: Height => Request[SizesListResponse]
  ): SizesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SizesResource]
  }
}

