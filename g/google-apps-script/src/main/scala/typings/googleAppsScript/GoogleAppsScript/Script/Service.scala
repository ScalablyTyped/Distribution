package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and manipulate script publishing.
  */
trait Service extends StObject {
  
  /** @deprecated DO NOT USE */ def disable(): Unit
  
  def getUrl(): String
  
  def isEnabled(): Boolean
}
object Service {
  
  inline def apply(disable: () => Unit, getUrl: () => String, isEnabled: () => Boolean): Service = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), getUrl = js.Any.fromFunction0(getUrl), isEnabled = js.Any.fromFunction0(isEnabled))
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
  }
}
