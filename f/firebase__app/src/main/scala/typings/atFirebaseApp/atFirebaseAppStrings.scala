package typings.atFirebaseApp

import typings.atFirebaseApp.distAppSrcErrorsMod.AppError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atFirebaseAppStrings {
  @js.native
  sealed trait ErrorParams extends js.Object
  
  @js.native
  sealed trait `[DEFAULT]` extends js.Object
  
  @js.native
  sealed trait `app-deleted` extends AppError
  
  @js.native
  sealed trait `bad-app-name` extends AppError
  
  @js.native
  sealed trait `duplicate-app` extends AppError
  
  @js.native
  sealed trait `invalid-app-argument` extends AppError
  
  @js.native
  sealed trait `no-app` extends AppError
  
  @scala.inline
  def ErrorParams: ErrorParams = "ErrorParams".asInstanceOf[ErrorParams]
  @scala.inline
  def `[DEFAULT]`: `[DEFAULT]` = "[DEFAULT]".asInstanceOf[`[DEFAULT]`]
  @scala.inline
  def `app-deleted`: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
  @scala.inline
  def `bad-app-name`: `bad-app-name` = "bad-app-name".asInstanceOf[`bad-app-name`]
  @scala.inline
  def `duplicate-app`: `duplicate-app` = "duplicate-app".asInstanceOf[`duplicate-app`]
  @scala.inline
  def `invalid-app-argument`: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
  @scala.inline
  def `no-app`: `no-app` = "no-app".asInstanceOf[`no-app`]
}

