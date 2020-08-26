package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  /** The collection ID to which this index applies. Required. */
  var collectionId: js.UndefOr[String] = js.native
  /** The fields to index. */
  var fields: js.UndefOr[js.Array[IndexField]] = js.native
  /** The resource name of the index. */
  var name: js.UndefOr[String] = js.native
  /**
    * The state of the index.
    * The state is read-only.
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.native
}

object Index {
  @scala.inline
  def apply(): Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setCollectionId(value: String): Self = this.set("collectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionId: Self = this.set("collectionId", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: IndexField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[IndexField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

