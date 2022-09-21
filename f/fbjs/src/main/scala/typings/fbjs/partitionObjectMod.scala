package typings.fbjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionObjectMod {
  
  inline def apply[Tv](
    `object`: StringDictionary[Tv],
    callback: js.Function3[/* value */ Tv, /* key */ String, /* object */ StringDictionary[Tv], Boolean]
  ): js.Tuple2[StringDictionary[Tv], StringDictionary[Tv]] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StringDictionary[Tv], StringDictionary[Tv]]]
  inline def apply[Tv](
    `object`: StringDictionary[Tv],
    callback: js.Function3[/* value */ Tv, /* key */ String, /* object */ StringDictionary[Tv], Boolean],
    context: Any
  ): js.Tuple2[StringDictionary[Tv], StringDictionary[Tv]] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StringDictionary[Tv], StringDictionary[Tv]]]
  
  @JSImport("fbjs/lib/partitionObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
