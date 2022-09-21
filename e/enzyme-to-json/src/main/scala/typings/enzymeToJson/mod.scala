package typings.enzymeToJson

import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-to-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P, S](
    wrapper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Cheerio */ Any
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapper.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def default[P, S](wrapper: ReactWrapper[P, S, Component[js.Object, js.Object, Any]]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapper.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def default[P, S](wrapper: ShallowWrapper[P, S, Component[js.Object, js.Object, Any]]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrapper.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
