package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

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
    val __obj = js.Dynamic.literal(fileUri = fileUri, options = options, url = url)
    if (resumeData != null) __obj.updateDynamic("resumeData")(resumeData)
    __obj.asInstanceOf[DownloadPauseState]
  }
}

