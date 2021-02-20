package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait plugin extends StObject {
  
  def init(options: plotOptions): js.Any = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object plugin {
  
  @scala.inline
  def apply(init: plotOptions => js.Any): plugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[plugin]
  }
  
  @scala.inline
  implicit class pluginMutableBuilder[Self <: plugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: plotOptions => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
