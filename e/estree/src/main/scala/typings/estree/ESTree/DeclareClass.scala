package typings.estree.ESTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ trait DeclareClass extends StObject {
  
  var body: ObjectTypeAnnotation
  
  var `extends`: js.Array[InterfaceExtends]
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.undefined
}
object DeclareClass {
  
  inline def apply(
    body: ObjectTypeAnnotation,
    `extends`: js.Array[InterfaceExtends],
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  ): DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareClass]
  }
  
  extension [Self <: DeclareClass](x: Self) {
    
    inline def setBody(value: ObjectTypeAnnotation): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setExtends(value: js.Array[InterfaceExtends]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsVarargs(value: InterfaceExtends*): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    inline def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
