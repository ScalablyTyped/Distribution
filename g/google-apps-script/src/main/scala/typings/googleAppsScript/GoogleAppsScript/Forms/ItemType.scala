package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ItemType extends StObject
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
object ItemType extends StObject {
  
  @js.native
  sealed trait CHECKBOX
    extends StObject
       with ItemType
  
  @js.native
  sealed trait CHECKBOX_GRID
    extends StObject
       with ItemType
  
  @js.native
  sealed trait DATE
    extends StObject
       with ItemType
  
  @js.native
  sealed trait DATETIME
    extends StObject
       with ItemType
  
  @js.native
  sealed trait DURATION
    extends StObject
       with ItemType
  
  @js.native
  sealed trait GRID
    extends StObject
       with ItemType
  
  @js.native
  sealed trait IMAGE
    extends StObject
       with ItemType
  
  @js.native
  sealed trait LIST
    extends StObject
       with ItemType
  
  @js.native
  sealed trait MULTIPLE_CHOICE
    extends StObject
       with ItemType
  
  @js.native
  sealed trait PAGE_BREAK
    extends StObject
       with ItemType
  
  @js.native
  sealed trait PARAGRAPH_TEXT
    extends StObject
       with ItemType
  
  @js.native
  sealed trait SCALE
    extends StObject
       with ItemType
  
  @js.native
  sealed trait SECTION_HEADER
    extends StObject
       with ItemType
  
  @js.native
  sealed trait TEXT
    extends StObject
       with ItemType
  
  @js.native
  sealed trait TIME
    extends StObject
       with ItemType
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with ItemType
}
