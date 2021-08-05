package typings.esfxInternalTag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tag(): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Tag")().asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  inline def Tag(tag: String): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Tag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  inline def defineTag[T /* <: js.Object */](target: T, tag: String): T & Tagged = (^.asInstanceOf[js.Dynamic].applyDynamic("defineTag")(target.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[T & Tagged]
  
  @js.native
  trait Tagged extends StObject {
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
  }
}
