package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.NoteFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[NoteFilter] = js.undefined
  var noteGuid: js.UndefOr[String] = js.undefined
  var plainText: js.UndefOr[String] = js.undefined
  var referenceUri: js.UndefOr[String] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: NoteFilter = null,
    noteGuid: String = null,
    plainText: String = null,
    referenceUri: String = null
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid)
    if (plainText != null) __obj.updateDynamic("plainText")(plainText)
    if (referenceUri != null) __obj.updateDynamic("referenceUri")(referenceUri)
    __obj.asInstanceOf[Anon_Filter]
  }
}

