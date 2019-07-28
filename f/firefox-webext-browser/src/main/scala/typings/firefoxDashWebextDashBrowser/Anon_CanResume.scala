package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.downloadsNs.BooleanDelta
import typings.firefoxDashWebextDashBrowser.browserNs.downloadsNs.DoubleDelta
import typings.firefoxDashWebextDashBrowser.browserNs.downloadsNs.StringDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanResume extends js.Object {
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

object Anon_CanResume {
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
  ): Anon_CanResume = {
    val __obj = js.Dynamic.literal(id = id)
    if (canResume != null) __obj.updateDynamic("canResume")(canResume)
    if (danger != null) __obj.updateDynamic("danger")(danger)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (exists != null) __obj.updateDynamic("exists")(exists)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (paused != null) __obj.updateDynamic("paused")(paused)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CanResume]
  }
}

