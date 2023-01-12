package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfoNativeCode extends StObject {
  
  var build_hash: String
  
  var version: VersionString
}
object MlInfoNativeCode {
  
  inline def apply(build_hash: String, version: VersionString): MlInfoNativeCode = {
    val __obj = js.Dynamic.literal(build_hash = build_hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfoNativeCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlInfoNativeCode] (val x: Self) extends AnyVal {
    
    inline def setBuild_hash(value: String): Self = StObject.set(x, "build_hash", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
