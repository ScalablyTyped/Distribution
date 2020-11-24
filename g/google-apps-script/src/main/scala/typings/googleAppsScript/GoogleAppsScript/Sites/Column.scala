package typings.googleAppsScript.GoogleAppsScript.Sites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Sites Column - a column from a Sites List page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
@js.native
trait Column extends js.Object {
  
  def deleteColumn(): Unit = js.native
  
  def getName(): String = js.native
  
  def getParent(): Page = js.native
  
  def setName(name: String): Column = js.native
}
object Column {
  
  @scala.inline
  def apply(deleteColumn: () => Unit, getName: () => String, getParent: () => Page, setName: String => Column): Column = {
    val __obj = js.Dynamic.literal(deleteColumn = js.Any.fromFunction0(deleteColumn), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    
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
    def setDeleteColumn(value: () => Unit): Self = this.set("deleteColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParent(value: () => Page): Self = this.set("getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetName(value: String => Column): Self = this.set("setName", js.Any.fromFunction1(value))
  }
}
