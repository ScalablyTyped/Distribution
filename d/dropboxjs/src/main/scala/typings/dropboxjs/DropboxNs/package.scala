package typings.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DropboxNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.dropboxjs.DropboxNs.FileNs.Stat
  import typings.dropboxjs.DropboxNs.HttpNs.RangeInfo
  import typings.dropboxjs.DropboxNs.HttpNs.UploadCursor

  type ClientFileReadCallback = js.Function4[
    /* err */ ApiError, 
    /* fileContents */ String, 
    /* stat */ Stat, 
    /* rangeInfo */ RangeInfo, 
    Unit
  ]
  type ClientFileWriteCallback = js.Function2[/* err */ ApiError, /* stat */ Stat, Unit]
  type FileStatCallback = js.Function2[/* err */ ApiError, /* stat */ Stat, Unit]
  type QueryParams = StringDictionary[js.Any]
  type QueryParamsCallback = js.Function1[/* queryParams */ QueryParams, Unit]
  type ResumableUploadStepCallback = js.Function2[/* err */ ApiError, /* uploadCursor */ UploadCursor, Unit]
}
