package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIMessages
  extends fineDashUploaderLib.libCoreMod.Messages {
  /**
    * Text sent to `showMessage` when `multiple` is `false` and more than one file is dropped at once
    *
    * @default `'You may only drop one file.'`
    */
  var tooManyFilesError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text displayed to users who have ancient browsers
    *
    * @default `'Unrecoverable error - the browser does not permit uploading of any kind.'`
    */
  var unsupportedBrowser: js.UndefOr[java.lang.String] = js.undefined
}

object UIMessages {
  @scala.inline
  def apply(
    emptyError: java.lang.String = null,
    maxHeightImageError: java.lang.String = null,
    maxWidthImageError: java.lang.String = null,
    minHeightImageError: java.lang.String = null,
    minSizeError: java.lang.String = null,
    minWidthImageError: java.lang.String = null,
    noFilesError: java.lang.String = null,
    onLeave: java.lang.String = null,
    retryFailTooManyItemsError: java.lang.String = null,
    sizeError: java.lang.String = null,
    tooManyFilesError: java.lang.String = null,
    tooManyItemsError: java.lang.String = null,
    typeError: java.lang.String = null,
    unsupportedBrowser: java.lang.String = null,
    unsupportedBrowserIos8Safari: java.lang.String = null
  ): UIMessages = {
    val __obj = js.Dynamic.literal()
    if (emptyError != null) __obj.updateDynamic("emptyError")(emptyError)
    if (maxHeightImageError != null) __obj.updateDynamic("maxHeightImageError")(maxHeightImageError)
    if (maxWidthImageError != null) __obj.updateDynamic("maxWidthImageError")(maxWidthImageError)
    if (minHeightImageError != null) __obj.updateDynamic("minHeightImageError")(minHeightImageError)
    if (minSizeError != null) __obj.updateDynamic("minSizeError")(minSizeError)
    if (minWidthImageError != null) __obj.updateDynamic("minWidthImageError")(minWidthImageError)
    if (noFilesError != null) __obj.updateDynamic("noFilesError")(noFilesError)
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave)
    if (retryFailTooManyItemsError != null) __obj.updateDynamic("retryFailTooManyItemsError")(retryFailTooManyItemsError)
    if (sizeError != null) __obj.updateDynamic("sizeError")(sizeError)
    if (tooManyFilesError != null) __obj.updateDynamic("tooManyFilesError")(tooManyFilesError)
    if (tooManyItemsError != null) __obj.updateDynamic("tooManyItemsError")(tooManyItemsError)
    if (typeError != null) __obj.updateDynamic("typeError")(typeError)
    if (unsupportedBrowser != null) __obj.updateDynamic("unsupportedBrowser")(unsupportedBrowser)
    if (unsupportedBrowserIos8Safari != null) __obj.updateDynamic("unsupportedBrowserIos8Safari")(unsupportedBrowserIos8Safari)
    __obj.asInstanceOf[UIMessages]
  }
}

