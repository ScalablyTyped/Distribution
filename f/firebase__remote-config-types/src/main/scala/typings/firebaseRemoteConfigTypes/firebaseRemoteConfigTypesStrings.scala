package typings.firebaseRemoteConfigTypes

import typings.firebaseRemoteConfigTypes.mod.FetchStatus
import typings.firebaseRemoteConfigTypes.mod.LogLevel
import typings.firebaseRemoteConfigTypes.mod.ValueSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseRemoteConfigTypesStrings {
  
  @js.native
  sealed trait default extends ValueSource
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait debug extends LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error extends LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failure extends FetchStatus
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait `no-fetch-yet` extends FetchStatus
  @scala.inline
  def `no-fetch-yet`: `no-fetch-yet` = "no-fetch-yet".asInstanceOf[`no-fetch-yet`]
  
  @js.native
  sealed trait remote extends ValueSource
  @scala.inline
  def remote: remote = "remote".asInstanceOf[remote]
  
  @js.native
  sealed trait silent extends LogLevel
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait static extends ValueSource
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait success extends FetchStatus
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait throttle extends FetchStatus
  @scala.inline
  def throttle: throttle = "throttle".asInstanceOf[throttle]
}
