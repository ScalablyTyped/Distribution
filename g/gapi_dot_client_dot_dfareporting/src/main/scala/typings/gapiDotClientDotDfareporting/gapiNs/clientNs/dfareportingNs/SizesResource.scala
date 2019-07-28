package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsHeight
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: Anon_AltFields): Request[Size]
  /** Inserts a new size. */
  def insert(request: Anon_AltFieldsKey): Request[Size]
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: Anon_AltFieldsHeight): Request[SizesListResponse]
}

object SizesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Size],
    insert: Anon_AltFieldsKey => Request[Size],
    list: Anon_AltFieldsHeight => Request[SizesListResponse]
  ): SizesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SizesResource]
  }
}

