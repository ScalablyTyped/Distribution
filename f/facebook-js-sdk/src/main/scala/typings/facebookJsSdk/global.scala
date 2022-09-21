package typings.facebookJsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("FB")
  @js.native
  def FB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fb.FacebookStatic */ Any = js.native
  inline def FB_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fb.FacebookStatic */ Any
  ): Unit = js.Dynamic.global.updateDynamic("FB")(x.asInstanceOf[js.Any])
  
  inline def fbAsyncInit(): Unit = js.Dynamic.global.applyDynamic("fbAsyncInit")().asInstanceOf[Unit]
}
