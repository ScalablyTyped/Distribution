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

