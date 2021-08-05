package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostBucketsSigned extends StObject {
  
  var minutesExpiration: Double
}
object PostBucketsSigned {
  
  inline def apply(minutesExpiration: Double): PostBucketsSigned = {
    val __obj = js.Dynamic.literal(minutesExpiration = minutesExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsSigned]
  }
  
  extension [Self <: PostBucketsSigned](x: Self) {
    
    inline def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
  }
}
