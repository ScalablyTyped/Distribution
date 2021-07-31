package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains members related to the document's scroll functionality.
  */
@js.native
trait RichEditScroll extends StObject {
  
  /**
    * Scrolls the document to the specified position
    * @param position The position in a document model.
    * @param subDocumentId An identifier of a sub-document.
    * @param pageIndex The page index.
    */
  def setByDocumentPosition(position: Double): Unit = js.native
  def setByDocumentPosition(position: Double, subDocumentId: Double): Unit = js.native
  def setByDocumentPosition(position: Double, subDocumentId: Double, pageIndex: Double): Unit = js.native
  def setByDocumentPosition(position: Double, subDocumentId: Unit, pageIndex: Double): Unit = js.native
  
  /**
    * Specifies the vertical scroll position.
    */
  var verticalPosition: Double = js.native
}
