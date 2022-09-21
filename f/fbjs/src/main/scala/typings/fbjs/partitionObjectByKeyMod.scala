package typings.fbjs

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionObjectByKeyMod {
  
  inline def apply(source: js.Object, whitelist: Set[String]): js.Tuple2[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Object, js.Object]]
  
  @JSImport("fbjs/lib/partitionObjectByKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
