package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionSelector extends js.Object {
  /**
    * When false, selects only collections that are immediate children of
    * the `parent` specified in the containing `RunQueryRequest`.
    * When true, selects all descendant collections.
    */
  var allDescendants: js.UndefOr[Boolean] = js.native
  /**
    * The collection ID.
    * When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[String] = js.native
}

object CollectionSelector {
  @scala.inline
  def apply(): CollectionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionSelector]
  }
  @scala.inline
  implicit class CollectionSelectorOps[Self <: CollectionSelector] (val x: Self) extends AnyVal {
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
    def setAllDescendants(value: Boolean): Self = this.set("allDescendants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDescendants: Self = this.set("allDescendants", js.undefined)
    @scala.inline
    def setCollectionId(value: String): Self = this.set("collectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionId: Self = this.set("collectionId", js.undefined)
  }
  
}

