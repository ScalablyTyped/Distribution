package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  var ConvertingToBase64: String = js.native
  var ConvertingToBlob: String = js.native
  var Downloading: String = js.native
  var Encoding: String = js.native
  var Err_BrowserNotSupportWasm: String = js.native
  var Init_AllJsLoaded: String = js.native
  var Init_CheckDWT: String = js.native
  var Init_CheckDWTVersion: String = js.native
  var Init_CheckingLicense: String = js.native
  var Init_CompilingWasm: String = js.native
  var Init_ConfiguringDWT: String = js.native
  var Init_CreatingDWT: String = js.native
  var Init_DownloadingWasm: String = js.native
  var Init_FireBeforeInitEvt: String = js.native
  var Init_GetLicenseInfoForDWT: String = js.native
  var Init_InitActiveX: String = js.native
  var Init_InitDynamsoftService: String = js.native
  var Init_InitH5: String = js.native
  var Init_InitWasm: String = js.native
  var Init_LoadingViewerJs: String = js.native
  var Init_LookingLicense: String = js.native
  var Init_SetLicenseForDWT: String = js.native
  var Loading: String = js.native
  var LoadingPdf: String = js.native
  var LoadingTiff: String = js.native
  var SavingPdf: String = js.native
  var SavingTiff: String = js.native
  var Uploading: String = js.native
}

object Messages {
  @scala.inline
  def apply(
    ConvertingToBase64: String,
    ConvertingToBlob: String,
    Downloading: String,
    Encoding: String,
    Err_BrowserNotSupportWasm: String,
    Init_AllJsLoaded: String,
    Init_CheckDWT: String,
    Init_CheckDWTVersion: String,
    Init_CheckingLicense: String,
    Init_CompilingWasm: String,
    Init_ConfiguringDWT: String,
    Init_CreatingDWT: String,
    Init_DownloadingWasm: String,
    Init_FireBeforeInitEvt: String,
    Init_GetLicenseInfoForDWT: String,
    Init_InitActiveX: String,
    Init_InitDynamsoftService: String,
    Init_InitH5: String,
    Init_InitWasm: String,
    Init_LoadingViewerJs: String,
    Init_LookingLicense: String,
    Init_SetLicenseForDWT: String,
    Loading: String,
    LoadingPdf: String,
    LoadingTiff: String,
    SavingPdf: String,
    SavingTiff: String,
    Uploading: String
  ): Messages = {
    val __obj = js.Dynamic.literal(ConvertingToBase64 = ConvertingToBase64.asInstanceOf[js.Any], ConvertingToBlob = ConvertingToBlob.asInstanceOf[js.Any], Downloading = Downloading.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], Err_BrowserNotSupportWasm = Err_BrowserNotSupportWasm.asInstanceOf[js.Any], Init_AllJsLoaded = Init_AllJsLoaded.asInstanceOf[js.Any], Init_CheckDWT = Init_CheckDWT.asInstanceOf[js.Any], Init_CheckDWTVersion = Init_CheckDWTVersion.asInstanceOf[js.Any], Init_CheckingLicense = Init_CheckingLicense.asInstanceOf[js.Any], Init_CompilingWasm = Init_CompilingWasm.asInstanceOf[js.Any], Init_ConfiguringDWT = Init_ConfiguringDWT.asInstanceOf[js.Any], Init_CreatingDWT = Init_CreatingDWT.asInstanceOf[js.Any], Init_DownloadingWasm = Init_DownloadingWasm.asInstanceOf[js.Any], Init_FireBeforeInitEvt = Init_FireBeforeInitEvt.asInstanceOf[js.Any], Init_GetLicenseInfoForDWT = Init_GetLicenseInfoForDWT.asInstanceOf[js.Any], Init_InitActiveX = Init_InitActiveX.asInstanceOf[js.Any], Init_InitDynamsoftService = Init_InitDynamsoftService.asInstanceOf[js.Any], Init_InitH5 = Init_InitH5.asInstanceOf[js.Any], Init_InitWasm = Init_InitWasm.asInstanceOf[js.Any], Init_LoadingViewerJs = Init_LoadingViewerJs.asInstanceOf[js.Any], Init_LookingLicense = Init_LookingLicense.asInstanceOf[js.Any], Init_SetLicenseForDWT = Init_SetLicenseForDWT.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], LoadingPdf = LoadingPdf.asInstanceOf[js.Any], LoadingTiff = LoadingTiff.asInstanceOf[js.Any], SavingPdf = SavingPdf.asInstanceOf[js.Any], SavingTiff = SavingTiff.asInstanceOf[js.Any], Uploading = Uploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  @scala.inline
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConvertingToBase64(value: String): Self = this.set("ConvertingToBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def setConvertingToBlob(value: String): Self = this.set("ConvertingToBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloading(value: String): Self = this.set("Downloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setErr_BrowserNotSupportWasm(value: String): Self = this.set("Err_BrowserNotSupportWasm", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_AllJsLoaded(value: String): Self = this.set("Init_AllJsLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_CheckDWT(value: String): Self = this.set("Init_CheckDWT", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_CheckDWTVersion(value: String): Self = this.set("Init_CheckDWTVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_CheckingLicense(value: String): Self = this.set("Init_CheckingLicense", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_CompilingWasm(value: String): Self = this.set("Init_CompilingWasm", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_ConfiguringDWT(value: String): Self = this.set("Init_ConfiguringDWT", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_CreatingDWT(value: String): Self = this.set("Init_CreatingDWT", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_DownloadingWasm(value: String): Self = this.set("Init_DownloadingWasm", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_FireBeforeInitEvt(value: String): Self = this.set("Init_FireBeforeInitEvt", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_GetLicenseInfoForDWT(value: String): Self = this.set("Init_GetLicenseInfoForDWT", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_InitActiveX(value: String): Self = this.set("Init_InitActiveX", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_InitDynamsoftService(value: String): Self = this.set("Init_InitDynamsoftService", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_InitH5(value: String): Self = this.set("Init_InitH5", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_InitWasm(value: String): Self = this.set("Init_InitWasm", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_LoadingViewerJs(value: String): Self = this.set("Init_LoadingViewerJs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_LookingLicense(value: String): Self = this.set("Init_LookingLicense", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit_SetLicenseForDWT(value: String): Self = this.set("Init_SetLicenseForDWT", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: String): Self = this.set("Loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingPdf(value: String): Self = this.set("LoadingPdf", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingTiff(value: String): Self = this.set("LoadingTiff", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavingPdf(value: String): Self = this.set("SavingPdf", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavingTiff(value: String): Self = this.set("SavingTiff", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploading(value: String): Self = this.set("Uploading", value.asInstanceOf[js.Any])
  }
  
}

