package typings.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ trait DeclareClass extends js.Object {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends]
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.undefined
}

object DeclareClass {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    `extends`: js.Array[InterfaceExtends],
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any,
    typeParameters: js.UndefOr[Null | TypeParameterDeclaration] = js.undefined
  ): DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareClass]
  }
}

