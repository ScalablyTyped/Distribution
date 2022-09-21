package typings.filterConsole

import typings.filterConsole.mod.ConsoleMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterConsoleStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with ConsoleMethods
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with ConsoleMethods
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with ConsoleMethods
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait log
    extends StObject
       with ConsoleMethods
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait warn
    extends StObject
       with ConsoleMethods
  inline def warn: warn = "warn".asInstanceOf[warn]
}
