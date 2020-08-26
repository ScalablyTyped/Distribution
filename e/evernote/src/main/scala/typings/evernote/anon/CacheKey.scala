package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheKey extends js.Object {
  var cacheKey: js.UndefOr[String] = js.native
  var context: js.UndefOr[String] = js.native
  var filter: js.UndefOr[NoteFilter] = js.native
  var noteGuid: js.UndefOr[String] = js.native
  var plainText: js.UndefOr[String] = js.native
  var referenceUri: js.UndefOr[String] = js.native
}

object CacheKey {
  @scala.inline
  def apply(): CacheKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheKey]
  }
  @scala.inline
  implicit class CacheKeyOps[Self <: CacheKey] (val x: Self) extends AnyVal {
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
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFilter(value: NoteFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setNoteGuid(value: String): Self = this.set("noteGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteGuid: Self = this.set("noteGuid", js.undefined)
    @scala.inline
    def setPlainText(value: String): Self = this.set("plainText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlainText: Self = this.set("plainText", js.undefined)
    @scala.inline
    def setReferenceUri(value: String): Self = this.set("referenceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceUri: Self = this.set("referenceUri", js.undefined)
  }
  
}

