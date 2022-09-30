package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgoogleApi extends StObject {
  
  /** Namespace api. */
  val api: TypeofapiCustomHttpPattern
  
  /** Namespace iam. */
  val iam: TypeofiamV1
  
  /** Namespace protobuf. */
  val protobuf: TypeofprotobufDescriptorProto
  
  /** Namespace type. */
  val `type`: TypeoftypeExpr
}
object TypeofgoogleApi {
  
  inline def apply(
    api: TypeofapiCustomHttpPattern,
    iam: TypeofiamV1,
    protobuf: TypeofprotobufDescriptorProto,
    `type`: TypeoftypeExpr
  ): TypeofgoogleApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], iam = iam.asInstanceOf[js.Any], protobuf = protobuf.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgoogleApi]
  }
  
  extension [Self <: TypeofgoogleApi](x: Self) {
    
    inline def setApi(value: TypeofapiCustomHttpPattern): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setIam(value: TypeofiamV1): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setProtobuf(value: TypeofprotobufDescriptorProto): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeoftypeExpr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
