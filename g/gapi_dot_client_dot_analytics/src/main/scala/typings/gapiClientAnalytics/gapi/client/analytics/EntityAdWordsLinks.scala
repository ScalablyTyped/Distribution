package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityAdWordsLinks extends js.Object {
  /** A list of entity AdWords links. */
  var items: js.UndefOr[js.Array[EntityAdWordsLink]] = js.native
  /**
    * The maximum number of entries the response can contain, regardless of the actual number of entries returned. Its value ranges from 1 to 1000 with a
    * value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /** Collection type. */
  var kind: js.UndefOr[String] = js.native
  /** Next link for this AdWords link collection. */
  var nextLink: js.UndefOr[String] = js.native
  /** Previous link for this AdWords link collection. */
  var previousLink: js.UndefOr[String] = js.native
  /** The starting index of the entries, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[Double] = js.native
  /** The total number of results for the query, regardless of the number of results in the response. */
  var totalResults: js.UndefOr[Double] = js.native
}

object EntityAdWordsLinks {
  @scala.inline
  def apply(): EntityAdWordsLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityAdWordsLinks]
  }
  @scala.inline
  implicit class EntityAdWordsLinksOps[Self <: EntityAdWordsLinks] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: EntityAdWordsLink*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[EntityAdWordsLink]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLink: Self = this.set("nextLink", js.undefined)
    @scala.inline
    def setPreviousLink(value: String): Self = this.set("previousLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousLink: Self = this.set("previousLink", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
  
}

