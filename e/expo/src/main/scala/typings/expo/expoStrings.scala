package typings.expo

import typings.expo.remoteLoggingMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoStrings {
  
  @js.native
  sealed trait day extends StObject
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait hour extends StObject
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait minute extends StObject
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait month extends StObject
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait received extends StObject
  inline def received: received = "received".asInstanceOf[received]
  
  @js.native
  sealed trait selected extends StObject
  inline def selected: selected = "selected".asInstanceOf[selected]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait week extends StObject
  inline def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait year extends StObject
  inline def year: year = "year".asInstanceOf[year]
}
