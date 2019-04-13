package typings
package dropboxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DropboxNs {
  type ClientFileReadCallback = js.Function4[
    /* err */ ApiError, 
    /* fileContents */ java.lang.String, 
    /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, 
    /* rangeInfo */ dropboxjsLib.DropboxNs.HttpNs.RangeInfo, 
    scala.Unit
  ]
  type ClientFileWriteCallback = js.Function2[/* err */ ApiError, /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, scala.Unit]
  type FileStatCallback = js.Function2[/* err */ ApiError, /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, scala.Unit]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryParamsCallback = js.Function1[/* queryParams */ QueryParams, scala.Unit]
  type ResumableUploadStepCallback = js.Function2[
    /* err */ ApiError, 
    /* uploadCursor */ dropboxjsLib.DropboxNs.HttpNs.UploadCursor, 
    scala.Unit
  ]
}
