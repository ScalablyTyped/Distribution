package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Moves data from the source to the destination.
  */
@js.native
trait Schema$CutPasteRequest extends js.Object {
  /**
    * The top-left coordinate where the data should be pasted.
    */
  var destination: js.UndefOr[Schema$GridCoordinate] = js.native
  /**
    * What kind of data to paste.  All the source data will be cut, regardless
    * of what is pasted.
    */
  var pasteType: js.UndefOr[String] = js.native
  /**
    * The source data to cut.
    */
  var source: js.UndefOr[Schema$GridRange] = js.native
}

object Schema$CutPasteRequest {
  @scala.inline
  def apply(
    destination: Schema$GridCoordinate = null,
    pasteType: String = null,
    source: Schema$GridRange = null
  ): Schema$CutPasteRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (pasteType != null) __obj.updateDynamic("pasteType")(pasteType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CutPasteRequest]
  }
}

