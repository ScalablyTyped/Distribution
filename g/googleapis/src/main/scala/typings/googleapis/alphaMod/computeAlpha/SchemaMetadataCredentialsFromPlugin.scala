package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom authenticator credentials.
  */
trait SchemaMetadataCredentialsFromPlugin extends StObject {
  
  /**
    * Plugin name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A text proto that conforms to a Struct type definition interpreted by the
    * plugin.
    */
  var structConfig: js.UndefOr[String] = js.undefined
}
object SchemaMetadataCredentialsFromPlugin {
  
  inline def apply(): SchemaMetadataCredentialsFromPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataCredentialsFromPlugin]
  }
  
  extension [Self <: SchemaMetadataCredentialsFromPlugin](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStructConfig(value: String): Self = StObject.set(x, "structConfig", value.asInstanceOf[js.Any])
    
    inline def setStructConfigUndefined: Self = StObject.set(x, "structConfig", js.undefined)
  }
}
