package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Timestamp. For documentation of this class, see java.sql.Timestamp
  * .
  */
trait JdbcTimestamp extends StObject {
  
  def after(when: JdbcTimestamp): Boolean
  
  def before(when: JdbcTimestamp): Boolean
  
  def getDate(): Integer
  
  def getHours(): Integer
  
  def getMinutes(): Integer
  
  def getMonth(): Integer
  
  def getNanos(): Integer
  
  def getSeconds(): Integer
  
  def getTime(): Integer
  
  def getYear(): Integer
  
  def setDate(date: Integer): Unit
  
  def setHours(hours: Integer): Unit
  
  def setMinutes(minutes: Integer): Unit
  
  def setMonth(month: Integer): Unit
  
  def setNanos(nanoseconds: Integer): Unit
  
  def setSeconds(seconds: Integer): Unit
  
  def setTime(milliseconds: Integer): Unit
  
  def setYear(year: Integer): Unit
}
object JdbcTimestamp {
  
  inline def apply(
    after: JdbcTimestamp => Boolean,
    before: JdbcTimestamp => Boolean,
    getDate: () => Integer,
    getHours: () => Integer,
    getMinutes: () => Integer,
    getMonth: () => Integer,
    getNanos: () => Integer,
    getSeconds: () => Integer,
    getTime: () => Integer,
    getYear: () => Integer,
    setDate: Integer => Unit,
    setHours: Integer => Unit,
    setMinutes: Integer => Unit,
    setMonth: Integer => Unit,
    setNanos: Integer => Unit,
    setSeconds: Integer => Unit,
    setTime: Integer => Unit,
    setYear: Integer => Unit
  ): JdbcTimestamp = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getHours = js.Any.fromFunction0(getHours), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getNanos = js.Any.fromFunction0(getNanos), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setNanos = js.Any.fromFunction1(setNanos), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
    __obj.asInstanceOf[JdbcTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JdbcTimestamp] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: JdbcTimestamp => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setBefore(value: JdbcTimestamp => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setGetDate(value: () => Integer): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
    
    inline def setGetHours(value: () => Integer): Self = StObject.set(x, "getHours", js.Any.fromFunction0(value))
    
    inline def setGetMinutes(value: () => Integer): Self = StObject.set(x, "getMinutes", js.Any.fromFunction0(value))
    
    inline def setGetMonth(value: () => Integer): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
    
    inline def setGetNanos(value: () => Integer): Self = StObject.set(x, "getNanos", js.Any.fromFunction0(value))
    
    inline def setGetSeconds(value: () => Integer): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
    
    inline def setGetTime(value: () => Integer): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    inline def setGetYear(value: () => Integer): Self = StObject.set(x, "getYear", js.Any.fromFunction0(value))
    
    inline def setSetDate(value: Integer => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
    
    inline def setSetHours(value: Integer => Unit): Self = StObject.set(x, "setHours", js.Any.fromFunction1(value))
    
    inline def setSetMinutes(value: Integer => Unit): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1(value))
    
    inline def setSetMonth(value: Integer => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
    
    inline def setSetNanos(value: Integer => Unit): Self = StObject.set(x, "setNanos", js.Any.fromFunction1(value))
    
    inline def setSetSeconds(value: Integer => Unit): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1(value))
    
    inline def setSetTime(value: Integer => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
    
    inline def setSetYear(value: Integer => Unit): Self = StObject.set(x, "setYear", js.Any.fromFunction1(value))
  }
}
