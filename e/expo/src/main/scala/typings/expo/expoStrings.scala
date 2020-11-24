package typings.expo

import typings.expo.remoteLoggingMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoStrings {
  
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @scala.inline
  def received: received = "received".asInstanceOf[received]
  
  @scala.inline
  def selected: selected = "selected".asInstanceOf[selected]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait day extends js.Object
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait hour extends js.Object
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait minute extends js.Object
  
  @js.native
  sealed trait month extends js.Object
  
  @js.native
  sealed trait received extends js.Object
  
  @js.native
  sealed trait selected extends js.Object
  
  @js.native
  sealed trait warn extends LogLevel
  
  @js.native
  sealed trait week extends js.Object
  
  @js.native
  sealed trait year extends js.Object
}
