package typings.atFirebaseRemoteDashConfigDashTypes

import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.FetchStatus
import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.LogLevel
import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.ValueSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atFirebaseRemoteDashConfigDashTypesStrings {
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait default extends ValueSource
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait failure extends FetchStatus
  
  @js.native
  sealed trait `no-fetch-yet` extends FetchStatus
  
  @js.native
  sealed trait remote extends ValueSource
  
  @js.native
  sealed trait silent extends LogLevel
  
  @js.native
  sealed trait static extends ValueSource
  
  @js.native
  sealed trait success extends FetchStatus
  
  @js.native
  sealed trait throttle extends FetchStatus
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def `no-fetch-yet`: `no-fetch-yet` = "no-fetch-yet".asInstanceOf[`no-fetch-yet`]
  @scala.inline
  def remote: remote = "remote".asInstanceOf[remote]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def throttle: throttle = "throttle".asInstanceOf[throttle]
}

