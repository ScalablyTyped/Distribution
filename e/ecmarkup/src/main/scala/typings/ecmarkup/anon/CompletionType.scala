package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.abrupt
import typings.ecmarkup.ecmarkupStrings.completion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionType
  extends StObject
     with typings.ecmarkup.libBiblioMod.Type {
  
  var completionType: abrupt
  
  var kind: completion
}
object CompletionType {
  
  inline def apply(): CompletionType = {
    val __obj = js.Dynamic.literal(completionType = "abrupt", kind = "completion")
    __obj.asInstanceOf[CompletionType]
  }
  
  extension [Self <: CompletionType](x: Self) {
    
    inline def setCompletionType(value: abrupt): Self = StObject.set(x, "completionType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: completion): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
