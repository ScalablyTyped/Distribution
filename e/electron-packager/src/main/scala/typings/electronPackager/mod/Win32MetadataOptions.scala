package typings.electronPackager.mod

import typings.electronPackager.electronPackagerStrings.asInvoker
import typings.electronPackager.electronPackagerStrings.highestAvailable
import typings.electronPackager.electronPackagerStrings.requireAdministrator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of application metadata to embed into the Windows executable.
  *
  * For more information, read the [`rcedit` Node module documentation](https://github.com/electron/node-rcedit#docs).
  */
@js.native
trait Win32MetadataOptions extends js.Object {
  
  /** Defaults to the `author` name from the nearest `package.json`. */
  var CompanyName: js.UndefOr[String] = js.native
  
  /** Defaults to either `productName` or `name` from the nearest `package.json`. */
  var FileDescription: js.UndefOr[String] = js.native
  
  /** Defaults to either `productName` or `name` from the nearest `package.json`. */
  var InternalName: js.UndefOr[String] = js.native
  
  /** Defaults to the renamed Electron `.exe` file. */
  var OriginalFilename: js.UndefOr[String] = js.native
  
  /** Defaults to either `productName` or `name` from the nearest `package.json`. */
  var ProductName: js.UndefOr[String] = js.native
  
  /**
    * Path to a local manifest file.
    *
    * See [MSDN](https://msdn.microsoft.com/en-us/library/windows/desktop/aa374191.aspx) for more details.
    */
  var `application-manifest`: js.UndefOr[String] = js.native
  
  /** See [MSDN](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) for details. */
  var `requested-execution-level`: js.UndefOr[asInvoker | highestAvailable | requireAdministrator] = js.native
}
object Win32MetadataOptions {
  
  @scala.inline
  def apply(): Win32MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32MetadataOptions]
  }
  
  @scala.inline
  implicit class Win32MetadataOptionsOps[Self <: Win32MetadataOptions] (val x: Self) extends AnyVal {
    
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
    def setCompanyName(value: String): Self = this.set("CompanyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("CompanyName", js.undefined)
    
    @scala.inline
    def setFileDescription(value: String): Self = this.set("FileDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDescription: Self = this.set("FileDescription", js.undefined)
    
    @scala.inline
    def setInternalName(value: String): Self = this.set("InternalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalName: Self = this.set("InternalName", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("OriginalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalFilename: Self = this.set("OriginalFilename", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = this.set("ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("ProductName", js.undefined)
    
    @scala.inline
    def `setApplication-manifest`(value: String): Self = this.set("application-manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteApplication-manifest`: Self = this.set("application-manifest", js.undefined)
    
    @scala.inline
    def `setRequested-execution-level`(value: asInvoker | highestAvailable | requireAdministrator): Self = this.set("requested-execution-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRequested-execution-level`: Self = this.set("requested-execution-level", js.undefined)
  }
}
