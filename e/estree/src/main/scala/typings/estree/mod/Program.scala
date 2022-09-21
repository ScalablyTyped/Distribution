package typings.estree.mod

import typings.estree.estreeStrings.module
import typings.estree.estreeStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Program
  extends StObject
     with BaseNode {
  
  var body: js.Array[Directive | Statement | ModuleDeclaration]
  
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var sourceType: script | module
  
  @JSName("type")
  var type_Program: typings.estree.estreeStrings.Program
}
object Program {
  
  inline def apply(body: js.Array[Directive | Statement | ModuleDeclaration], sourceType: script | module): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[Program]
  }
  
  extension [Self <: Program](x: Self) {
    
    inline def setBody(value: js.Array[Directive | Statement | ModuleDeclaration]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: (Directive | Statement | ModuleDeclaration)*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
