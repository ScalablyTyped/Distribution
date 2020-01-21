package typings.fineUploader.mod

import typings.fineUploader.coreMod.Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIMessages extends Messages {
  /**
    * Text sent to `showMessage` when `multiple` is `false` and more than one file is dropped at once
    *
    * @default `'You may only drop one file.'`
    */
  var tooManyFilesError: js.UndefOr[String] = js.undefined
  /**
    * Text displayed to users who have ancient browsers
    *
    * @default `'Unrecoverable error - the browser does not permit uploading of any kind.'`
    */
  var unsupportedBrowser: js.UndefOr[String] = js.undefined
}

object UIMessages {
  @scala.inline
  def apply(
    emptyError: String = null,
    maxHeightImageError: String = null,
    maxWidthImageError: String = null,
    minHeightImageError: String = null,
    minSizeError: String = null,
    minWidthImageError: String = null,
    noFilesError: String = null,
    onLeave: String = null,
    retryFailTooManyItemsError: String = null,
    sizeError: String = null,
    tooManyFilesError: String = null,
    tooManyItemsError: String = null,
    typeError: String = null,
    unsupportedBrowser: String = null,
    unsupportedBrowserIos8Safari: String = null
  ): UIMessages = {
    val __obj = js.Dynamic.literal()
    if (emptyError != null) __obj.updateDynamic("emptyError")(emptyError.asInstanceOf[js.Any])
    if (maxHeightImageError != null) __obj.updateDynamic("maxHeightImageError")(maxHeightImageError.asInstanceOf[js.Any])
    if (maxWidthImageError != null) __obj.updateDynamic("maxWidthImageError")(maxWidthImageError.asInstanceOf[js.Any])
    if (minHeightImageError != null) __obj.updateDynamic("minHeightImageError")(minHeightImageError.asInstanceOf[js.Any])
    if (minSizeError != null) __obj.updateDynamic("minSizeError")(minSizeError.asInstanceOf[js.Any])
    if (minWidthImageError != null) __obj.updateDynamic("minWidthImageError")(minWidthImageError.asInstanceOf[js.Any])
    if (noFilesError != null) __obj.updateDynamic("noFilesError")(noFilesError.asInstanceOf[js.Any])
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave.asInstanceOf[js.Any])
    if (retryFailTooManyItemsError != null) __obj.updateDynamic("retryFailTooManyItemsError")(retryFailTooManyItemsError.asInstanceOf[js.Any])
    if (sizeError != null) __obj.updateDynamic("sizeError")(sizeError.asInstanceOf[js.Any])
    if (tooManyFilesError != null) __obj.updateDynamic("tooManyFilesError")(tooManyFilesError.asInstanceOf[js.Any])
    if (tooManyItemsError != null) __obj.updateDynamic("tooManyItemsError")(tooManyItemsError.asInstanceOf[js.Any])
    if (typeError != null) __obj.updateDynamic("typeError")(typeError.asInstanceOf[js.Any])
    if (unsupportedBrowser != null) __obj.updateDynamic("unsupportedBrowser")(unsupportedBrowser.asInstanceOf[js.Any])
    if (unsupportedBrowserIos8Safari != null) __obj.updateDynamic("unsupportedBrowserIos8Safari")(unsupportedBrowserIos8Safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIMessages]
  }
}

