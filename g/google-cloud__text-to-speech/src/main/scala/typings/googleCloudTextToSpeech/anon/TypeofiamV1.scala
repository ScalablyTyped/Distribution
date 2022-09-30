package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofiamV1 extends StObject {
  
  /** Namespace v1. */
  val v1: Typeofv1AuditConfigDelta
}
object TypeofiamV1 {
  
  inline def apply(v1: Typeofv1AuditConfigDelta): TypeofiamV1 = {
    val __obj = js.Dynamic.literal(v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofiamV1]
  }
  
  extension [Self <: TypeofiamV1](x: Self) {
    
    inline def setV1(value: Typeofv1AuditConfigDelta): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
