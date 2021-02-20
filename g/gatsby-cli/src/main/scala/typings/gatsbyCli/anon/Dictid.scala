package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictid
  extends /* key */ StringDictionary[js.Any] {
  
  var context: Record[String, _] = js.native
  
  var error: js.UndefOr[Error] = js.native
  
  var id: String = js.native
}
object Dictid {
  
  @scala.inline
  def apply(context: Record[String, _], id: String): Dictid = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictid]
  }
  
  @scala.inline
  implicit class DictidMutableBuilder[Self <: Dictid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: Record[String, _]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
