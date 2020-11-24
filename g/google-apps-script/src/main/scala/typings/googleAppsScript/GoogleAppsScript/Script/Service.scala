package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and manipulate script publishing.
  */
@js.native
trait Service extends js.Object {
  
  /** @deprecated DO NOT USE */ def disable(): Unit = js.native
  
  def getUrl(): String = js.native
  
  def isEnabled(): Boolean = js.native
}
object Service {
  
  @scala.inline
  def apply(disable: () => Unit, getUrl: () => String, isEnabled: () => Boolean): Service = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), getUrl = js.Any.fromFunction0(getUrl), isEnabled = js.Any.fromFunction0(isEnabled))
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
  }
}
