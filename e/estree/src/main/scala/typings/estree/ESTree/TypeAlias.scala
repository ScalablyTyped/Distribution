package typings.estree.ESTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ trait TypeAlias extends StObject {
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  
  var right: FlowTypeAnnotation
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.undefined
}
object TypeAlias {
  
  inline def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any,
    right: FlowTypeAnnotation
  ): TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAlias]
  }
  
  extension [Self <: TypeAlias](x: Self) {
    
    inline def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRight(value: FlowTypeAnnotation): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
