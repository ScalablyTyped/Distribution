package typings.dynmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandaloneConfiguration extends StObject {
  
  var url: typings.dynmap.anon.Configuration
}
object StandaloneConfiguration {
  
  inline def apply(url: typings.dynmap.anon.Configuration): StandaloneConfiguration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandaloneConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandaloneConfiguration] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: typings.dynmap.anon.Configuration): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
