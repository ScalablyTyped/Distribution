package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadResult extends js.Object {
  var headers: StringDictionary[String]
  var md5: js.UndefOr[String] = js.undefined
  var status: Double
  var uri: String
}

object DownloadResult {
  @scala.inline
  def apply(headers: StringDictionary[String], status: Double, uri: String, md5: String = null): DownloadResult = {
    val __obj = js.Dynamic.literal(headers = headers, status = status, uri = uri)
    if (md5 != null) __obj.updateDynamic("md5")(md5)
    __obj.asInstanceOf[DownloadResult]
  }
}

