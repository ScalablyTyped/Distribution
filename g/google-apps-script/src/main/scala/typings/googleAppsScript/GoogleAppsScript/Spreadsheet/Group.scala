package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify spreadsheet groups. Groups are an association between an interval of contiguous
  * rows or columns that can be expanded or collapsed as a unit to hide/show the rows or columns.
  * Each group has a control toggle on the row or column directly before or after the group
  * (depending on settings) that can expand or collapse the group as a whole.
  *
  * The depth of a group refers to the nested position of the group and how many larger
  * groups contain the group. The collapsed state of a group refers to whether the group
  * should remain collapsed or expanded after a parent group has been expanded. Additionally, at the
  * time that a group is collapsed or expanded, the rows or columns within the group are hidden or
  * set visible, though individual rows or columns can be hidden or set visible irrespective of the
  * collapsed state.
  */
@js.native
trait Group extends js.Object {
  
  def collapse(): Group = js.native
  
  def expand(): Group = js.native
  
  def getControlIndex(): Integer = js.native
  
  def getDepth(): Integer = js.native
  
  def getRange(): Range = js.native
  
  def isCollapsed(): Boolean = js.native
  
  def remove(): Unit = js.native
}
object Group {
  
  @scala.inline
  def apply(
    collapse: () => Group,
    expand: () => Group,
    getControlIndex: () => Integer,
    getDepth: () => Integer,
    getRange: () => Range,
    isCollapsed: () => Boolean,
    remove: () => Unit
  ): Group = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), expand = js.Any.fromFunction0(expand), getControlIndex = js.Any.fromFunction0(getControlIndex), getDepth = js.Any.fromFunction0(getDepth), getRange = js.Any.fromFunction0(getRange), isCollapsed = js.Any.fromFunction0(isCollapsed), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
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
    def setCollapse(value: () => Group): Self = this.set("collapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpand(value: () => Group): Self = this.set("expand", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetControlIndex(value: () => Integer): Self = this.set("getControlIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDepth(value: () => Integer): Self = this.set("getDepth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRange(value: () => Range): Self = this.set("getRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCollapsed(value: () => Boolean): Self = this.set("isCollapsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
}
