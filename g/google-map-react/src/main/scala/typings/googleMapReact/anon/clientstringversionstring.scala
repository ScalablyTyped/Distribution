package typings.googleMapReact.anon

import typings.googleMapReact.mod.BootstrapURLKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  client :string} & {  version :string | undefined,   language :string | undefined,   region :string | undefined,   libraries :std.Array<string> | string | undefined,   id :string | undefined} */
trait clientstringversionstring
  extends StObject
     with BootstrapURLKeys {
  
  var client: String
  
  var id: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var libraries: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object clientstringversionstring {
  
  inline def apply(client: String): clientstringversionstring = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[clientstringversionstring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: clientstringversionstring] (val x: Self) extends AnyVal {
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLibraries(value: js.Array[String] | String): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
    
    inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
    
    inline def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
