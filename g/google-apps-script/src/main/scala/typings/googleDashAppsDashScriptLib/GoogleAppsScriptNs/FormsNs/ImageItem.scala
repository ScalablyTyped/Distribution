package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageItem extends js.Object {
  def duplicate(): ImageItem
  def getAlignment(): Alignment
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getImage(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def getWidth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setAlignment(alignment: Alignment): ImageItem
  def setHelpText(text: java.lang.String): ImageItem
  def setImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): ImageItem
  def setTitle(title: java.lang.String): ImageItem
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ImageItem
}

object ImageItem {
  @scala.inline
  def apply(
    duplicate: js.Function0[ImageItem],
    getAlignment: js.Function0[Alignment],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getImage: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    getWidth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    setAlignment: js.Function1[Alignment, ImageItem],
    setHelpText: js.Function1[java.lang.String, ImageItem],
    setImage: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource, ImageItem],
    setTitle: js.Function1[java.lang.String, ImageItem],
    setWidth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ImageItem]
  ): ImageItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duplicate")(duplicate)
    __obj.updateDynamic("getAlignment")(getAlignment)
    __obj.updateDynamic("getHelpText")(getHelpText)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getImage")(getImage)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getWidth")(getWidth)
    __obj.updateDynamic("setAlignment")(setAlignment)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setImage")(setImage)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[ImageItem]
  }
}

