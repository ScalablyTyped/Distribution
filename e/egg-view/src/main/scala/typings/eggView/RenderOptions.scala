package typings.eggView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject * / any */ @js.native
trait RenderOptions extends StObject {
  
  var locals: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject */ js.Any
  ] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var viewEngine: js.UndefOr[String] = js.native
}
object RenderOptions {
  
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocals(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject */ js.Any
    ): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setViewEngine(value: String): Self = StObject.set(x, "viewEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewEngineUndefined: Self = StObject.set(x, "viewEngine", js.undefined)
  }
}
