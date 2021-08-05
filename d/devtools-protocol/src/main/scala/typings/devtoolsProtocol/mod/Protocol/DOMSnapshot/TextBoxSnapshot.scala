package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBoxSnapshot extends StObject {
  
  /**
    * The absolute position bounding box.
    */
  var bounds: js.Array[Rectangle]
  
  /**
    * Index of the layout tree node that owns this box collection.
    */
  var layoutIndex: js.Array[integer]
  
  /**
    * The number of characters in this post layout textbox substring. Characters that would be
    * represented as a surrogate pair in UTF-16 have length 2.
    */
  var length: js.Array[integer]
  
  /**
    * The starting index in characters, for this post layout textbox substring. Characters that
    * would be represented as a surrogate pair in UTF-16 have length 2.
    */
  var start: js.Array[integer]
}
object TextBoxSnapshot {
  
  inline def apply(
    bounds: js.Array[Rectangle],
    layoutIndex: js.Array[integer],
    length: js.Array[integer],
    start: js.Array[integer]
  ): TextBoxSnapshot = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], layoutIndex = layoutIndex.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxSnapshot]
  }
  
  extension [Self <: TextBoxSnapshot](x: Self) {
    
    inline def setBounds(value: js.Array[Rectangle]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: Rectangle*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    inline def setLayoutIndex(value: js.Array[integer]): Self = StObject.set(x, "layoutIndex", value.asInstanceOf[js.Any])
    
    inline def setLayoutIndexVarargs(value: integer*): Self = StObject.set(x, "layoutIndex", js.Array(value :_*))
    
    inline def setLength(value: js.Array[integer]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthVarargs(value: integer*): Self = StObject.set(x, "length", js.Array(value :_*))
    
    inline def setStart(value: js.Array[integer]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: integer*): Self = StObject.set(x, "start", js.Array(value :_*))
  }
}
