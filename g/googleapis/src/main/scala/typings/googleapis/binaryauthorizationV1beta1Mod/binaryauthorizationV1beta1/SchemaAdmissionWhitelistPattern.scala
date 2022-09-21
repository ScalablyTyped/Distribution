package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdmissionWhitelistPattern extends StObject {
  
  /**
    * An image name pattern to allowlist, in the form `registry/path/to/image`. This supports a trailing `*` as a wildcard, but this is allowed only in text after the `registry/` part. `*` wildcard does not match `/`, i.e., `gcr.io/nginx*` matches `gcr.io/nginx@latest`, but it does not match `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which matches subdirectories, i.e., `gcr.io/nginx**` matches `gcr.io/nginx/image`.
    */
  var namePattern: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdmissionWhitelistPattern {
  
  inline def apply(): SchemaAdmissionWhitelistPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdmissionWhitelistPattern]
  }
  
  extension [Self <: SchemaAdmissionWhitelistPattern](x: Self) {
    
    inline def setNamePattern(value: String): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    inline def setNamePatternNull: Self = StObject.set(x, "namePattern", null)
    
    inline def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
  }
}
