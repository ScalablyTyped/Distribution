package typings
package electronDashPackagerLib.electronDashPackagerMod.electronPackagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object (also known as a "hash") of application metadata to embed into the executable
  */
trait Win32Metadata extends js.Object {
  var CompanyName: js.UndefOr[java.lang.String] = js.undefined
  var FileDescription: js.UndefOr[java.lang.String] = js.undefined
  var InternalName: js.UndefOr[java.lang.String] = js.undefined
  var OriginalFilename: js.UndefOr[java.lang.String] = js.undefined
  var ProductName: js.UndefOr[java.lang.String] = js.undefined
  var `application-manifest`: js.UndefOr[java.lang.String] = js.undefined
  var `requested-execution-level`: js.UndefOr[
    electronDashPackagerLib.electronDashPackagerLibStrings.asInvoker | electronDashPackagerLib.electronDashPackagerLibStrings.highestAvailable | electronDashPackagerLib.electronDashPackagerLibStrings.requireAdministrator
  ] = js.undefined
}

object Win32Metadata {
  @scala.inline
  def apply(
    CompanyName: java.lang.String = null,
    FileDescription: java.lang.String = null,
    InternalName: java.lang.String = null,
    OriginalFilename: java.lang.String = null,
    ProductName: java.lang.String = null,
    `application-manifest`: java.lang.String = null,
    `requested-execution-level`: electronDashPackagerLib.electronDashPackagerLibStrings.asInvoker | electronDashPackagerLib.electronDashPackagerLibStrings.highestAvailable | electronDashPackagerLib.electronDashPackagerLibStrings.requireAdministrator = null
  ): Win32Metadata = {
    val __obj = js.Dynamic.literal()
    if (CompanyName != null) __obj.updateDynamic("CompanyName")(CompanyName)
    if (FileDescription != null) __obj.updateDynamic("FileDescription")(FileDescription)
    if (InternalName != null) __obj.updateDynamic("InternalName")(InternalName)
    if (OriginalFilename != null) __obj.updateDynamic("OriginalFilename")(OriginalFilename)
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName)
    if (`application-manifest` != null) __obj.updateDynamic("application-manifest")(`application-manifest`)
    if (`requested-execution-level` != null) __obj.updateDynamic("requested-execution-level")(`requested-execution-level`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Win32Metadata]
  }
}

