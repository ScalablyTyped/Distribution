package typings.electronPackager.mod

import typings.electronPackager.electronPackagerStrings.asInvoker
import typings.electronPackager.electronPackagerStrings.highestAvailable
import typings.electronPackager.electronPackagerStrings.requireAdministrator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of application metadata to embed into the Windows executable.
  *
  * For more information, read the [`rcedit` Node module documentation](https://github.com/electron/node-rcedit#docs).
  */
trait Win32MetadataOptions extends js.Object {
  /** Defaults to the `author` name from the nearest `package.json`. */
  var CompanyName: js.UndefOr[String] = js.undefined
  /** Defaults to either `productName` or `name` from the nearest `package.json`. */
  var FileDescription: js.UndefOr[String] = js.undefined
  /** Defaults to either `productName` or `name` from the nearest `package.json`. */
  var InternalName: js.UndefOr[String] = js.undefined
  /** Defaults to the renamed Electron `.exe` file. */
  var OriginalFilename: js.UndefOr[String] = js.undefined
  /** Defaults to either `productName` or `name` from the nearest `package.json`. */
  var ProductName: js.UndefOr[String] = js.undefined
  /**
    * Path to a local manifest file.
    *
    * See [MSDN](https://msdn.microsoft.com/en-us/library/windows/desktop/aa374191.aspx) for more details.
    */
  var `application-manifest`: js.UndefOr[String] = js.undefined
  /** See [MSDN](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) for details. */
  var `requested-execution-level`: js.UndefOr[asInvoker | highestAvailable | requireAdministrator] = js.undefined
}

object Win32MetadataOptions {
  @scala.inline
  def apply(
    CompanyName: String = null,
    FileDescription: String = null,
    InternalName: String = null,
    OriginalFilename: String = null,
    ProductName: String = null,
    `application-manifest`: String = null,
    `requested-execution-level`: asInvoker | highestAvailable | requireAdministrator = null
  ): Win32MetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (CompanyName != null) __obj.updateDynamic("CompanyName")(CompanyName.asInstanceOf[js.Any])
    if (FileDescription != null) __obj.updateDynamic("FileDescription")(FileDescription.asInstanceOf[js.Any])
    if (InternalName != null) __obj.updateDynamic("InternalName")(InternalName.asInstanceOf[js.Any])
    if (OriginalFilename != null) __obj.updateDynamic("OriginalFilename")(OriginalFilename.asInstanceOf[js.Any])
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName.asInstanceOf[js.Any])
    if (`application-manifest` != null) __obj.updateDynamic("application-manifest")(`application-manifest`.asInstanceOf[js.Any])
    if (`requested-execution-level` != null) __obj.updateDynamic("requested-execution-level")(`requested-execution-level`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Win32MetadataOptions]
  }
}

