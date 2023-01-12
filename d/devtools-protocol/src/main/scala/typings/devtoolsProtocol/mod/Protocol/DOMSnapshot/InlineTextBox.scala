package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineTextBox extends StObject {
  
  /**
    * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
    */
  var boundingBox: Rect
  
  /**
    * The number of characters in this post layout textbox substring. Characters that would be
    * represented as a surrogate pair in UTF-16 have length 2.
    */
  var numCharacters: integer
  
  /**
    * The starting index in characters, for this post layout textbox substring. Characters that
    * would be represented as a surrogate pair in UTF-16 have length 2.
    */
  var startCharacterIndex: integer
}
object InlineTextBox {
  
  inline def apply(boundingBox: Rect, numCharacters: integer, startCharacterIndex: integer): InlineTextBox = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], numCharacters = numCharacters.asInstanceOf[js.Any], startCharacterIndex = startCharacterIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineTextBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineTextBox] (val x: Self) extends AnyVal {
    
    inline def setBoundingBox(value: Rect): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setNumCharacters(value: integer): Self = StObject.set(x, "numCharacters", value.asInstanceOf[js.Any])
    
    inline def setStartCharacterIndex(value: integer): Self = StObject.set(x, "startCharacterIndex", value.asInstanceOf[js.Any])
  }
}
