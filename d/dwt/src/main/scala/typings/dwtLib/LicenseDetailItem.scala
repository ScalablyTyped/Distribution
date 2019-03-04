package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details for each license
  */
trait LicenseDetailItem extends js.Object {
  val Browser: java.lang.String
  val EnumLicenseType: java.lang.String
  val ExpireDate: java.lang.String
  val LicenseType: java.lang.String
  val OS: java.lang.String
  val Trial: java.lang.String
  val Version: java.lang.String
}

object LicenseDetailItem {
  @scala.inline
  def apply(
    Browser: java.lang.String,
    EnumLicenseType: java.lang.String,
    ExpireDate: java.lang.String,
    LicenseType: java.lang.String,
    OS: java.lang.String,
    Trial: java.lang.String,
    Version: java.lang.String
  ): LicenseDetailItem = {
    val __obj = js.Dynamic.literal(Browser = Browser, EnumLicenseType = EnumLicenseType, ExpireDate = ExpireDate, LicenseType = LicenseType, OS = OS, Trial = Trial, Version = Version)
  
    __obj.asInstanceOf[LicenseDetailItem]
  }
}

