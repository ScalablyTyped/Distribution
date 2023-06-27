package typings.getPort

import typings.getPort.anon.Exclude
import typings.getPort.getPortStrings.port
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Double]]
  inline def default(options: Options): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def portNumbers(from: Double, to: Double): js.Iterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("portNumbers")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Double]]
  
  type Options = Exclude & (Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListenOptions */ Any, 
    port
  ])
}
