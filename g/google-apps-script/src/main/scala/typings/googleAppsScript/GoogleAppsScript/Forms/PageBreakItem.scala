package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layout item that marks the start of a page. Items can be accessed or created from a Form.
  *
  *     // Create a form and add three page-break items.
  *     var form = FormApp.create('Form Name');
  *     var pageTwo = form.addPageBreakItem().setTitle('Page Two');
  *     var pageThree = form.addPageBreakItem().setTitle('Page Three');
  *
  *     // Make the first two pages navigate elsewhere upon completion.
  *     pageTwo.setGoToPage(pageThree); // At end of page one (start of page two), jump to page three
  *     pageThree.setGoToPage(FormApp.PageNavigationType.RESTART); // At end of page two, restart form
  */
@js.native
trait PageBreakItem extends js.Object {
  
  def duplicate(): PageBreakItem = js.native
  
  def getGoToPage(): PageBreakItem = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getPageNavigationType(): PageNavigationType = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def setGoToPage(goToPageItem: PageBreakItem): PageBreakItem = js.native
  def setGoToPage(navigationType: PageNavigationType): PageBreakItem = js.native
  
  def setHelpText(text: String): PageBreakItem = js.native
  
  def setTitle(title: String): PageBreakItem = js.native
}
