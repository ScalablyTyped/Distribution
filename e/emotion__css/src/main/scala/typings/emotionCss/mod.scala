package typings.emotionCss

import typings.emotionSerialize.mod.Interpolation
import typings.emotionUtils.mod.SerializedStyles
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: Interpolation[Unit]*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[SerializedStyles]
  inline def default(template: TemplateStringsArray, args: Interpolation[Unit]*): SerializedStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SerializedStyles]
}
