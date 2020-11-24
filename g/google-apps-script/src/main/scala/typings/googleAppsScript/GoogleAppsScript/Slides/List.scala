package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list in the text.
  */
@js.native
trait List extends js.Object {
  
  def getListId(): String = js.native
  
  def getListParagraphs(): js.Array[Paragraph] = js.native
}
object List {
  
  @scala.inline
  def apply(getListId: () => String, getListParagraphs: () => js.Array[Paragraph]): List = {
    val __obj = js.Dynamic.literal(getListId = js.Any.fromFunction0(getListId), getListParagraphs = js.Any.fromFunction0(getListParagraphs))
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
    
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
    def setGetListId(value: () => String): Self = this.set("getListId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListParagraphs(value: () => js.Array[Paragraph]): Self = this.set("getListParagraphs", js.Any.fromFunction0(value))
  }
}
