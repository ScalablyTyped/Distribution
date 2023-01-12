package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeNode
  extends StObject
     with FormatNode
     with Node {
  
  var contents: Null
  
  var location: LocationRange
  
  var name: pipe
  
  var nonTerminal: String
  
  var optional: Boolean
  
  var params: String
}
object PipeNode {
  
  inline def apply(contents: Null, location: LocationRange, nonTerminal: String, optional: Boolean, params: String): PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "pipe", nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeNode] (val x: Self) extends AnyVal {
    
    inline def setContents(value: Null): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: pipe): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNonTerminal(value: String): Self = StObject.set(x, "nonTerminal", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
