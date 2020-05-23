package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod._FormatterType
import typings.forkTsCheckerWebpackPlugin.hooksMod.ForkTsCheckerHooks
import typings.forkTsCheckerWebpackPlugin.issueOriginMod.IssueOrigin
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object forkTsCheckerWebpackPluginStrings {
  @js.native
  sealed trait cancel extends ForkTsCheckerHooks
  
  @js.native
  sealed trait codeframe extends _FormatterType
  
  @js.native
  sealed trait default extends _FormatterType
  
  @js.native
  sealed trait done extends ForkTsCheckerHooks
  
  @js.native
  sealed trait dts extends js.Object
  
  @js.native
  sealed trait emit extends ForkTsCheckerHooks
  
  @js.native
  sealed trait error extends IssueSeverity
  
  @js.native
  sealed trait eslint extends IssueOrigin
  
  @js.native
  sealed trait internal extends IssueOrigin
  
  @js.native
  sealed trait js_ extends js.Object
  
  @js.native
  sealed trait receive extends ForkTsCheckerHooks
  
  @js.native
  sealed trait serviceBeforeStart extends ForkTsCheckerHooks
  
  @js.native
  sealed trait serviceOutOfMemory extends ForkTsCheckerHooks
  
  @js.native
  sealed trait serviceStart extends ForkTsCheckerHooks
  
  @js.native
  sealed trait serviceStartError extends ForkTsCheckerHooks
  
  @js.native
  sealed trait typescript extends IssueOrigin
  
  @js.native
  sealed trait waiting extends ForkTsCheckerHooks
  
  @js.native
  sealed trait warning extends IssueSeverity
  
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def codeframe: codeframe = "codeframe".asInstanceOf[codeframe]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  @scala.inline
  def dts: dts = "dts".asInstanceOf[dts]
  @scala.inline
  def emit: emit = "emit".asInstanceOf[emit]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def eslint: eslint = "eslint".asInstanceOf[eslint]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  @scala.inline
  def receive: receive = "receive".asInstanceOf[receive]
  @scala.inline
  def serviceBeforeStart: serviceBeforeStart = "serviceBeforeStart".asInstanceOf[serviceBeforeStart]
  @scala.inline
  def serviceOutOfMemory: serviceOutOfMemory = "serviceOutOfMemory".asInstanceOf[serviceOutOfMemory]
  @scala.inline
  def serviceStart: serviceStart = "serviceStart".asInstanceOf[serviceStart]
  @scala.inline
  def serviceStartError: serviceStartError = "serviceStartError".asInstanceOf[serviceStartError]
  @scala.inline
  def typescript: typescript = "typescript".asInstanceOf[typescript]
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

