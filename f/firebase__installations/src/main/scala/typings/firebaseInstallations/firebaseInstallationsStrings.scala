package typings.firebaseInstallations

import typings.firebaseInstallations.errorsMod.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseInstallationsStrings {
  
  @scala.inline
  def `app-offline`: `app-offline` = "app-offline".asInstanceOf[`app-offline`]
  
  @scala.inline
  def `delete-pending-registration`: `delete-pending-registration` = "delete-pending-registration".asInstanceOf[`delete-pending-registration`]
  
  @scala.inline
  def `installation-not-found`: `installation-not-found` = "installation-not-found".asInstanceOf[`installation-not-found`]
  
  @scala.inline
  def `missing-app-config-values`: `missing-app-config-values` = "missing-app-config-values".asInstanceOf[`missing-app-config-values`]
  
  @scala.inline
  def `not-registered`: `not-registered` = "not-registered".asInstanceOf[`not-registered`]
  
  @scala.inline
  def `platform-logger`: `platform-logger` = "platform-logger".asInstanceOf[`platform-logger`]
  
  @scala.inline
  def `request-failed`: `request-failed` = "request-failed".asInstanceOf[`request-failed`]
  
  @js.native
  sealed trait `app-offline` extends ErrorCode
  
  @js.native
  sealed trait `delete-pending-registration` extends ErrorCode
  
  @js.native
  sealed trait `installation-not-found` extends ErrorCode
  
  @js.native
  sealed trait `missing-app-config-values` extends ErrorCode
  
  @js.native
  sealed trait `not-registered` extends ErrorCode
  
  @js.native
  sealed trait `platform-logger` extends js.Object
  
  @js.native
  sealed trait `request-failed` extends ErrorCode
}
