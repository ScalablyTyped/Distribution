package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemType extends js.Object

/**
  * An enum representing the supported types of form items. Item types can be accessed from FormApp.ItemType.
  *
  *     // Open a form by ID and add a new section header.
  *     var form = FormApp.create('Form Name');
  *     var item = form.addSectionHeaderItem();
  *     item.setTitle('Title of new section');
  *
  *     // Check the item type.
  *     if (item.getType() == FormApp.ItemType.SECTION_HEADER) {
  *       item.setHelpText('Description of new section.');
  *     }
  */
@JSGlobal("GoogleAppsScript.Forms.ItemType")
@js.native
object ItemType extends js.Object {
  @js.native
  sealed trait CHECKBOX extends ItemType
  
  @js.native
  sealed trait CHECKBOX_GRID extends ItemType
  
  @js.native
  sealed trait DATE extends ItemType
  
  @js.native
  sealed trait DATETIME extends ItemType
  
  @js.native
  sealed trait DURATION extends ItemType
  
  @js.native
  sealed trait GRID extends ItemType
  
  @js.native
  sealed trait IMAGE extends ItemType
  
  @js.native
  sealed trait LIST extends ItemType
  
  @js.native
  sealed trait MULTIPLE_CHOICE extends ItemType
  
  @js.native
  sealed trait PAGE_BREAK extends ItemType
  
  @js.native
  sealed trait PARAGRAPH_TEXT extends ItemType
  
  @js.native
  sealed trait SCALE extends ItemType
  
  @js.native
  sealed trait SECTION_HEADER extends ItemType
  
  @js.native
  sealed trait TEXT extends ItemType
  
  @js.native
  sealed trait TIME extends ItemType
  
  @js.native
  sealed trait VIDEO extends ItemType
  
  /* 0 */ val CHECKBOX: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.CHECKBOX with Double = js.native
  /* 1 */ val CHECKBOX_GRID: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.CHECKBOX_GRID with Double = js.native
  /* 2 */ val DATE: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.DATE with Double = js.native
  /* 3 */ val DATETIME: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.DATETIME with Double = js.native
  /* 4 */ val DURATION: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.DURATION with Double = js.native
  /* 5 */ val GRID: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.GRID with Double = js.native
  /* 6 */ val IMAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.IMAGE with Double = js.native
  /* 7 */ val LIST: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.LIST with Double = js.native
  /* 8 */ val MULTIPLE_CHOICE: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.MULTIPLE_CHOICE with Double = js.native
  /* 9 */ val PAGE_BREAK: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.PAGE_BREAK with Double = js.native
  /* 10 */ val PARAGRAPH_TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.PARAGRAPH_TEXT with Double = js.native
  /* 11 */ val SCALE: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.SCALE with Double = js.native
  /* 12 */ val SECTION_HEADER: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.SECTION_HEADER with Double = js.native
  /* 13 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.TEXT with Double = js.native
  /* 14 */ val TIME: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.TIME with Double = js.native
  /* 15 */ val VIDEO: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.ItemType.VIDEO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemType with Double] = js.native
}

