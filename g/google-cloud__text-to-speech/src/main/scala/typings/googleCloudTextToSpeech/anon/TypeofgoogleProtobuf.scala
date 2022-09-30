package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgoogleProtobuf extends StObject {
  
  /** Namespace api. */
  val api: TypeofapiCustomHttpPatternCustomHttpPattern
  
  /** Namespace cloud. */
  val cloud: TypeofcloudLocation
  
  /** Namespace protobuf. */
  val protobuf: TypeofprotobufEnumDescriptorProto
}
object TypeofgoogleProtobuf {
  
  inline def apply(
    api: TypeofapiCustomHttpPatternCustomHttpPattern,
    cloud: TypeofcloudLocation,
    protobuf: TypeofprotobufEnumDescriptorProto
  ): TypeofgoogleProtobuf = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], cloud = cloud.asInstanceOf[js.Any], protobuf = protobuf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgoogleProtobuf]
  }
  
  extension [Self <: TypeofgoogleProtobuf](x: Self) {
    
    inline def setApi(value: TypeofapiCustomHttpPatternCustomHttpPattern): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setCloud(value: TypeofcloudLocation): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
    
    inline def setProtobuf(value: TypeofprotobufEnumDescriptorProto): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
  }
}
