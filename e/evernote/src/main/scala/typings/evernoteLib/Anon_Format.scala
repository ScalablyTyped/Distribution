package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.QueryFormat] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.SavedSearchScope] = js.undefined
  var updateSequenceNum: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    format: evernoteLib.evernoteMod.EvernoteNs.QueryFormat = null,
    guid: java.lang.String = null,
    name: java.lang.String = null,
    query: java.lang.String = null,
    scope: evernoteLib.evernoteMod.EvernoteNs.SavedSearchScope = null,
    updateSequenceNum: scala.Int | scala.Double = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (name != null) __obj.updateDynamic("name")(name)
    if (query != null) __obj.updateDynamic("query")(query)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

