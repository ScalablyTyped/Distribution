package typings.glaze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze/dist-types/useStyleInjector", JSImport.Namespace)
@js.native
object useStyleInjectorMod extends js.Object {
  
  def useStyleInjector(): js.Function4[
    /* identName */ String, 
    /* property */ String, 
    /* value */ String | Double, 
    /* wrapRule */ js.UndefOr[js.Function1[/* cssText */ String, String]], 
    String
  ] = js.native
}
