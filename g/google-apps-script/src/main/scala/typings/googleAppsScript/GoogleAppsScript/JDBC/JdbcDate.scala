package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Date. For documentation of this class, see java.sql.Date
  * .
  */
trait JdbcDate extends StObject {
  
  def after(when: JdbcDate): Boolean
  
  def before(when: JdbcDate): Boolean
  
  def getDate(): Integer
  
  def getMonth(): Integer
  
  def getTime(): Integer
  
  def getYear(): Integer
  
  def setDate(date: Integer): Unit
  
  def setMonth(month: Integer): Unit
  
  def setTime(milliseconds: Integer): Unit
  
  def setYear(year: Integer): Unit
}
object JdbcDate {
  
  inline def apply(
    after: JdbcDate => Boolean,
    before: JdbcDate => Boolean,
    getDate: () => Integer,
    getMonth: () => Integer,
    getTime: () => Integer,
    getYear: () => Integer,
    setDate: Integer => Unit,
    setMonth: Integer => Unit,
    setTime: Integer => Unit,
    setYear: Integer => Unit
  ): JdbcDate = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getMonth = js.Any.fromFunction0(getMonth), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setMonth = js.Any.fromFunction1(setMonth), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
    __obj.asInstanceOf[JdbcDate]
  }
  
  extension [Self <: JdbcDate](x: Self) {
    
    inline def setAfter(value: JdbcDate => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setBefore(value: JdbcDate => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setGetDate(value: () => Integer): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
    
    inline def setGetMonth(value: () => Integer): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
    
    inline def setGetTime(value: () => Integer): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    inline def setGetYear(value: () => Integer): Self = StObject.set(x, "getYear", js.Any.fromFunction0(value))
    
    inline def setSetDate(value: Integer => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
    
    inline def setSetMonth(value: Integer => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
    
    inline def setSetTime(value: Integer => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
    
    inline def setSetYear(value: Integer => Unit): Self = StObject.set(x, "setYear", js.Any.fromFunction1(value))
  }
}
