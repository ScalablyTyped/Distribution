package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.FormatterPathType
import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.FormatterType
import typings.forkTsCheckerWebpackPlugin.libIssueIssueSeverityMod.IssueSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginStrings {
  
  @js.native
  sealed trait absolute
    extends StObject
       with FormatterPathType
  inline def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait basic
    extends StObject
       with FormatterType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait call extends StObject
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait codeframe
    extends StObject
       with FormatterType
  inline def codeframe: codeframe = "codeframe".asInstanceOf[codeframe]
  
  @js.native
  sealed trait dts extends StObject
  inline def dts: dts = "dts".asInstanceOf[dts]
  
  @js.native
  sealed trait error
    extends StObject
       with IssueSeverity
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait js_ extends StObject
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait quit extends StObject
  inline def quit: quit = "quit".asInstanceOf[quit]
  
  @js.native
  sealed trait readonly extends StObject
  inline def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait reject extends StObject
  inline def reject: reject = "reject".asInstanceOf[reject]
  
  @js.native
  sealed trait relative
    extends StObject
       with FormatterPathType
  inline def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait resolve extends StObject
  inline def resolve: resolve = "resolve".asInstanceOf[resolve]
  
  @js.native
  sealed trait warning
    extends StObject
       with IssueSeverity
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait `webpack-infrastructure` extends StObject
  inline def `webpack-infrastructure`: `webpack-infrastructure` = "webpack-infrastructure".asInstanceOf[`webpack-infrastructure`]
  
  @js.native
  sealed trait `write-dts` extends StObject
  inline def `write-dts`: `write-dts` = "write-dts".asInstanceOf[`write-dts`]
  
  @js.native
  sealed trait `write-references` extends StObject
  inline def `write-references`: `write-references` = "write-references".asInstanceOf[`write-references`]
  
  @js.native
  sealed trait `write-tsbuildinfo` extends StObject
  inline def `write-tsbuildinfo`: `write-tsbuildinfo` = "write-tsbuildinfo".asInstanceOf[`write-tsbuildinfo`]
}
