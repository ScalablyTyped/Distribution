package typings.estree.ESTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression * / any */ trait TypeCastExpression extends StObject {
  
  var expression: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any
  
  var typeAnnotation: TypeAnnotation
}
object TypeCastExpression {
  
  @scala.inline
  def apply(
    expression: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any,
    typeAnnotation: TypeAnnotation
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCastExpression]
  }
  
  @scala.inline
  implicit class TypeCastExpressionMutableBuilder[Self <: TypeCastExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any
    ): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
