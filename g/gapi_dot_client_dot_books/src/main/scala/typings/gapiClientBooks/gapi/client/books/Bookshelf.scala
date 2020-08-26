package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookshelf extends js.Object {
  /** Whether this bookshelf is PUBLIC or PRIVATE. */
  var access: js.UndefOr[String] = js.native
  /** Created time for this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var created: js.UndefOr[String] = js.native
  /** Description of this bookshelf. */
  var description: js.UndefOr[String] = js.native
  /** Id of this bookshelf, only unique by user. */
  var id: js.UndefOr[Double] = js.native
  /** Resource type for bookshelf metadata. */
  var kind: js.UndefOr[String] = js.native
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** Title of this bookshelf. */
  var title: js.UndefOr[String] = js.native
  /** Last modified time of this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[String] = js.native
  /** Number of volumes in this bookshelf. */
  var volumeCount: js.UndefOr[Double] = js.native
  /** Last time a volume was added or removed from this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var volumesLastUpdated: js.UndefOr[String] = js.native
}

object Bookshelf {
  @scala.inline
  def apply(): Bookshelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookshelf]
  }
  @scala.inline
  implicit class BookshelfOps[Self <: Bookshelf] (val x: Self) extends AnyVal {
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
    def setAccess(value: String): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setVolumeCount(value: Double): Self = this.set("volumeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeCount: Self = this.set("volumeCount", js.undefined)
    @scala.inline
    def setVolumesLastUpdated(value: String): Self = this.set("volumesLastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumesLastUpdated: Self = this.set("volumesLastUpdated", js.undefined)
  }
  
}

