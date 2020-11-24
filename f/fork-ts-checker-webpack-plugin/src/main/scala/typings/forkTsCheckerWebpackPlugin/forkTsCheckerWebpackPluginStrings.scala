package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.controlledTypeScriptSystemMod.FileSystemMode
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import typings.forkTsCheckerWebpackPlugin.loggerFactoryMod.LoggerType
import typings.forkTsCheckerWebpackPlugin.partialLoggerMod.LoggerMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginStrings {
  
  @scala.inline
  def Dotjs: Dotjs = ".js".asInstanceOf[Dotjs]
  
  @scala.inline
  def Dotts: Dotts = ".ts".asInstanceOf[Dotts]
  
  @scala.inline
  def Dottsx: Dottsx = ".tsx".asInstanceOf[Dottsx]
  
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @scala.inline
  def call: call = "call".asInstanceOf[call]
  
  @scala.inline
  def codeframe: codeframe = "codeframe".asInstanceOf[codeframe]
  
  @scala.inline
  def console: console = "console".asInstanceOf[console]
  
  @scala.inline
  def dts: dts = "dts".asInstanceOf[dts]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def quit: quit = "quit".asInstanceOf[quit]
  
  @scala.inline
  def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @scala.inline
  def `return`: `return` = "return".asInstanceOf[`return`]
  
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @scala.inline
  def space: space = "space".asInstanceOf[space]
  
  @scala.inline
  def `throw`: `throw` = "throw".asInstanceOf[`throw`]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @scala.inline
  def `webpack-infrastructure`: `webpack-infrastructure` = "webpack-infrastructure".asInstanceOf[`webpack-infrastructure`]
  
  @scala.inline
  def `write-references`: `write-references` = "write-references".asInstanceOf[`write-references`]
  
  @scala.inline
  def `write-tsbuildinfo`: `write-tsbuildinfo` = "write-tsbuildinfo".asInstanceOf[`write-tsbuildinfo`]
  
  @js.native
  sealed trait Dotjs extends js.Object
  
  @js.native
  sealed trait Dotts extends js.Object
  
  @js.native
  sealed trait Dottsx extends js.Object
  
  @js.native
  sealed trait basic extends js.Object
  
  @js.native
  sealed trait call extends js.Object
  
  @js.native
  sealed trait codeframe extends js.Object
  
  @js.native
  sealed trait console extends LoggerType
  
  @js.native
  sealed trait dts extends js.Object
  
  @js.native
  sealed trait error
    extends IssueSeverity
       with LoggerMethods
  
  @js.native
  sealed trait info extends LoggerMethods
  
  @js.native
  sealed trait js_ extends js.Object
  
  @js.native
  sealed trait line extends js.Object
  
  @js.native
  sealed trait log extends LoggerMethods
  
  @js.native
  sealed trait quit extends js.Object
  
  @js.native
  sealed trait readonly extends FileSystemMode
  
  @js.native
  sealed trait `return` extends js.Object
  
  @js.native
  sealed trait silent extends LoggerType
  
  @js.native
  sealed trait space extends js.Object
  
  @js.native
  sealed trait `throw` extends js.Object
  
  @js.native
  sealed trait warning extends IssueSeverity
  
  @js.native
  sealed trait `webpack-infrastructure` extends LoggerType
  
  @js.native
  sealed trait `write-references` extends FileSystemMode
  
  @js.native
  sealed trait `write-tsbuildinfo` extends FileSystemMode
}
