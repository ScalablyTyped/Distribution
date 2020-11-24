package typings.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ @js.native
trait DeclareClass extends js.Object {
  
  var body: ObjectTypeAnnotation = js.native
  
  var `extends`: js.Array[InterfaceExtends] = js.native
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.native
}
object DeclareClass {
  
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    `extends`: js.Array[InterfaceExtends],
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  ): DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareClass]
  }
  
  @scala.inline
  implicit class DeclareClassOps[Self <: DeclareClass] (val x: Self) extends AnyVal {
    
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
    def setBody(value: ObjectTypeAnnotation): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends*): Self = this.set("extends", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends]): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeParameters: Self = this.set("typeParameters", js.undefined)
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
