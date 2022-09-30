package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgoogleCloud extends StObject {
  
  /** Namespace api. */
  val api: TypeofapiHttp
  
  /** Namespace cloud. */
  val cloud: Typeofcloud
  
  /** Namespace protobuf. */
  val protobuf: TypeofprotobufAny
}
object TypeofgoogleCloud {
  
  inline def apply(api: TypeofapiHttp, cloud: Typeofcloud, protobuf: TypeofprotobufAny): TypeofgoogleCloud = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], cloud = cloud.asInstanceOf[js.Any], protobuf = protobuf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgoogleCloud]
  }
  
  extension [Self <: TypeofgoogleCloud](x: Self) {
    
    inline def setApi(value: TypeofapiHttp): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setCloud(value: Typeofcloud): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
    
    inline def setProtobuf(value: TypeofprotobufAny): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
  }
}
