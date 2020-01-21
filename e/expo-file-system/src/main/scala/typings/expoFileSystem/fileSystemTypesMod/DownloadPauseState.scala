package typings.expoFileSystem.fileSystemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPauseState extends js.Object {
  var fileUri: String
  var options: DownloadOptions
  var resumeData: js.UndefOr[String] = js.undefined
  var url: String
}

object DownloadPauseState {
  @scala.inline
  def apply(fileUri: String, options: DownloadOptions, url: String, resumeData: String = null): DownloadPauseState = {
    val __obj = js.Dynamic.literal(fileUri = fileUri.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (resumeData != null) __obj.updateDynamic("resumeData")(resumeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPauseState]
  }
}

