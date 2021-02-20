package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Timestamp. For documentation of this class, see java.sql.Timestamp
  * .
  */
@js.native
trait JdbcTimestamp extends StObject {
  
  def after(when: JdbcTimestamp): Boolean = js.native
  
  def before(when: JdbcTimestamp): Boolean = js.native
  
  def getDate(): Integer = js.native
  
  def getHours(): Integer = js.native
  
  def getMinutes(): Integer = js.native
  
  def getMonth(): Integer = js.native
  
  def getNanos(): Integer = js.native
  
  def getSeconds(): Integer = js.native
  
  def getTime(): Integer = js.native
  
  def getYear(): Integer = js.native
  
  def setDate(date: Integer): Unit = js.native
  
  def setHours(hours: Integer): Unit = js.native
  
  def setMinutes(minutes: Integer): Unit = js.native
  
  def setMonth(month: Integer): Unit = js.native
  
  def setNanos(nanoseconds: Integer): Unit = js.native
  
  def setSeconds(seconds: Integer): Unit = js.native
  
  def setTime(milliseconds: Integer): Unit = js.native
  
  def setYear(year: Integer): Unit = js.native
}
object JdbcTimestamp {
  
  @scala.inline
  def apply(
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
  implicit class JdbcTimestampMutableBuilder[Self <: JdbcTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: JdbcTimestamp => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: JdbcTimestamp => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDate(value: () => Integer): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHours(value: () => Integer): Self = StObject.set(x, "getHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinutes(value: () => Integer): Self = StObject.set(x, "getMinutes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonth(value: () => Integer): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNanos(value: () => Integer): Self = StObject.set(x, "getNanos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeconds(value: () => Integer): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTime(value: () => Integer): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYear(value: () => Integer): Self = StObject.set(x, "getYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDate(value: Integer => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHours(value: Integer => Unit): Self = StObject.set(x, "setHours", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinutes(value: Integer => Unit): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonth(value: Integer => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNanos(value: Integer => Unit): Self = StObject.set(x, "setNanos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSeconds(value: Integer => Unit): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTime(value: Integer => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYear(value: Integer => Unit): Self = StObject.set(x, "setYear", js.Any.fromFunction1(value))
  }
}
