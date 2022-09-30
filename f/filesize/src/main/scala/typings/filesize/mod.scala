package typings.filesize

import typings.filesize.anon.Base
import typings.filesize.anon.Exponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filesize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filesize(arg: Any): String | Double | js.Array[Any] | Exponent = ^.asInstanceOf[js.Dynamic].applyDynamic("filesize")(arg.asInstanceOf[js.Any]).asInstanceOf[String | Double | js.Array[Any] | Exponent]
  inline def filesize(
    arg: Any,
    hasBitsPadBaseRoundLocaleLocaleOptionsSeparatorSpacerSymbolsStandardOutputFullformFullformsExponentRoundingMethodPrecision: Base
  ): String | Double | js.Array[Any] | Exponent = (^.asInstanceOf[js.Dynamic].applyDynamic("filesize")(arg.asInstanceOf[js.Any], hasBitsPadBaseRoundLocaleLocaleOptionsSeparatorSpacerSymbolsStandardOutputFullformFullformsExponentRoundingMethodPrecision.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[Any] | Exponent]
  
  inline def partial(): js.Function1[/* arg */ Any, String | Double | js.Array[Any] | Exponent] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")().asInstanceOf[js.Function1[/* arg */ Any, String | Double | js.Array[Any] | Exponent]]
  inline def partial(
    hasBitsPadBaseRoundLocaleLocaleOptionsSeparatorSpacerSymbolsStandardOutputFullformFullformsExponentRoundingMethodPrecision: Base
  ): js.Function1[/* arg */ Any, String | Double | js.Array[Any] | Exponent] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(hasBitsPadBaseRoundLocaleLocaleOptionsSeparatorSpacerSymbolsStandardOutputFullformFullformsExponentRoundingMethodPrecision.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg */ Any, String | Double | js.Array[Any] | Exponent]]
}
