package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfoNativeCodeInformation extends StObject {
  
  var build_hash: String
  
  var version: VersionString
}
object XpackInfoNativeCodeInformation {
  
  inline def apply(build_hash: String, version: VersionString): XpackInfoNativeCodeInformation = {
    val __obj = js.Dynamic.literal(build_hash = build_hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackInfoNativeCodeInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackInfoNativeCodeInformation] (val x: Self) extends AnyVal {
    
    inline def setBuild_hash(value: String): Self = StObject.set(x, "build_hash", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
