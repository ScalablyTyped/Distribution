package typings.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Ref. For documentation of this class, see java.sql.Ref.
  */
@js.native
trait JdbcRef extends js.Object {
  
  def getBaseTypeName(): String = js.native
  
  def getObject(): js.Any = js.native
  
  def setObject(`object`: js.Any): Unit = js.native
}
object JdbcRef {
  
  @scala.inline
  def apply(getBaseTypeName: () => String, getObject: () => js.Any, setObject: js.Any => Unit): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getObject = js.Any.fromFunction0(getObject), setObject = js.Any.fromFunction1(setObject))
    __obj.asInstanceOf[JdbcRef]
  }
  
  @scala.inline
  implicit class JdbcRefOps[Self <: JdbcRef] (val x: Self) extends AnyVal {
    
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
    def setGetBaseTypeName(value: () => String): Self = this.set("getBaseTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObject(value: () => js.Any): Self = this.set("getObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetObject(value: js.Any => Unit): Self = this.set("setObject", js.Any.fromFunction1(value))
  }
}
