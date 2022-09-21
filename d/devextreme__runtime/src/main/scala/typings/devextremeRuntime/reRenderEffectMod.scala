package typings.devextremeRuntime

import typings.devextremeRuntime.effectMod.InfernoEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reRenderEffectMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno/re_render_effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createReRenderEffect(): InfernoEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("createReRenderEffect")().asInstanceOf[InfernoEffect]
}
