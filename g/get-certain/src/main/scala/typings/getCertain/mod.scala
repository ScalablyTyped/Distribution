package typings.getCertain

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[TKey, TValue](map: Map[TKey, TValue], key: TKey): TValue = (^.asInstanceOf[js.Dynamic].apply(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[TValue]
  @scala.inline
  def apply[TKey, TValue](map: Map[TKey, TValue], key: TKey, message: String): TValue = (^.asInstanceOf[js.Dynamic].apply(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  @JSImport("get-certain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
