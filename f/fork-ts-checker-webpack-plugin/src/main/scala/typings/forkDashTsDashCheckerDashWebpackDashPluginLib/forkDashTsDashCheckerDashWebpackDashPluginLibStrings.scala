package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object forkDashTsDashCheckerDashWebpackDashPluginLibStrings {
  @js.native
  sealed trait codeframe extends js.Object
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait diagnostic
    extends forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.ErrorType
  
  @js.native
  sealed trait error
    extends forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.Severity
  
  @js.native
  sealed trait lint
    extends forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.ErrorType
  
  @js.native
  sealed trait warning
    extends forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod.Severity
  
  @scala.inline
  def codeframe: codeframe = "codeframe".asInstanceOf[codeframe]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def diagnostic: diagnostic = "diagnostic".asInstanceOf[diagnostic]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def lint: lint = "lint".asInstanceOf[lint]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

