package typings.evernote

import typings.evernote.mod.NoteStore.NoteFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheKey extends js.Object {
  var cacheKey: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[NoteFilter] = js.undefined
  var noteGuid: js.UndefOr[String] = js.undefined
  var plainText: js.UndefOr[String] = js.undefined
  var referenceUri: js.UndefOr[String] = js.undefined
}

object AnonCacheKey {
  @scala.inline
  def apply(
    cacheKey: String = null,
    context: String = null,
    filter: NoteFilter = null,
    noteGuid: String = null,
    plainText: String = null,
    referenceUri: String = null
  ): AnonCacheKey = {
    val __obj = js.Dynamic.literal()
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid.asInstanceOf[js.Any])
    if (plainText != null) __obj.updateDynamic("plainText")(plainText.asInstanceOf[js.Any])
    if (referenceUri != null) __obj.updateDynamic("referenceUri")(referenceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheKey]
  }
}

