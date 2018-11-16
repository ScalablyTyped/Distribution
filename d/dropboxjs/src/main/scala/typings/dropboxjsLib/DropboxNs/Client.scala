package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Client")
@js.native
class Client protected () extends js.Object {
  def this(options: Credentials) = this()
  var authStep: scala.Double = js.native
  var onAuthStepChange: dropboxjsLib.DropboxNs.UtilNs.EventSource = js.native
  var onError: dropboxjsLib.DropboxNs.UtilNs.EventSource = js.native
  var onXhr: dropboxjsLib.DropboxNs.UtilNs.EventSource = js.native
  def appHash(): java.lang.String = js.native
  def appInfo(
    appKey: java.lang.String,
    callback: js.Function2[/* err */ ApiError, /* changes */ dropboxjsLib.DropboxNs.HttpNs.AppInfo, scala.Unit]
  ): stdLib.XMLHttpRequest = js.native
  def appInfo(
    callback: js.Function2[/* err */ ApiError, /* changes */ dropboxjsLib.DropboxNs.HttpNs.AppInfo, scala.Unit]
  ): stdLib.XMLHttpRequest = js.native
  def authDriver(driver: dropboxjsLib.DropboxNs.AuthDriverNs.IAuthDriver): Client = js.native
  // TODO check the error interface
  def authenticate(): Client = js.native
  def authenticate(callback: AuthenticateCallback): Client = js.native
  def authenticate(options: AuthenticateOptions): Client = js.native
  def authenticate(options: AuthenticateOptions, callback: AuthenticateCallback): Client = js.native
  def copy(
    from: dropboxjsLib.DropboxNs.FileNs.CopyReference,
    toPath: java.lang.String,
    callback: FileStatCallback
  ): stdLib.XMLHttpRequest = js.native
  def copy(from: java.lang.String, toPath: java.lang.String, callback: FileStatCallback): stdLib.XMLHttpRequest = js.native
  def copyRef(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ ApiError, 
      /* copyReference */ dropboxjsLib.DropboxNs.FileNs.CopyReference, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def credentials(): Credentials = js.native
  def delete(path: java.lang.String, callback: FileStatCallback): scala.Unit = js.native
  def delta(
    cursor: dropboxjsLib.DropboxNs.HttpNs.PulledChanges,
    callback: js.Function2[
      /* err */ ApiError, 
      /* changes */ dropboxjsLib.DropboxNs.HttpNs.PulledChanges, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def delta(
    cursor: java.lang.String,
    callback: js.Function2[
      /* err */ ApiError, 
      /* changes */ dropboxjsLib.DropboxNs.HttpNs.PulledChanges, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def dropboxUid(): java.lang.String = js.native
  def findByName(
    path: java.lang.String,
    namePattern: java.lang.String,
    callback: js.Function2[
      /* err */ ApiError, 
      /* resultStats */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def findByName(
    path: java.lang.String,
    namePattern: java.lang.String,
    options: FindByNameOptions,
    callback: js.Function2[
      /* err */ ApiError, 
      /* resultStats */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def getAccountInfo(
    callback: js.Function3[
      /* err */ ApiError, 
      /* accountInfo */ AccountInfo, 
      /* AccountInfo */ AccountInfo, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def getAccountInfo(
    options: AccountInfoOptions,
    callback: js.Function3[
      /* err */ ApiError, 
      /* accountInfo */ AccountInfo, 
      /* AccountInfo */ AccountInfo, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def hasOauthRedirectUri(
    redirectUri: java.lang.String,
    appKey: dropboxjsLib.DropboxNs.HttpNs.AppInfo,
    callback: js.Function2[/* err */ ApiError, /* hasOauthRedirectUri */ scala.Boolean, scala.Unit]
  ): stdLib.XMLHttpRequest = js.native
  def hasOauthRedirectUri(
    redirectUri: java.lang.String,
    appKey: java.lang.String,
    callback: js.Function2[/* err */ ApiError, /* hasOauthRedirectUri */ scala.Boolean, scala.Unit]
  ): stdLib.XMLHttpRequest = js.native
  def hasOauthRedirectUri(
    redirectUri: java.lang.String,
    callback: js.Function2[/* err */ ApiError, /* hasOauthRedirectUri */ scala.Boolean, scala.Unit]
  ): stdLib.XMLHttpRequest = js.native
  def history(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ ApiError, 
      /* fileVersions */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def history(
    path: java.lang.String,
    options: HistoryOptions,
    callback: js.Function2[
      /* err */ ApiError, 
      /* fileVersions */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def isAppDeveloper(
    userId: js.Any,
    appKey: js.Any,
    callbackcallback: js.Function2[/* err */ ApiError, /* isAppDeveloper */ scala.Boolean, scala.Unit]
  ): stdLib.XMLHttpRequest = js.native
  // TODO check if this can better be described
  def isAppDeveloper(
    userId: js.Any,
    callbackcallback: js.Function2[/* err */ ApiError, /* isAppDeveloper */ scala.Boolean, scala.Unit]
  ): stdLib.XMLHttpRequest = js.native
  def isAuthenticated(): scala.Boolean = js.native
  def makeCopyReference(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ ApiError, 
      /* copyReference */ dropboxjsLib.DropboxNs.FileNs.CopyReference, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def makeUrl(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ ApiError, 
      /* shareUrl */ dropboxjsLib.DropboxNs.FileNs.ShareUrl, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def makeUrl(
    path: java.lang.String,
    options: MakeURLOptions,
    callback: js.Function2[
      /* err */ ApiError, 
      /* shareUrl */ dropboxjsLib.DropboxNs.FileNs.ShareUrl, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def metadata(
    path: java.lang.String,
    callback: js.Function3[
      /* err */ ApiError, 
      /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, 
      /* folderEntries */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def metadata(
    path: java.lang.String,
    options: dropboxjsLib.DropboxNs.FileNs.StatOptions,
    callback: js.Function3[
      /* err */ ApiError, 
      /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, 
      /* folderEntries */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def mkdir(path: java.lang.String, callback: FileStatCallback): stdLib.XMLHttpRequest = js.native
  def move(fromPath: java.lang.String, toPath: java.lang.String, callback: FileStatCallback): stdLib.XMLHttpRequest = js.native
  def pollForChanges(
    cursor: dropboxjsLib.DropboxNs.HttpNs.PulledChanges,
    options: js.Object,
    callback: js.Function2[
      /* err */ ApiError, 
      /* changes */ dropboxjsLib.DropboxNs.HttpNs.PollResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def pollForChanges(
    cursor: java.lang.String,
    options: js.Object,
    callback: js.Function2[
      /* err */ ApiError, 
      /* changes */ dropboxjsLib.DropboxNs.HttpNs.PollResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def pullChanges(
    callback: js.Function2[
      /* err */ ApiError, 
      /* changes */ dropboxjsLib.DropboxNs.HttpNs.PulledChanges, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def pullChanges(
    cursor: dropboxjsLib.DropboxNs.HttpNs.PulledChanges,
    callback: js.Function2[
      /* err */ ApiError, 
      /* changes */ dropboxjsLib.DropboxNs.HttpNs.PulledChanges, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def pullChanges(
    cursor: java.lang.String,
    callback: js.Function2[
      /* err */ ApiError, 
      /* changes */ dropboxjsLib.DropboxNs.HttpNs.PulledChanges, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def readFile(path: java.lang.String, callback: ClientFileReadCallback): stdLib.XMLHttpRequest = js.native
  def readFile(path: java.lang.String, options: ClientFileReadOptions, callback: ClientFileReadCallback): stdLib.XMLHttpRequest = js.native
  def readThumbnail(path: java.lang.String, callback: ReadThumbnailCallback): stdLib.XMLHttpRequest = js.native
  def readThumbnail(path: java.lang.String, options: ReadThumbnailOptions, callback: ReadThumbnailCallback): stdLib.XMLHttpRequest = js.native
  def readdir(
    path: java.lang.String,
    callback: js.Function4[
      /* err */ ApiError, 
      /* filenames */ js.Array[java.lang.String], 
      /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, 
      /* folderEntries */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def readdir(
    path: java.lang.String,
    options: ReadDirOptions,
    callback: js.Function4[
      /* err */ ApiError, 
      /* filenames */ js.Array[java.lang.String], 
      /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, 
      /* folderEntries */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def remove(path: java.lang.String, callback: FileStatCallback): stdLib.XMLHttpRequest = js.native
  def reset(): Client = js.native
  def restore(path: java.lang.String, versionTag: java.lang.String, callback: FileStatCallback): scala.Unit = js.native
  def resumableUploadFinish(
    path: java.lang.String,
    cursor: dropboxjsLib.DropboxNs.HttpNs.UploadCursor,
    callback: ClientFileWriteCallback
  ): stdLib.XMLHttpRequest = js.native
  def resumableUploadFinish(
    path: java.lang.String,
    cursor: dropboxjsLib.DropboxNs.HttpNs.UploadCursor,
    options: ClientFileWriteOptions,
    callback: ClientFileWriteCallback
  ): stdLib.XMLHttpRequest = js.native
  def resumableUploadStep(data: js.Any, callback: ResumableUploadStepCallback): stdLib.XMLHttpRequest = js.native
  def resumableUploadStep(
    data: js.Any,
    cursor: dropboxjsLib.DropboxNs.HttpNs.UploadCursor,
    callback: ResumableUploadStepCallback
  ): stdLib.XMLHttpRequest = js.native
  def revertFile(path: java.lang.String, versionTag: java.lang.String, callback: FileStatCallback): stdLib.XMLHttpRequest = js.native
  def revisions(
    path: java.lang.String,
    options: HistoryOptions,
    callback: js.Function2[
      /* err */ ApiError, 
      /* fileVersions */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def search(
    path: java.lang.String,
    namePattern: java.lang.String,
    options: FindByNameOptions,
    callback: js.Function2[
      /* err */ ApiError, 
      /* resultStats */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setCredentials(credentials: Credentials): Client = js.native
  def signOff(callback: js.Function1[/* err */ ApiError, scala.Unit]): scala.Unit = js.native
  def signOff(options: SingOutOptions, callback: js.Function1[/* err */ ApiError, scala.Unit]): scala.Unit = js.native
  def signOut(callback: js.Function1[/* err */ ApiError, scala.Unit]): stdLib.XMLHttpRequest = js.native
  def signOut(options: SingOutOptions, callback: js.Function1[/* err */ ApiError, scala.Unit]): stdLib.XMLHttpRequest = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function3[
      /* err */ ApiError, 
      /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, 
      /* folderEntries */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def stat(
    path: java.lang.String,
    options: dropboxjsLib.DropboxNs.FileNs.StatOptions,
    callback: js.Function3[
      /* err */ ApiError, 
      /* stat */ dropboxjsLib.DropboxNs.FileNs.Stat, 
      /* folderEntries */ js.Array[dropboxjsLib.DropboxNs.FileNs.Stat], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def thumbnailUrl(path: java.lang.String): java.lang.String = js.native
  def thumbnailUrl(path: java.lang.String, options: ThumbnailUrlOptions): java.lang.String = js.native
  def unlink(path: java.lang.String, callback: FileStatCallback): scala.Unit = js.native
  def writeFile(path: java.lang.String, data: js.Any, callback: ClientFileWriteCallback): stdLib.XMLHttpRequest = js.native
  def writeFile(
    path: java.lang.String,
    data: js.Any,
    options: ClientFileWriteOptions,
    callback: ClientFileWriteCallback
  ): stdLib.XMLHttpRequest = js.native
}

@JSGlobal("Dropbox.Client")
@js.native
object Client extends js.Object {
  var AUTHORIZED: scala.Double = js.native
  var DONE: scala.Double = js.native
  var ERROR: scala.Double = js.native
  var PARAM_LOADED: scala.Double = js.native
  var PARAM_SET: scala.Double = js.native
  var RESET: scala.Double = js.native
  var SIGNED_OUT: scala.Double = js.native
}

