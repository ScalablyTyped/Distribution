package typings.firebaseInstallations

import typings.firebaseInstallations.errorsMod.ErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseInstallationsStrings {
  
  @js.native
  sealed trait `app-offline` extends ErrorCode
  @scala.inline
  def `app-offline`: `app-offline` = "app-offline".asInstanceOf[`app-offline`]
  
  @js.native
  sealed trait `delete-pending-registration` extends ErrorCode
  @scala.inline
  def `delete-pending-registration`: `delete-pending-registration` = "delete-pending-registration".asInstanceOf[`delete-pending-registration`]
  
  @js.native
  sealed trait `installation-not-found` extends ErrorCode
  @scala.inline
  def `installation-not-found`: `installation-not-found` = "installation-not-found".asInstanceOf[`installation-not-found`]
  
  @js.native
  sealed trait `missing-app-config-values` extends ErrorCode
  @scala.inline
  def `missing-app-config-values`: `missing-app-config-values` = "missing-app-config-values".asInstanceOf[`missing-app-config-values`]
  
  @js.native
  sealed trait `not-registered` extends ErrorCode
  @scala.inline
  def `not-registered`: `not-registered` = "not-registered".asInstanceOf[`not-registered`]
  
  @js.native
  sealed trait `platform-logger` extends StObject
  @scala.inline
  def `platform-logger`: `platform-logger` = "platform-logger".asInstanceOf[`platform-logger`]
  
  @js.native
  sealed trait `request-failed` extends ErrorCode
  @scala.inline
  def `request-failed`: `request-failed` = "request-failed".asInstanceOf[`request-failed`]
}
