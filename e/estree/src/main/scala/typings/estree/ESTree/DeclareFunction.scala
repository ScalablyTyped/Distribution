package typings.estree.ESTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration * / any */ @js.native
trait DeclareFunction extends StObject {
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any = js.native
}
object DeclareFunction {
  
  @scala.inline
  def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  ): DeclareFunction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareFunction]
  }
  
  @scala.inline
  implicit class DeclareFunctionMutableBuilder[Self <: DeclareFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
