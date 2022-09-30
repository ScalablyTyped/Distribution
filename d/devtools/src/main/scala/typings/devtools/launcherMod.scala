package typings.devtools

import typings.devtools.typesMod.ExtendedCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launcherMod {
  
  @JSImport("devtools/build/launcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(capabilities: ExtendedCapabilities): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(capabilities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ Any
  ]]
}
