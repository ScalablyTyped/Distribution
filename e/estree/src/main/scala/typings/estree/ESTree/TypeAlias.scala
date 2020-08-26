package typings.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ @js.native
trait TypeAlias extends js.Object {
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any = js.native
  var right: FlowTypeAnnotation = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.native
}

object TypeAlias {
  @scala.inline
  def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any,
    right: FlowTypeAnnotation
  ): TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAlias]
  }
  @scala.inline
  implicit class TypeAliasOps[Self <: TypeAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: FlowTypeAnnotation): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameters: Self = this.set("typeParameters", js.undefined)
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
  
}

