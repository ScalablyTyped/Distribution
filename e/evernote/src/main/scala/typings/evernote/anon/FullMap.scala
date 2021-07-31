package typings.evernote.anon

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullMap extends StObject {
  
  var fullMap: js.UndefOr[Map[String, String]] = js.undefined
  
  var keysOnly: js.UndefOr[Set[String]] = js.undefined
}
object FullMap {
  
  @scala.inline
  def apply(): FullMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullMap]
  }
  
  @scala.inline
  implicit class FullMapMutableBuilder[Self <: FullMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullMap(value: Map[String, String]): Self = StObject.set(x, "fullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullMapUndefined: Self = StObject.set(x, "fullMap", js.undefined)
    
    @scala.inline
    def setKeysOnly(value: Set[String]): Self = StObject.set(x, "keysOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysOnlyUndefined: Self = StObject.set(x, "keysOnly", js.undefined)
  }
}
