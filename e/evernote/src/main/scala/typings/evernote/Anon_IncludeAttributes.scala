package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeAttributes extends js.Object {
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  var includeContentLength: js.UndefOr[Boolean] = js.undefined
  var includeCreated: js.UndefOr[Boolean] = js.undefined
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
  var includeLargestResourceMime: js.UndefOr[Boolean] = js.undefined
  var includeLargestResourceSize: js.UndefOr[Boolean] = js.undefined
  var includeNotebookGuid: js.UndefOr[Boolean] = js.undefined
  var includeTagGuids: js.UndefOr[Boolean] = js.undefined
  var includeTitle: js.UndefOr[Boolean] = js.undefined
  var includeUpdateSequenceNum: js.UndefOr[Boolean] = js.undefined
  var includeUpdated: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeAttributes {
  @scala.inline
  def apply(
    includeAttributes: js.UndefOr[Boolean] = js.undefined,
    includeContentLength: js.UndefOr[Boolean] = js.undefined,
    includeCreated: js.UndefOr[Boolean] = js.undefined,
    includeDeleted: js.UndefOr[Boolean] = js.undefined,
    includeLargestResourceMime: js.UndefOr[Boolean] = js.undefined,
    includeLargestResourceSize: js.UndefOr[Boolean] = js.undefined,
    includeNotebookGuid: js.UndefOr[Boolean] = js.undefined,
    includeTagGuids: js.UndefOr[Boolean] = js.undefined,
    includeTitle: js.UndefOr[Boolean] = js.undefined,
    includeUpdateSequenceNum: js.UndefOr[Boolean] = js.undefined,
    includeUpdated: js.UndefOr[Boolean] = js.undefined
  ): Anon_IncludeAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAttributes)) __obj.updateDynamic("includeAttributes")(includeAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCreated)) __obj.updateDynamic("includeCreated")(includeCreated.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLargestResourceMime)) __obj.updateDynamic("includeLargestResourceMime")(includeLargestResourceMime.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLargestResourceSize)) __obj.updateDynamic("includeLargestResourceSize")(includeLargestResourceSize.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNotebookGuid)) __obj.updateDynamic("includeNotebookGuid")(includeNotebookGuid.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTagGuids)) __obj.updateDynamic("includeTagGuids")(includeTagGuids.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTitle)) __obj.updateDynamic("includeTitle")(includeTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUpdateSequenceNum)) __obj.updateDynamic("includeUpdateSequenceNum")(includeUpdateSequenceNum.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUpdated)) __obj.updateDynamic("includeUpdated")(includeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeAttributes]
  }
}

