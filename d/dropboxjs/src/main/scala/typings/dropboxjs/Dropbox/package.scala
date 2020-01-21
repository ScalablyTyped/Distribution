package typings.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Dropbox {
  type ClientFileReadCallback = js.Function4[
    /* err */ typings.dropboxjs.Dropbox.ApiError, 
    /* fileContents */ java.lang.String, 
    /* stat */ typings.dropboxjs.Dropbox.File.Stat, 
    /* rangeInfo */ typings.dropboxjs.Dropbox.Http.RangeInfo, 
    scala.Unit
  ]
  type ClientFileWriteCallback = js.Function2[
    /* err */ typings.dropboxjs.Dropbox.ApiError, 
    /* stat */ typings.dropboxjs.Dropbox.File.Stat, 
    scala.Unit
  ]
  type FileStatCallback = js.Function2[
    /* err */ typings.dropboxjs.Dropbox.ApiError, 
    /* stat */ typings.dropboxjs.Dropbox.File.Stat, 
    scala.Unit
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryParamsCallback = js.Function1[/* queryParams */ typings.dropboxjs.Dropbox.QueryParams, scala.Unit]
  type ResumableUploadStepCallback = js.Function2[
    /* err */ typings.dropboxjs.Dropbox.ApiError, 
    /* uploadCursor */ typings.dropboxjs.Dropbox.Http.UploadCursor, 
    scala.Unit
  ]
}
