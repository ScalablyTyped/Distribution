package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details for each license
  */
trait LicenseDetailItem extends js.Object {
  val Browser: String
  val EnumLicenseType: String
  val ExpireDate: String
  val LicenseType: String
  val OS: String
  val Trial: String
  val Version: String
}

object LicenseDetailItem {
  @scala.inline
  def apply(
    Browser: String,
    EnumLicenseType: String,
    ExpireDate: String,
    LicenseType: String,
    OS: String,
    Trial: String,
    Version: String
  ): LicenseDetailItem = {
    val __obj = js.Dynamic.literal(Browser = Browser, EnumLicenseType = EnumLicenseType, ExpireDate = ExpireDate, LicenseType = LicenseType, OS = OS, Trial = Trial, Version = Version)
  
    __obj.asInstanceOf[LicenseDetailItem]
  }
}

