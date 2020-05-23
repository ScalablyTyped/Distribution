package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeAttributes extends js.Object {
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

object IncludeAttributes {
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
  ): IncludeAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAttributes)) __obj.updateDynamic("includeAttributes")(includeAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCreated)) __obj.updateDynamic("includeCreated")(includeCreated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLargestResourceMime)) __obj.updateDynamic("includeLargestResourceMime")(includeLargestResourceMime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeLargestResourceSize)) __obj.updateDynamic("includeLargestResourceSize")(includeLargestResourceSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNotebookGuid)) __obj.updateDynamic("includeNotebookGuid")(includeNotebookGuid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTagGuids)) __obj.updateDynamic("includeTagGuids")(includeTagGuids.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTitle)) __obj.updateDynamic("includeTitle")(includeTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUpdateSequenceNum)) __obj.updateDynamic("includeUpdateSequenceNum")(includeUpdateSequenceNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUpdated)) __obj.updateDynamic("includeUpdated")(includeUpdated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAttributes]
  }
}

