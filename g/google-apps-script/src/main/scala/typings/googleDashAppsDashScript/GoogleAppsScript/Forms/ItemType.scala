package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemType with Double] = js.native
  /* 0 */ @js.native
  object CHECKBOX extends TopLevel[CHECKBOX with Double]
  
  /* 1 */ @js.native
  object CHECKBOX_GRID extends TopLevel[CHECKBOX_GRID with Double]
  
  /* 2 */ @js.native
  object DATE extends TopLevel[DATE with Double]
  
  /* 3 */ @js.native
  object DATETIME extends TopLevel[DATETIME with Double]
  
  /* 4 */ @js.native
  object DURATION extends TopLevel[DURATION with Double]
  
  /* 5 */ @js.native
  object GRID extends TopLevel[GRID with Double]
  
  /* 6 */ @js.native
  object IMAGE extends TopLevel[IMAGE with Double]
  
  /* 7 */ @js.native
  object LIST extends TopLevel[LIST with Double]
  
  /* 8 */ @js.native
  object MULTIPLE_CHOICE extends TopLevel[MULTIPLE_CHOICE with Double]
  
  /* 9 */ @js.native
  object PAGE_BREAK extends TopLevel[PAGE_BREAK with Double]
  
  /* 10 */ @js.native
  object PARAGRAPH_TEXT extends TopLevel[PARAGRAPH_TEXT with Double]
  
  /* 11 */ @js.native
  object SCALE extends TopLevel[SCALE with Double]
  
  /* 12 */ @js.native
  object SECTION_HEADER extends TopLevel[SECTION_HEADER with Double]
  
  /* 13 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 14 */ @js.native
  object TIME extends TopLevel[TIME with Double]
  
  /* 15 */ @js.native
  object VIDEO extends TopLevel[VIDEO with Double]
  
}

