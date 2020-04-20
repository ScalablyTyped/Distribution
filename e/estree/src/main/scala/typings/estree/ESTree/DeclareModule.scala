package typings.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ trait DeclareModule extends js.Object {
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
}

