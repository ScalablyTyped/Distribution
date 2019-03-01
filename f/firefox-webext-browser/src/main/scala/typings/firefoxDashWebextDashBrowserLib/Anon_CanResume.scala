package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanResume extends js.Object {
  var canResume: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.BooleanDelta] = js.undefined
  /** Describes a change in a DownloadItem's `danger`. */
  var danger: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `endTime`. */
  var endTime: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `error`. */
  var error: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
  var exists: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.BooleanDelta] = js.undefined
  /** Describes a change in a DownloadItem's `fileSize`. */
  var fileSize: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DoubleDelta] = js.undefined
  /** Describes a change in a DownloadItem's `filename`. */
  var filename: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
  /** The `id` of the DownloadItem that changed. */
  var id: scala.Double
  /** Describes a change in a DownloadItem's `mime`. */
  var mime: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `paused`. */
  var paused: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.BooleanDelta] = js.undefined
  /** Describes a change in a DownloadItem's `startTime`. */
  var startTime: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `state`. */
  var state: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
  /** Describes a change in a DownloadItem's `totalBytes`. */
  var totalBytes: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DoubleDelta] = js.undefined
  /** Describes a change in a DownloadItem's `url`. */
  var url: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta] = js.undefined
}

object Anon_CanResume {
  @scala.inline
  def apply(
    id: scala.Double,
    canResume: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.BooleanDelta = null,
    danger: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null,
    endTime: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null,
    error: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null,
    exists: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.BooleanDelta = null,
    fileSize: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DoubleDelta = null,
    filename: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null,
    mime: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null,
    paused: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.BooleanDelta = null,
    startTime: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null,
    state: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null,
    totalBytes: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DoubleDelta = null,
    url: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.StringDelta = null
  ): Anon_CanResume = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
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

