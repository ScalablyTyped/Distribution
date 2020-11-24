package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of an XML namespace.
  */
@js.native
trait Namespace extends js.Object {
  
  def getPrefix(): String = js.native
  
  def getURI(): String = js.native
}
object Namespace {
  
  @scala.inline
  def apply(getPrefix: () => String, getURI: () => String): Namespace = {
    val __obj = js.Dynamic.literal(getPrefix = js.Any.fromFunction0(getPrefix), getURI = js.Any.fromFunction0(getURI))
    __obj.asInstanceOf[Namespace]
  }
  
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
    
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
    def setGetPrefix(value: () => String): Self = this.set("getPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURI(value: () => String): Self = this.set("getURI", js.Any.fromFunction0(value))
  }
}
