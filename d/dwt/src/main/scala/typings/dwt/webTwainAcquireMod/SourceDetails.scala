package typings.dwt.webTwainAcquireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceDetails extends js.Object {
  
  /**
    * Information about the driver if it's DriverType is "ICA"
    */
  var DeviceInfo: js.UndefOr[js.Any] = js.native
  
  /**
    * The driver type which can be "TWAIN" | "ICA" | "SANE"
    */
  var DriverType: js.UndefOr[String] = js.native
  
  /**
    * Whether it is the current source.
    */
  var IsCurrentSource: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether it is the default source.
    */
  var IsDefaultSource: js.UndefOr[Boolean] = js.native
  
  /**
    * The manufacturer of the data source. E.g. "TWAIN Working Group".
    */
  var Manufacturer: js.UndefOr[String] = js.native
  
  /**
    * The family name of the data source. E.g. "Software Scan".
    */
  var ProductFamily: js.UndefOr[String] = js.native
  
  /**
    * The name of the data source. E.g. "TWAIN2 FreeImage Software Scanner".
    */
  var ProductName: js.UndefOr[String] = js.native
  
  /**
    * The version of the protocol based on which the data source is developed.
    */
  var ProtocolMajor: js.UndefOr[Double] = js.native
  
  var ProtocolMinor: js.UndefOr[Double] = js.native
  
  /**
    * Supported Groups
    */
  var SupportedGroups: js.UndefOr[Double] = js.native
  
  /**
    * Detailed version of the data source.
    */
  var Version: js.UndefOr[typings.dwt.webTwainAcquireMod.Version] = js.native
}
object SourceDetails {
  
  @scala.inline
  def apply(): SourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDetails]
  }
  
  @scala.inline
  implicit class SourceDetailsOps[Self <: SourceDetails] (val x: Self) extends AnyVal {
    
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
    def setDeviceInfo(value: js.Any): Self = this.set("DeviceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceInfo: Self = this.set("DeviceInfo", js.undefined)
    
    @scala.inline
    def setDriverType(value: String): Self = this.set("DriverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriverType: Self = this.set("DriverType", js.undefined)
    
    @scala.inline
    def setIsCurrentSource(value: Boolean): Self = this.set("IsCurrentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCurrentSource: Self = this.set("IsCurrentSource", js.undefined)
    
    @scala.inline
    def setIsDefaultSource(value: Boolean): Self = this.set("IsDefaultSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultSource: Self = this.set("IsDefaultSource", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("Manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("Manufacturer", js.undefined)
    
    @scala.inline
    def setProductFamily(value: String): Self = this.set("ProductFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductFamily: Self = this.set("ProductFamily", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = this.set("ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("ProductName", js.undefined)
    
    @scala.inline
    def setProtocolMajor(value: Double): Self = this.set("ProtocolMajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolMajor: Self = this.set("ProtocolMajor", js.undefined)
    
    @scala.inline
    def setProtocolMinor(value: Double): Self = this.set("ProtocolMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolMinor: Self = this.set("ProtocolMinor", js.undefined)
    
    @scala.inline
    def setSupportedGroups(value: Double): Self = this.set("SupportedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedGroups: Self = this.set("SupportedGroups", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
