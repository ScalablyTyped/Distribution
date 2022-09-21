package typings.estree.ESTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ trait DeclareModule extends StObject {
  
  var body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ Any
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ Any
}
object DeclareModule {
  
  inline def apply(
    body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ Any,
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ Any
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModule]
  }
  
  extension [Self <: DeclareModule](x: Self) {
    
    inline def setBody(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ Any
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
