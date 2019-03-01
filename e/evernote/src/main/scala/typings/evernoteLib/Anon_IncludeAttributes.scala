package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeAttributes extends js.Object {
  var includeAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var includeContentLength: js.UndefOr[scala.Boolean] = js.undefined
  var includeCreated: js.UndefOr[scala.Boolean] = js.undefined
  var includeDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var includeLargestResourceMime: js.UndefOr[scala.Boolean] = js.undefined
  var includeLargestResourceSize: js.UndefOr[scala.Boolean] = js.undefined
  var includeNotebookGuid: js.UndefOr[scala.Boolean] = js.undefined
  var includeTagGuids: js.UndefOr[scala.Boolean] = js.undefined
  var includeTitle: js.UndefOr[scala.Boolean] = js.undefined
  var includeUpdateSequenceNum: js.UndefOr[scala.Boolean] = js.undefined
  var includeUpdated: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeAttributes {
  @scala.inline
  def apply(
    includeAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    includeContentLength: js.UndefOr[scala.Boolean] = js.undefined,
    includeCreated: js.UndefOr[scala.Boolean] = js.undefined,
    includeDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    includeLargestResourceMime: js.UndefOr[scala.Boolean] = js.undefined,
    includeLargestResourceSize: js.UndefOr[scala.Boolean] = js.undefined,
    includeNotebookGuid: js.UndefOr[scala.Boolean] = js.undefined,
    includeTagGuids: js.UndefOr[scala.Boolean] = js.undefined,
    includeTitle: js.UndefOr[scala.Boolean] = js.undefined,
    includeUpdateSequenceNum: js.UndefOr[scala.Boolean] = js.undefined,
    includeUpdated: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IncludeAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAttributes)) __obj.updateDynamic("includeAttributes")(includeAttributes)
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength)
    if (!js.isUndefined(includeCreated)) __obj.updateDynamic("includeCreated")(includeCreated)
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted)
    if (!js.isUndefined(includeLargestResourceMime)) __obj.updateDynamic("includeLargestResourceMime")(includeLargestResourceMime)
    if (!js.isUndefined(includeLargestResourceSize)) __obj.updateDynamic("includeLargestResourceSize")(includeLargestResourceSize)
    if (!js.isUndefined(includeNotebookGuid)) __obj.updateDynamic("includeNotebookGuid")(includeNotebookGuid)
    if (!js.isUndefined(includeTagGuids)) __obj.updateDynamic("includeTagGuids")(includeTagGuids)
    if (!js.isUndefined(includeTitle)) __obj.updateDynamic("includeTitle")(includeTitle)
    if (!js.isUndefined(includeUpdateSequenceNum)) __obj.updateDynamic("includeUpdateSequenceNum")(includeUpdateSequenceNum)
    if (!js.isUndefined(includeUpdated)) __obj.updateDynamic("includeUpdated")(includeUpdated)
    __obj.asInstanceOf[Anon_IncludeAttributes]
  }
}

