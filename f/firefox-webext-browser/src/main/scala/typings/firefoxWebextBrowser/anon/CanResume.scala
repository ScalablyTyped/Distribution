package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.downloads.BooleanDelta
import typings.firefoxWebextBrowser.browser.downloads.DoubleDelta
import typings.firefoxWebextBrowser.browser.downloads.StringDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanResume extends js.Object {
  var canResume: js.UndefOr[BooleanDelta] = js.undefined
  /** Describes a change in a DownloadItem's `danger`. */
  var danger: js.UndefOr[StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `endTime`. */
  var endTime: js.UndefOr[StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `error`. */
  var error: js.UndefOr[StringDelta] = js.undefined
  var exists: js.UndefOr[BooleanDelta] = js.undefined
  /** Describes a change in a DownloadItem's `fileSize`. */
  var fileSize: js.UndefOr[DoubleDelta] = js.undefined
  /** Describes a change in a DownloadItem's `filename`. */
  var filename: js.UndefOr[StringDelta] = js.undefined
  /** The `id` of the DownloadItem that changed. */
  var id: Double
  /** Describes a change in a DownloadItem's `mime`. */
  var mime: js.UndefOr[StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `paused`. */
  var paused: js.UndefOr[BooleanDelta] = js.undefined
  /** Describes a change in a DownloadItem's `startTime`. */
  var startTime: js.UndefOr[StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `state`. */
  var state: js.UndefOr[StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `totalBytes`. */
  var totalBytes: js.UndefOr[DoubleDelta] = js.undefined
  /** Describes a change in a DownloadItem's `url`. */
  var url: js.UndefOr[StringDelta] = js.undefined
}

object CanResume {
  @scala.inline
  def apply(
    id: Double,
    canResume: BooleanDelta = null,
    danger: StringDelta = null,
    endTime: StringDelta = null,
    error: StringDelta = null,
    exists: BooleanDelta = null,
    fileSize: DoubleDelta = null,
    filename: StringDelta = null,
    mime: StringDelta = null,
    paused: BooleanDelta = null,
    startTime: StringDelta = null,
    state: StringDelta = null,
    totalBytes: DoubleDelta = null,
    url: StringDelta = null
  ): CanResume = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (canResume != null) __obj.updateDynamic("canResume")(canResume.asInstanceOf[js.Any])
    if (danger != null) __obj.updateDynamic("danger")(danger.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (exists != null) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (paused != null) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanResume]
  }
}

