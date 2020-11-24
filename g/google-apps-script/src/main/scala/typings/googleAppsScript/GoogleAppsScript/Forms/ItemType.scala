package typings.googleAppsScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
