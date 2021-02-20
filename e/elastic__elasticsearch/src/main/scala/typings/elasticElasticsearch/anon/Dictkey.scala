package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var _index: String = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(_index: String): Dictkey = {
    val __obj = js.Dynamic.literal(_index = _index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
  }
}
