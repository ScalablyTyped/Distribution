package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StringDictionary
import typings.dropboxjs.Dropbox.File.Stat
import typings.dropboxjs.Dropbox.Http.RangeInfo
import typings.dropboxjs.Dropbox.Http.UploadCursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ClientFileReadCallback = js.Function4[
/* err */ ApiError, 
/* fileContents */ String, 
/* stat */ Stat, 
/* rangeInfo */ RangeInfo, 
Unit]

type ClientFileWriteCallback = js.Function2[/* err */ ApiError, /* stat */ Stat, Unit]

type FileStatCallback = js.Function2[/* err */ ApiError, /* stat */ Stat, Unit]

type QueryParams = StringDictionary[Any]

type QueryParamsCallback = js.Function1[/* queryParams */ QueryParams, Unit]

type ResumableUploadStepCallback = js.Function2[/* err */ ApiError, /* uploadCursor */ UploadCursor, Unit]
