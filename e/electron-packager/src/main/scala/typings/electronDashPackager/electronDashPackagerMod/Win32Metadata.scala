package typings.electronDashPackager.electronDashPackagerMod

import typings.electronDashPackager.electronDashPackagerStrings.asInvoker
import typings.electronDashPackager.electronDashPackagerStrings.highestAvailable
import typings.electronDashPackager.electronDashPackagerStrings.requireAdministrator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object (also known as a "hash") of application metadata to embed into the executable
  */
trait Win32Metadata extends js.Object {
  var CompanyName: js.UndefOr[String] = js.undefined
  var FileDescription: js.UndefOr[String] = js.undefined
  var InternalName: js.UndefOr[String] = js.undefined
  var OriginalFilename: js.UndefOr[String] = js.undefined
  var ProductName: js.UndefOr[String] = js.undefined
  var `application-manifest`: js.UndefOr[String] = js.undefined
  var `requested-execution-level`: js.UndefOr[asInvoker | highestAvailable | requireAdministrator] = js.undefined
}

object Win32Metadata {
  @scala.inline
  def apply(
    CompanyName: String = null,
    FileDescription: String = null,
    InternalName: String = null,
    OriginalFilename: String = null,
    ProductName: String = null,
    `application-manifest`: String = null,
    `requested-execution-level`: asInvoker | highestAvailable | requireAdministrator = null
  ): Win32Metadata = {
    val __obj = js.Dynamic.literal()
    if (CompanyName != null) __obj.updateDynamic("CompanyName")(CompanyName.asInstanceOf[js.Any])
    if (FileDescription != null) __obj.updateDynamic("FileDescription")(FileDescription.asInstanceOf[js.Any])
    if (InternalName != null) __obj.updateDynamic("InternalName")(InternalName.asInstanceOf[js.Any])
    if (OriginalFilename != null) __obj.updateDynamic("OriginalFilename")(OriginalFilename.asInstanceOf[js.Any])
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName.asInstanceOf[js.Any])
    if (`application-manifest` != null) __obj.updateDynamic("application-manifest")(`application-manifest`.asInstanceOf[js.Any])
    if (`requested-execution-level` != null) __obj.updateDynamic("requested-execution-level")(`requested-execution-level`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Win32Metadata]
  }
}

