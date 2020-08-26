package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Height
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: Fields): Request[Size] = js.native
  /** Inserts a new size. */
  def insert(request: Key): Request[Size] = js.native
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: Height): Request[SizesListResponse] = js.native
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
  @scala.inline
  implicit class SizesResourceOps[Self <: SizesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Fields => Request[Size]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Size]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Height => Request[SizesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

