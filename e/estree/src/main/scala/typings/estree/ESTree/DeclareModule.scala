package typings.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ @js.native
trait DeclareModule extends js.Object {
  var body: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ js.Any = js.native
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ js.Any = js.native
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
  implicit class DeclareModuleOps[Self <: DeclareModule] (val x: Self) extends AnyVal {
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
    def setBody(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockStatement */ js.Any
    ): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ js.Any
    ): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

