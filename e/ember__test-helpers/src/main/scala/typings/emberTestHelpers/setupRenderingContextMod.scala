package typings.emberTestHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/test-helpers/setup-rendering-context", JSImport.Namespace)
@js.native
object setupRenderingContextMod extends js.Object {
  
  def clearRender(): js.Promise[Unit] = js.native
  
  def default[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  
  def render(
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateFactory */ js.Any
  ): js.Promise[Unit] = js.native
}
