package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.controlledTypeScriptSystemMod.FileSystemMode
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import typings.forkTsCheckerWebpackPlugin.loggerFactoryMod.LoggerType
import typings.forkTsCheckerWebpackPlugin.partialLoggerMod.LoggerMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginStrings {
  
  @js.native
  sealed trait Dotjs extends StObject
  inline def Dotjs: Dotjs = ".js".asInstanceOf[Dotjs]
  
  @js.native
  sealed trait Dotts extends StObject
  inline def Dotts: Dotts = ".ts".asInstanceOf[Dotts]
  
  @js.native
  sealed trait Dottsx extends StObject
  inline def Dottsx: Dottsx = ".tsx".asInstanceOf[Dottsx]
  
  @js.native
  sealed trait basic extends StObject
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait call extends StObject
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait codeframe extends StObject
  inline def codeframe: codeframe = "codeframe".asInstanceOf[codeframe]
  
  @js.native
  sealed trait console
    extends StObject
       with LoggerType
  inline def console: console = "console".asInstanceOf[console]
  
  @js.native
  sealed trait dts extends StObject
  inline def dts: dts = "dts".asInstanceOf[dts]
  
  @js.native
  sealed trait error
    extends StObject
       with IssueSeverity
       with LoggerMethods
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with LoggerMethods
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait js_ extends StObject
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait line extends StObject
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait log
    extends StObject
       with LoggerMethods
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait quit extends StObject
  inline def quit: quit = "quit".asInstanceOf[quit]
  
  @js.native
  sealed trait readonly
    extends StObject
       with FileSystemMode
  inline def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait `return` extends StObject
  inline def `return`: `return` = "return".asInstanceOf[`return`]
  
  @js.native
  sealed trait silent
    extends StObject
       with LoggerType
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait space extends StObject
  inline def space: space = "space".asInstanceOf[space]
  
  @js.native
  sealed trait `throw` extends StObject
  inline def `throw`: `throw` = "throw".asInstanceOf[`throw`]
  
  @js.native
  sealed trait warning
    extends StObject
       with IssueSeverity
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait `webpack-infrastructure`
    extends StObject
       with LoggerType
  inline def `webpack-infrastructure`: `webpack-infrastructure` = "webpack-infrastructure".asInstanceOf[`webpack-infrastructure`]
  
  @js.native
  sealed trait `write-references`
    extends StObject
       with FileSystemMode
  inline def `write-references`: `write-references` = "write-references".asInstanceOf[`write-references`]
  
  @js.native
  sealed trait `write-tsbuildinfo`
    extends StObject
       with FileSystemMode
  inline def `write-tsbuildinfo`: `write-tsbuildinfo` = "write-tsbuildinfo".asInstanceOf[`write-tsbuildinfo`]
}
