package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.NoteFilter] = js.undefined
  var noteGuid: js.UndefOr[java.lang.String] = js.undefined
  var plainText: js.UndefOr[java.lang.String] = js.undefined
  var referenceUri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: evernoteLib.evernoteMod.EvernoteNs.NoteFilter = null,
    noteGuid: java.lang.String = null,
    plainText: java.lang.String = null,
    referenceUri: java.lang.String = null
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid)
    if (plainText != null) __obj.updateDynamic("plainText")(plainText)
    if (referenceUri != null) __obj.updateDynamic("referenceUri")(referenceUri)
    __obj.asInstanceOf[Anon_Filter]
  }
}

