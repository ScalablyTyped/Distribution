package typings.emberTestHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupRenderingContextMod {
  
  @JSImport("@ember/test-helpers/setup-rendering-context", JSImport.Default)
  @js.native
  def default[Context /* <: js.Object */](context: Context): js.Promise[Context] = js.native
  
  @JSImport("@ember/test-helpers/setup-rendering-context", "clearRender")
  @js.native
  def clearRender(): js.Promise[Unit] = js.native
  
  @JSImport("@ember/test-helpers/setup-rendering-context", "render")
  @js.native
  def render(
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateFactory */ js.Any
  ): js.Promise[Unit] = js.native
}
