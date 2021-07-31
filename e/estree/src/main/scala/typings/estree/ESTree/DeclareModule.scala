package typings.estree.ESTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ trait DeclareModule extends StObject {
  
  var body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ js.Any
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ js.Any
}
object DeclareModule {
  
  @scala.inline
  def apply(
    body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ js.Any,
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ js.Any
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModule]
  }
  
  @scala.inline
  implicit class DeclareModuleMutableBuilder[Self <: DeclareModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ js.Any
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ js.Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
