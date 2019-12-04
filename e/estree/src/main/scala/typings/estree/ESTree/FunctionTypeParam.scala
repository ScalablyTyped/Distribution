package typings.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParam extends js.Object {
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  var optional: Boolean
  var typeAnnotation: FlowTypeAnnotation
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any,
    optional: Boolean,
    typeAnnotation: FlowTypeAnnotation
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionTypeParam]
  }
}

