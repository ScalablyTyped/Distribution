package typings.dwt

import org.scalablytyped.runtime.Shortcut
import typings.dwt.addonOCRProMod.Settings
import typings.dwt.anon.TypeofDynamsoftStatic
import typings.dwt.dynamsoftFileUploaderMod.FileUploader
import typings.dwt.webTwainMod.WebTwain
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamsoftMod extends Shortcut {
  
  @JSImport("dwt/Dynamsoft", JSImport.Default)
  @js.native
  val default: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamsoftEnums */ Any) & TypeofDynamsoftStatic = js.native
  
  object DynamsoftStatic {
    
    @JSImport("dwt/Dynamsoft", "DynamsoftStatic")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dwt/Dynamsoft", "DynamsoftStatic.FileUploader")
    @js.native
    def FileUploader: typings.dwt.dynamsoftFileUploaderMod.FileUploader = js.native
    inline def FileUploader_=(x: FileUploader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileUploader")(x.asInstanceOf[js.Any])
    
    @JSImport("dwt/Dynamsoft", "DynamsoftStatic.Lib")
    @js.native
    def Lib: DynamsoftLib = js.native
    inline def Lib_=(x: DynamsoftLib): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lib")(x.asInstanceOf[js.Any])
    
    @JSImport("dwt/Dynamsoft", "DynamsoftStatic.MSG")
    @js.native
    def MSG: Messages = js.native
    inline def MSG_=(x: Messages): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSG")(x.asInstanceOf[js.Any])
    
    object WebTwain {
      
      object Addon {
        
        object OCRPro {
          
          @JSImport("dwt/Dynamsoft", "DynamsoftStatic.WebTwain.Addon.OCRPro")
          @js.native
          val ^ : js.Any = js.native
          
          inline def NewSettings(): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("NewSettings")().asInstanceOf[Settings]
        }
      }
    }
    
    @JSImport("dwt/Dynamsoft", "DynamsoftStatic.WebTwainEnv")
    @js.native
    def WebTwainEnv: typings.dwt.dynamsoftMod.WebTwainEnv = js.native
    inline def WebTwainEnv_=(x: WebTwainEnv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebTwainEnv")(x.asInstanceOf[js.Any])
    
    @JSImport("dwt/Dynamsoft", "DynamsoftStatic.managerEnv")
    @js.native
    def managerEnv: ManagerEnv = js.native
    inline def managerEnv_=(x: ManagerEnv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("managerEnv")(x.asInstanceOf[js.Any])
  }
  
  trait Container extends StObject {
    
    var ContainerId: js.UndefOr[String] = js.undefined
    
    var Height: js.UndefOr[String | Double] = js.undefined
    
    var WebTwainId: String
    
    var Width: js.UndefOr[String | Double] = js.undefined
    
    var bLocalService: js.UndefOr[Boolean] = js.undefined
    
    var bNoUI: js.UndefOr[Boolean] = js.undefined
  }
  object Container {
    
    inline def apply(WebTwainId: String): Container = {
      val __obj = js.Dynamic.literal(WebTwainId = WebTwainId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setBLocalService(value: Boolean): Self = StObject.set(x, "bLocalService", value.asInstanceOf[js.Any])
      
      inline def setBLocalServiceUndefined: Self = StObject.set(x, "bLocalService", js.undefined)
      
      inline def setBNoUI(value: Boolean): Self = StObject.set(x, "bNoUI", value.asInstanceOf[js.Any])
      
      inline def setBNoUIUndefined: Self = StObject.set(x, "bNoUI", js.undefined)
      
      inline def setContainerId(value: String): Self = StObject.set(x, "ContainerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "ContainerId", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
      
      inline def setWebTwainId(value: String): Self = StObject.set(x, "WebTwainId", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
    }
  }
  
  trait DSLibDetect extends StObject {
    
    val scriptLoaded: Boolean
    
    /**
      * Whether or not the site is secure (Https://).
      */
    val ssl: Boolean
  }
  object DSLibDetect {
    
    inline def apply(scriptLoaded: Boolean, ssl: Boolean): DSLibDetect = {
      val __obj = js.Dynamic.literal(scriptLoaded = scriptLoaded.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any])
      __obj.asInstanceOf[DSLibDetect]
    }
    
    extension [Self <: DSLibDetect](x: Self) {
      
      inline def setScriptLoaded(value: Boolean): Self = StObject.set(x, "scriptLoaded", value.asInstanceOf[js.Any])
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    }
  }
  
  trait DSLibEnv extends StObject {
    
    /**
      * The WebSocket session id.
      */
    val WSSession: Double
    
    /**
      * The WebSocket version.
      */
    val WSVersion: String
    
    /**
      * Whether the browser is Chrome.
      */
    val bChrome: Boolean
    
    /**
      * Whether the browser is Edge.
      */
    val bEdge: Boolean
    
    /**
      * Whether the page is opening from the disk.
      */
    val bFileSystem: Boolean
    
    /**
      * Whether the browser is Firefox.
      */
    val bFirefox: Boolean
    
    /**
      * Whether the browser is IE.
      */
    val bIE: Boolean
    
    /**
      * Whether the operating system is Linux.
      */
    val bLinux: Boolean
    
    /**
      * Whether the operating system is macOS.
      */
    val bMac: Boolean
    
    /**
      * Whether the operating system is mobile (Android & iOS & iPadOS).
      */
    val bMobile: Boolean
    
    /**
      * Whether the browser is Safari.
      */
    val bSafari: Boolean
    
    /**
      * Whether the operating system is Windows.
      */
    val bWin: Boolean
    
    /**
      * Whether the operating system is 64bit Windows.
      */
    val bWin64: Boolean
    
    /**
      * The base path.
      */
    val basePath: String
    
    /**
      * The plugin lenghth.
      */
    val iPluginLength: Double
    
    /**
      * Whether it is a desktop viewer.
      */
    def isDesktopViewer(): Boolean
    
    /**
      * Whether it is a mobile viewer.
      */
    def isMobileViewer(): Boolean
    
    /**
      * Whether it is a pad viewer.
      */
    def isPadViewer(): Boolean
    
    /**
      * Whether the platform is 64bit.
      */
    val isX64: Boolean
    
    /**
      * Information about macOSX.
      */
    val macOSX: String
    
    /**
      * OS version.
      */
    val osVersion: String
    
    /**
      * The path type used to calculate the real path.
      */
    val pathType: Double
    
    /**
      * The version of Chrome.
      */
    val strChromeVersion: Double | String
    
    /**
      * The version of Firefox.
      */
    val strFirefoxVersion: Double | String
    
    /**
      * The version of IE.
      */
    val strIEVersion: Double | String
  }
  object DSLibEnv {
    
    inline def apply(
      WSSession: Double,
      WSVersion: String,
      bChrome: Boolean,
      bEdge: Boolean,
      bFileSystem: Boolean,
      bFirefox: Boolean,
      bIE: Boolean,
      bLinux: Boolean,
      bMac: Boolean,
      bMobile: Boolean,
      bSafari: Boolean,
      bWin: Boolean,
      bWin64: Boolean,
      basePath: String,
      iPluginLength: Double,
      isDesktopViewer: () => Boolean,
      isMobileViewer: () => Boolean,
      isPadViewer: () => Boolean,
      isX64: Boolean,
      macOSX: String,
      osVersion: String,
      pathType: Double,
      strChromeVersion: Double | String,
      strFirefoxVersion: Double | String,
      strIEVersion: Double | String
    ): DSLibEnv = {
      val __obj = js.Dynamic.literal(WSSession = WSSession.asInstanceOf[js.Any], WSVersion = WSVersion.asInstanceOf[js.Any], bChrome = bChrome.asInstanceOf[js.Any], bEdge = bEdge.asInstanceOf[js.Any], bFileSystem = bFileSystem.asInstanceOf[js.Any], bFirefox = bFirefox.asInstanceOf[js.Any], bIE = bIE.asInstanceOf[js.Any], bLinux = bLinux.asInstanceOf[js.Any], bMac = bMac.asInstanceOf[js.Any], bMobile = bMobile.asInstanceOf[js.Any], bSafari = bSafari.asInstanceOf[js.Any], bWin = bWin.asInstanceOf[js.Any], bWin64 = bWin64.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], iPluginLength = iPluginLength.asInstanceOf[js.Any], isDesktopViewer = js.Any.fromFunction0(isDesktopViewer), isMobileViewer = js.Any.fromFunction0(isMobileViewer), isPadViewer = js.Any.fromFunction0(isPadViewer), isX64 = isX64.asInstanceOf[js.Any], macOSX = macOSX.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any], strChromeVersion = strChromeVersion.asInstanceOf[js.Any], strFirefoxVersion = strFirefoxVersion.asInstanceOf[js.Any], strIEVersion = strIEVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[DSLibEnv]
    }
    
    extension [Self <: DSLibEnv](x: Self) {
      
      inline def setBChrome(value: Boolean): Self = StObject.set(x, "bChrome", value.asInstanceOf[js.Any])
      
      inline def setBEdge(value: Boolean): Self = StObject.set(x, "bEdge", value.asInstanceOf[js.Any])
      
      inline def setBFileSystem(value: Boolean): Self = StObject.set(x, "bFileSystem", value.asInstanceOf[js.Any])
      
      inline def setBFirefox(value: Boolean): Self = StObject.set(x, "bFirefox", value.asInstanceOf[js.Any])
      
      inline def setBIE(value: Boolean): Self = StObject.set(x, "bIE", value.asInstanceOf[js.Any])
      
      inline def setBLinux(value: Boolean): Self = StObject.set(x, "bLinux", value.asInstanceOf[js.Any])
      
      inline def setBMac(value: Boolean): Self = StObject.set(x, "bMac", value.asInstanceOf[js.Any])
      
      inline def setBMobile(value: Boolean): Self = StObject.set(x, "bMobile", value.asInstanceOf[js.Any])
      
      inline def setBSafari(value: Boolean): Self = StObject.set(x, "bSafari", value.asInstanceOf[js.Any])
      
      inline def setBWin(value: Boolean): Self = StObject.set(x, "bWin", value.asInstanceOf[js.Any])
      
      inline def setBWin64(value: Boolean): Self = StObject.set(x, "bWin64", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setIPluginLength(value: Double): Self = StObject.set(x, "iPluginLength", value.asInstanceOf[js.Any])
      
      inline def setIsDesktopViewer(value: () => Boolean): Self = StObject.set(x, "isDesktopViewer", js.Any.fromFunction0(value))
      
      inline def setIsMobileViewer(value: () => Boolean): Self = StObject.set(x, "isMobileViewer", js.Any.fromFunction0(value))
      
      inline def setIsPadViewer(value: () => Boolean): Self = StObject.set(x, "isPadViewer", js.Any.fromFunction0(value))
      
      inline def setIsX64(value: Boolean): Self = StObject.set(x, "isX64", value.asInstanceOf[js.Any])
      
      inline def setMacOSX(value: String): Self = StObject.set(x, "macOSX", value.asInstanceOf[js.Any])
      
      inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      inline def setPathType(value: Double): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
      
      inline def setStrChromeVersion(value: Double | String): Self = StObject.set(x, "strChromeVersion", value.asInstanceOf[js.Any])
      
      inline def setStrFirefoxVersion(value: Double | String): Self = StObject.set(x, "strFirefoxVersion", value.asInstanceOf[js.Any])
      
      inline def setStrIEVersion(value: Double | String): Self = StObject.set(x, "strIEVersion", value.asInstanceOf[js.Any])
      
      inline def setWSSession(value: Double): Self = StObject.set(x, "WSSession", value.asInstanceOf[js.Any])
      
      inline def setWSVersion(value: String): Self = StObject.set(x, "WSVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait DWTInitialConfig extends StObject {
    
    var Host: js.UndefOr[String] = js.undefined
    
    var Port: js.UndefOr[String] = js.undefined
    
    var SSLPort: js.UndefOr[String] = js.undefined
    
    var WebTwainId: String
  }
  object DWTInitialConfig {
    
    inline def apply(WebTwainId: String): DWTInitialConfig = {
      val __obj = js.Dynamic.literal(WebTwainId = WebTwainId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DWTInitialConfig]
    }
    
    extension [Self <: DWTInitialConfig](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
      
      inline def setSSLPort(value: String): Self = StObject.set(x, "SSLPort", value.asInstanceOf[js.Any])
      
      inline def setSSLPortUndefined: Self = StObject.set(x, "SSLPort", js.undefined)
      
      inline def setWebTwainId(value: String): Self = StObject.set(x, "WebTwainId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayInfo extends StObject {
    
    var buttons: Any
    
    var customProgressText: Any
    
    var dialogText: Any
    
    var errorMessages: Any
    
    var generalMessages: Any
  }
  object DisplayInfo {
    
    inline def apply(buttons: Any, customProgressText: Any, dialogText: Any, errorMessages: Any, generalMessages: Any): DisplayInfo = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], customProgressText = customProgressText.asInstanceOf[js.Any], dialogText = dialogText.asInstanceOf[js.Any], errorMessages = errorMessages.asInstanceOf[js.Any], generalMessages = generalMessages.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayInfo]
    }
    
    extension [Self <: DisplayInfo](x: Self) {
      
      inline def setButtons(value: Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setCustomProgressText(value: Any): Self = StObject.set(x, "customProgressText", value.asInstanceOf[js.Any])
      
      inline def setDialogText(value: Any): Self = StObject.set(x, "dialogText", value.asInstanceOf[js.Any])
      
      inline def setErrorMessages(value: Any): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
      
      inline def setGeneralMessages(value: Any): Self = StObject.set(x, "generalMessages", value.asInstanceOf[js.Any])
    }
  }
  
  trait DynamsoftLib extends StObject {
    
    /**
      * A built-in method to set up a listener for the specified event type on the target element.
      * @param target Specify the HTML element.
      * @param type Specify the event
      * @param listener Specify the callback
      */
    def addEventListener(target: HTMLElement, `type`: String, listener: EventListenerOrEventListenerObject): Unit
    
    /**
      * Whether to enable debugging. Once enabled, debugging inforamtion is printed out in the browser console.
      */
    var debug: Boolean
    
    var detect: DSLibDetect
    
    var dlgLoadingShowStatus: Boolean
    
    var env: DSLibEnv
    
    /**
      * Load the specified script.
      * @param url Specify the URL of the script.
      * @param bAsync Whether to load the script asynchronously.
      * @param callback Callback function triggered when the script is loaded.
      */
    def getScript(url: String, bAsync: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * Load the specified scripts.
      * @param urls Specify the URLs of the scripts.
      * @param bAsync Whether to load the script asynchronously.
      * @param callback Callback function triggered when the scripts are all loaded.
      */
    def getScripts(urls: js.Array[String], bAsync: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * Hide the built-in page mask
      */
    def hideMask(): Unit
    
    var product: Product
    
    /**
      * Show the built-in page mask
      */
    def showMask(): Unit
  }
  object DynamsoftLib {
    
    inline def apply(
      addEventListener: (HTMLElement, String, EventListenerOrEventListenerObject) => Unit,
      debug: Boolean,
      detect: DSLibDetect,
      dlgLoadingShowStatus: Boolean,
      env: DSLibEnv,
      getScript: (String, Boolean, js.Function0[Unit]) => Unit,
      getScripts: (js.Array[String], Boolean, js.Function0[Unit]) => Unit,
      hideMask: () => Unit,
      product: Product,
      showMask: () => Unit
    ): DynamsoftLib = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), debug = debug.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], dlgLoadingShowStatus = dlgLoadingShowStatus.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getScript = js.Any.fromFunction3(getScript), getScripts = js.Any.fromFunction3(getScripts), hideMask = js.Any.fromFunction0(hideMask), product = product.asInstanceOf[js.Any], showMask = js.Any.fromFunction0(showMask))
      __obj.asInstanceOf[DynamsoftLib]
    }
    
    extension [Self <: DynamsoftLib](x: Self) {
      
      inline def setAddEventListener(value: (HTMLElement, String, EventListenerOrEventListenerObject) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDetect(value: DSLibDetect): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
      
      inline def setDlgLoadingShowStatus(value: Boolean): Self = StObject.set(x, "dlgLoadingShowStatus", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: DSLibEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setGetScript(value: (String, Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "getScript", js.Any.fromFunction3(value))
      
      inline def setGetScripts(value: (js.Array[String], Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "getScripts", js.Any.fromFunction3(value))
      
      inline def setHideMask(value: () => Unit): Self = StObject.set(x, "hideMask", js.Any.fromFunction0(value))
      
      inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setShowMask(value: () => Unit): Self = StObject.set(x, "showMask", js.Any.fromFunction0(value))
    }
  }
  
  trait ManagerEnv extends StObject {
    
    var IfUpdateService: Boolean
    
    var resourcesPath: String
  }
  object ManagerEnv {
    
    inline def apply(IfUpdateService: Boolean, resourcesPath: String): ManagerEnv = {
      val __obj = js.Dynamic.literal(IfUpdateService = IfUpdateService.asInstanceOf[js.Any], resourcesPath = resourcesPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManagerEnv]
    }
    
    extension [Self <: ManagerEnv](x: Self) {
      
      inline def setIfUpdateService(value: Boolean): Self = StObject.set(x, "IfUpdateService", value.asInstanceOf[js.Any])
      
      inline def setResourcesPath(value: String): Self = StObject.set(x, "resourcesPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Messages extends StObject {
    
    var ConvertingToBase64: String
    
    var ConvertingToBlob: String
    
    var Downloading: String
    
    var Encoding: String
    
    var Err_BrowserNotSupportWasm: String
    
    var Init_AllJsLoaded: String
    
    var Init_CheckDWT: String
    
    var Init_CheckDWTVersion: String
    
    var Init_CheckingLicense: String
    
    var Init_CompilingWasm: String
    
    var Init_ConfiguringDWT: String
    
    var Init_CreatingDWT: String
    
    var Init_DownloadingWasm: String
    
    var Init_FireBeforeInitEvt: String
    
    var Init_GetLicenseInfoForDWT: String
    
    var Init_InitActiveX: String
    
    var Init_InitDynamsoftService: String
    
    var Init_InitH5: String
    
    var Init_InitWasm: String
    
    var Init_LoadingViewerJs: String
    
    var Init_LookingLicense: String
    
    var Init_SetLicenseForDWT: String
    
    var Loading: String
    
    var LoadingPdf: String
    
    var LoadingTiff: String
    
    var SavingPdf: String
    
    var SavingTiff: String
    
    var Uploading: String
  }
  object Messages {
    
    inline def apply(
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
    
    extension [Self <: Messages](x: Self) {
      
      inline def setConvertingToBase64(value: String): Self = StObject.set(x, "ConvertingToBase64", value.asInstanceOf[js.Any])
      
      inline def setConvertingToBlob(value: String): Self = StObject.set(x, "ConvertingToBlob", value.asInstanceOf[js.Any])
      
      inline def setDownloading(value: String): Self = StObject.set(x, "Downloading", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
      
      inline def setErr_BrowserNotSupportWasm(value: String): Self = StObject.set(x, "Err_BrowserNotSupportWasm", value.asInstanceOf[js.Any])
      
      inline def setInit_AllJsLoaded(value: String): Self = StObject.set(x, "Init_AllJsLoaded", value.asInstanceOf[js.Any])
      
      inline def setInit_CheckDWT(value: String): Self = StObject.set(x, "Init_CheckDWT", value.asInstanceOf[js.Any])
      
      inline def setInit_CheckDWTVersion(value: String): Self = StObject.set(x, "Init_CheckDWTVersion", value.asInstanceOf[js.Any])
      
      inline def setInit_CheckingLicense(value: String): Self = StObject.set(x, "Init_CheckingLicense", value.asInstanceOf[js.Any])
      
      inline def setInit_CompilingWasm(value: String): Self = StObject.set(x, "Init_CompilingWasm", value.asInstanceOf[js.Any])
      
      inline def setInit_ConfiguringDWT(value: String): Self = StObject.set(x, "Init_ConfiguringDWT", value.asInstanceOf[js.Any])
      
      inline def setInit_CreatingDWT(value: String): Self = StObject.set(x, "Init_CreatingDWT", value.asInstanceOf[js.Any])
      
      inline def setInit_DownloadingWasm(value: String): Self = StObject.set(x, "Init_DownloadingWasm", value.asInstanceOf[js.Any])
      
      inline def setInit_FireBeforeInitEvt(value: String): Self = StObject.set(x, "Init_FireBeforeInitEvt", value.asInstanceOf[js.Any])
      
      inline def setInit_GetLicenseInfoForDWT(value: String): Self = StObject.set(x, "Init_GetLicenseInfoForDWT", value.asInstanceOf[js.Any])
      
      inline def setInit_InitActiveX(value: String): Self = StObject.set(x, "Init_InitActiveX", value.asInstanceOf[js.Any])
      
      inline def setInit_InitDynamsoftService(value: String): Self = StObject.set(x, "Init_InitDynamsoftService", value.asInstanceOf[js.Any])
      
      inline def setInit_InitH5(value: String): Self = StObject.set(x, "Init_InitH5", value.asInstanceOf[js.Any])
      
      inline def setInit_InitWasm(value: String): Self = StObject.set(x, "Init_InitWasm", value.asInstanceOf[js.Any])
      
      inline def setInit_LoadingViewerJs(value: String): Self = StObject.set(x, "Init_LoadingViewerJs", value.asInstanceOf[js.Any])
      
      inline def setInit_LookingLicense(value: String): Self = StObject.set(x, "Init_LookingLicense", value.asInstanceOf[js.Any])
      
      inline def setInit_SetLicenseForDWT(value: String): Self = StObject.set(x, "Init_SetLicenseForDWT", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: String): Self = StObject.set(x, "Loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingPdf(value: String): Self = StObject.set(x, "LoadingPdf", value.asInstanceOf[js.Any])
      
      inline def setLoadingTiff(value: String): Self = StObject.set(x, "LoadingTiff", value.asInstanceOf[js.Any])
      
      inline def setSavingPdf(value: String): Self = StObject.set(x, "SavingPdf", value.asInstanceOf[js.Any])
      
      inline def setSavingTiff(value: String): Self = StObject.set(x, "SavingTiff", value.asInstanceOf[js.Any])
      
      inline def setUploading(value: String): Self = StObject.set(x, "Uploading", value.asInstanceOf[js.Any])
    }
  }
  
  trait Product extends StObject {
    
    var bActiveXEdition: Boolean
    
    var bChromeEdition: Boolean
    
    var bHTML5Edition: Boolean
    
    var bPluginEdition: Boolean
    
    var host: String
    
    var name: String
  }
  object Product {
    
    inline def apply(
      bActiveXEdition: Boolean,
      bChromeEdition: Boolean,
      bHTML5Edition: Boolean,
      bPluginEdition: Boolean,
      host: String,
      name: String
    ): Product = {
      val __obj = js.Dynamic.literal(bActiveXEdition = bActiveXEdition.asInstanceOf[js.Any], bChromeEdition = bChromeEdition.asInstanceOf[js.Any], bHTML5Edition = bHTML5Edition.asInstanceOf[js.Any], bPluginEdition = bPluginEdition.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Product]
    }
    
    extension [Self <: Product](x: Self) {
      
      inline def setBActiveXEdition(value: Boolean): Self = StObject.set(x, "bActiveXEdition", value.asInstanceOf[js.Any])
      
      inline def setBChromeEdition(value: Boolean): Self = StObject.set(x, "bChromeEdition", value.asInstanceOf[js.Any])
      
      inline def setBHTML5Edition(value: Boolean): Self = StObject.set(x, "bHTML5Edition", value.asInstanceOf[js.Any])
      
      inline def setBPluginEdition(value: Boolean): Self = StObject.set(x, "bPluginEdition", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebTwainEnv extends StObject {
    
    /**
      * Whether to install the ActiveX with CAB.
      */
    var ActiveXInstallWithCAB: Boolean = js.native
    
    /**
      * The version of the ActiveX;
      */
    val ActiveXVersion: String = js.native
    
    /**
      * Whether to create a WebTwain instance automatically upon page load.
      */
    var AutoLoad: Boolean = js.native
    
    /**
      * Close a dialog opened by the method ShowDialog.
      */
    def CloseDialog(): Unit = js.native
    
    def ConnectToTheService(): Unit = js.native
    
    /**
      * A map of all WebTwain instances.
      */
    var ContainerMap: Any = js.native
    
    /**
      * Define the Id and UI of the WebTwain instances.
      */
    var Containers: js.Array[Container] = js.native
    
    /**
      * Create a WebTwain instance with UI.
      * @param ContainerId Specify the HTML element (typically of the type HTMLDivElement) to hold the UI.
      * @param host Specify the host.
      * @param port Specify the port.
      * @param portSSL Specify the SSL port.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      */
    def CreateDWTObject(
      ContainerId: String,
      host: String,
      port: String,
      portSSL: String,
      successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
      failureCallBack: js.Function1[/* errorString */ String, Unit]
    ): Unit = js.native
    def CreateDWTObject(
      ContainerId: String,
      host: String,
      port: String,
      portSSL: Double,
      successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
      failureCallBack: js.Function1[/* errorString */ String, Unit]
    ): Unit = js.native
    def CreateDWTObject(
      ContainerId: String,
      host: String,
      port: Double,
      portSSL: String,
      successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
      failureCallBack: js.Function1[/* errorString */ String, Unit]
    ): Unit = js.native
    def CreateDWTObject(
      ContainerId: String,
      host: String,
      port: Double,
      portSSL: Double,
      successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
      failureCallBack: js.Function1[/* errorString */ String, Unit]
    ): Unit = js.native
    /**
      * Create a WebTwain instance with UI.
      * @param ContainerId Specify the HTML element (typically of the type HTMLDivElement) to hold the UI.
      * @param host Specify the host.
      * @param port Specify the port.
      * @param portSSL Specify the SSL port.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      */
    def CreateDWTObject(
      ContainerId: String,
      successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
      failureCallBack: js.Function1[/* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Create a WebTwain instance without UI.
      * @param WebTwainId Specify the Id of the instance.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      */
    def CreateDWTObjectEx(
      dwtInitialConfig: DWTInitialConfig,
      successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
      failureCallBack: js.Function1[/* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Define the display info.
      */
    var CustomizableDisplayInfo: DisplayInfo = js.native
    
    /**
      * Remove and destroy a WebTwain instance.
      * @param Id Specify the instance with its ContainerId or WebTwainId.
      */
    def DeleteDWTObject(Id: String): Boolean = js.native
    
    /**
      * Return the WebTwain instance specified by its ContainerId. If no parameter is provided, the first valid WebTwain instance is returnd.
      * @param ContainerId The ContainerId.
      */
    def GetWebTwain(): WebTwain = js.native
    def GetWebTwain(ContainerId: String): WebTwain = js.native
    
    /**
      * Return the WebTwain instance specified by its WebTwainId. If no parameter is provided, the first valid WebTwain instance is returnd.
      * @param WebTwainId The WebTwainId.
      */
    def GetWebTwainEx(): WebTwain = js.native
    def GetWebTwainEx(WebTwainId: String): WebTwain = js.native
    
    /**
      * Whether or not an md5 header `dwt-md5` should be included in HTTP upload requests.
      */
    var IfAddMD5InUploadHeader: Boolean = js.native
    
    /**
      * Whether to confine the mask within the viewer element.
      */
    var IfConfineMaskWithinTheViewer: Boolean = js.native
    
    /**
      * Whether to use ActiveX for IE 10 & 11.
      */
    var IfUseActiveXForIE10Plus: Boolean = js.native
    
    /**
      * The version of the JavaScript script.
      */
    val JSVersion: String = js.native
    
    /**
      * Create a WebTwain instance(s).
      */
    def Load(): Unit = js.native
    
    /**
      * A callback function that is executed when the WebTwain related files are not found.
      */
    def OnWebTwainNotFound(): js.Object = js.native
    
    /**
      * A callback function that is executed after a time-consuming operation.
      */
    def OnWebTwainPostExecute(): js.Object = js.native
    
    /**
      * A callback function that is executed before a time-consuming operation.
      */
    def OnWebTwainPreExecute(): js.Object = js.native
    
    /**
      * A callback function that is executed when a WebTwain instance is created.
      */
    def OnWebTwainReady(): js.Object = js.native
    
    /**
      * A callback function that is executed right before the creation of a WebTwain instance.
      */
    def OnWebTwainWillInit(): js.Object = js.native
    
    /**
      * The version of the PDF module (not the rasterizer).
      */
    var PdfVersion: String = js.native
    
    /**
      * The version of the plug-in edition.
      */
    var PluginVersion: String = js.native
    
    /**
      * Set or return the product key for the library. A product key is required to enables certain modules of the library.
      */
    var ProductKey: String = js.native
    
    /**
      * The product name.
      */
    val ProductName: String = js.native
    
    /**
      * Attach the callback function to the specified event.
      * @param event Specify the event.
      * @param callback Specify the callback.
      */
    def RegisterEvent(event: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    /**
      * Remove all authorizations for accessing local resources.
      */
    def RemoveAllAuthorizations(): Unit = js.native
    
    /**
      * Set or return where the library looks for resources files including service installers, CSS, etc.
      */
    var ResourcesPath: String = js.native
    
    /**
      * The version of the Linux edition (the service, not wasm).
      */
    var ServerLinuxVersionInfo: String = js.native
    
    /**
      * The version of the macOS edition (the service, not wasm).
      */
    var ServerMacVersionInfo: String = js.native
    
    /**
      * The version of the Windows edition (the service, not wasm).
      */
    var ServerVersionInfo: String = js.native
    
    /**
      * Built-in method to show a modal dialog.
      * @param width Width of the dialog.
      * @param height Height of the dialog.
      * @param content Content of the dialog.
      * @param simple Whether to show a simple dialog with no header.
      * @param hideCloseButton Whether to hide the close button.
      */
    def ShowDialog(width: Double, height: Double, content: String, simple: Boolean, hideCloseButton: Boolean): Unit = js.native
    
    /**
      * Remove and destroy all WebTwain instances.
      */
    def Unload(): Unit = js.native
    
    /**
      * Whether to download the wasm for Camera Addon to use on initialization.
      */
    var UseCameraAddonWasm: Boolean = js.native
    
    /**
      * Whether to use the library in Local-Service mode or WASM mode.
      */
    var UseLocalService: Boolean = js.native
    
    var initQueue: js.Array[Any] = js.native
  }
  
  type _To = (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamsoftEnums */ Any) & TypeofDynamsoftStatic
  
  /* This means you don't have to write `default`, but can instead just say `dynamsoftMod.foo` */
  override def _to: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamsoftEnums */ Any) & TypeofDynamsoftStatic = default
}
