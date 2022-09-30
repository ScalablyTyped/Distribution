package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofgoogle extends StObject {
  
  /** Namespace api. */
  val api: Typeofapi
  
  /** Namespace iam. */
  val iam: Typeofiam
  
  /** Namespace protobuf. */
  val protobuf: Typeofprotobuf
  
  /** Namespace type. */
  val `type`: Typeoftype
}
object Typeofgoogle {
  
  inline def apply(api: Typeofapi, iam: Typeofiam, protobuf: Typeofprotobuf, `type`: Typeoftype): Typeofgoogle = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], iam = iam.asInstanceOf[js.Any], protobuf = protobuf.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgoogle]
  }
  
  extension [Self <: Typeofgoogle](x: Self) {
    
    inline def setApi(value: Typeofapi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setIam(value: Typeofiam): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setProtobuf(value: Typeofprotobuf): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
    
    inline def setType(value: Typeoftype): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
