package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Deprecated. For spreadsheets created in the newer version of Google Sheets, use the more powerful
  *     Protection class instead. Although this class is deprecated, it remains available
  *     for compatibility with the older version of Sheets.
  * Access and modify protected sheets in the older version of Google Sheets.
  */
trait PageProtection extends StObject {
  
  /** @deprecated DO NOT USE */ def addUser(email: String): Unit
  
  /** @deprecated DO NOT USE */ def getUsers(): js.Array[String]
  
  /** @deprecated DO NOT USE */ def isProtected(): Boolean
  
  /** @deprecated DO NOT USE */ def removeUser(user: String): Unit
  
  /** @deprecated DO NOT USE */ def setProtected(protection: Boolean): Unit
}
object PageProtection {
  
  @scala.inline
  def apply(
    addUser: String => Unit,
    getUsers: () => js.Array[String],
    isProtected: () => Boolean,
    removeUser: String => Unit,
    setProtected: Boolean => Unit
  ): PageProtection = {
    val __obj = js.Dynamic.literal(addUser = js.Any.fromFunction1(addUser), getUsers = js.Any.fromFunction0(getUsers), isProtected = js.Any.fromFunction0(isProtected), removeUser = js.Any.fromFunction1(removeUser), setProtected = js.Any.fromFunction1(setProtected))
    __obj.asInstanceOf[PageProtection]
  }
  
  @scala.inline
  implicit class PageProtectionMutableBuilder[Self <: PageProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddUser(value: String => Unit): Self = StObject.set(x, "addUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUsers(value: () => js.Array[String]): Self = StObject.set(x, "getUsers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsProtected(value: () => Boolean): Self = StObject.set(x, "isProtected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveUser(value: String => Unit): Self = StObject.set(x, "removeUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProtected(value: Boolean => Unit): Self = StObject.set(x, "setProtected", js.Any.fromFunction1(value))
  }
}
