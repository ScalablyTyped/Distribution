package typings.dwt.webTwainAcquireMod

import typings.dwt.anon.AutoBorderDetection
import typings.dwt.anon.BDuplex
import typings.dwt.anon.BShowIndicator
import typings.dwt.anon.CompressionType
import typings.dwt.anon.Format
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTransferMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanSetup extends js.Object {
  
  /**
    * Whether to ignore or fail the acquistion when an exception is raised. Set "ignore" or "fail".
    */
  var exception: js.UndefOr[String] = js.native
  
  /**
    * Set how the transfer is done.
    */
  var fileXfer: js.UndefOr[CompressionType] = js.native
  
  /**
    * A callback triggered before the scan, after the scan and after each page has been transferred.
    */
  var funcScanStatus: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.native
  
  /**
    * Set where the scanned images are inserted.
    */
  var insertingIndex: js.UndefOr[Double] = js.native
  
  var moreSettings: js.UndefOr[AutoBorderDetection] = js.native
  
  /**
    * Set up how the scanned images are outputted.
    */
  var outputSetup: js.UndefOr[Format] = js.native
  
  /**
    * The profile is a base64 string, if present, it overrides settings and more settings.
    */
  var profile: js.UndefOr[String] = js.native
  
  /**
    * The name of the data source (the scanner). If not set, the default data source is used.
    */
  var scanner: js.UndefOr[String] = js.native
  
  /**
    * Basic settings.
    */
  var settings: js.UndefOr[BDuplex] = js.native
  
  /**
    * An id that specifies this specific setup.
    */
  var setupId: js.UndefOr[String] = js.native
  
  /**
    * The TWAIN transfer mode.
    */
  var transferMode: js.UndefOr[EnumDWTTransferMode | Double] = js.native
  
  var ui: js.UndefOr[BShowIndicator] = js.native
}
object ScanSetup {
  
  @scala.inline
  def apply(): ScanSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanSetup]
  }
  
  @scala.inline
  implicit class ScanSetupOps[Self <: ScanSetup] (val x: Self) extends AnyVal {
    
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
    def setException(value: String): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    
    @scala.inline
    def setFileXfer(value: CompressionType): Self = this.set("fileXfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileXfer: Self = this.set("fileXfer", js.undefined)
    
    @scala.inline
    def setFuncScanStatus(value: /* status */ Status => Unit): Self = this.set("funcScanStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFuncScanStatus: Self = this.set("funcScanStatus", js.undefined)
    
    @scala.inline
    def setInsertingIndex(value: Double): Self = this.set("insertingIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertingIndex: Self = this.set("insertingIndex", js.undefined)
    
    @scala.inline
    def setMoreSettings(value: AutoBorderDetection): Self = this.set("moreSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreSettings: Self = this.set("moreSettings", js.undefined)
    
    @scala.inline
    def setOutputSetup(value: Format): Self = this.set("outputSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSetup: Self = this.set("outputSetup", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setScanner(value: String): Self = this.set("scanner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanner: Self = this.set("scanner", js.undefined)
    
    @scala.inline
    def setSettings(value: BDuplex): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSetupId(value: String): Self = this.set("setupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupId: Self = this.set("setupId", js.undefined)
    
    @scala.inline
    def setTransferMode(value: EnumDWTTransferMode | Double): Self = this.set("transferMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferMode: Self = this.set("transferMode", js.undefined)
    
    @scala.inline
    def setUi(value: BShowIndicator): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
}
