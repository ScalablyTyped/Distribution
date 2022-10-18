package typings.emotionCss

import typings.emotionSerialize.mod.Interpolation
import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    args: (Interpolation[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Props */ Any
    ])*
  ): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SerializedStyles]
}
