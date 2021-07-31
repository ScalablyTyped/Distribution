package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementType extends StObject
/**
  * An enumeration of all the element types.
  *
  * Use the ElementType enumeration to check the type of a given element, for instance:
  *
  *     var firstChild = DocumentApp.getActiveDocument().getBody().getChild(0);
  *     if (firstChild.getType() == DocumentApp.ElementType.PARAGRAPH) {
  *       // It's a paragraph, apply a paragraph heading.
  *       firstChild.asParagraph().setHeading(DocumentApp.ParagraphHeading.HEADING1);
  *     }
  */
@JSGlobal("GoogleAppsScript.Document.ElementType")
@js.native
object ElementType extends StObject {
  
  @js.native
  sealed trait BODY_SECTION
    extends StObject
       with ElementType
  
  @js.native
  sealed trait COMMENT_SECTION
    extends StObject
       with ElementType
  
  @js.native
  sealed trait DOCUMENT
    extends StObject
       with ElementType
  
  @js.native
  sealed trait EQUATION
    extends StObject
       with ElementType
  
  @js.native
  sealed trait EQUATION_FUNCTION
    extends StObject
       with ElementType
  
  @js.native
  sealed trait EQUATION_FUNCTION_ARGUMENT_SEPARATOR
    extends StObject
       with ElementType
  
  @js.native
  sealed trait EQUATION_SYMBOL
    extends StObject
       with ElementType
  
  @js.native
  sealed trait FOOTER_SECTION
    extends StObject
       with ElementType
  
  @js.native
  sealed trait FOOTNOTE
    extends StObject
       with ElementType
  
  @js.native
  sealed trait FOOTNOTE_SECTION
    extends StObject
       with ElementType
  
  @js.native
  sealed trait HEADER_SECTION
    extends StObject
       with ElementType
  
  @js.native
  sealed trait HORIZONTAL_RULE
    extends StObject
       with ElementType
  
  @js.native
  sealed trait INLINE_DRAWING
    extends StObject
       with ElementType
  
  @js.native
  sealed trait INLINE_IMAGE
    extends StObject
       with ElementType
  
  @js.native
  sealed trait LIST_ITEM
    extends StObject
       with ElementType
  
  @js.native
  sealed trait PAGE_BREAK
    extends StObject
       with ElementType
  
  @js.native
  sealed trait PARAGRAPH
    extends StObject
       with ElementType
  
  @js.native
  sealed trait TABLE
    extends StObject
       with ElementType
  
  @js.native
  sealed trait TABLE_CELL
    extends StObject
       with ElementType
  
  @js.native
  sealed trait TABLE_OF_CONTENTS
    extends StObject
       with ElementType
  
  @js.native
  sealed trait TABLE_ROW
    extends StObject
       with ElementType
  
  @js.native
  sealed trait TEXT
    extends StObject
       with ElementType
  
  @js.native
  sealed trait UNSUPPORTED
    extends StObject
       with ElementType
}
