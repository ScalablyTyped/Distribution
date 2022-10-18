package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.TextStructureFindStructureRequest
import typings.elasticElasticsearch.libApiTypesMod.TextStructureFindStructureResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiTextStructureMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/text_structure", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TextStructure {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait TextStructure extends StObject {
    
    def findStructure[TJsonDocument](params: TextStructureFindStructureRequest[TJsonDocument]): js.Promise[TextStructureFindStructureResponse] = js.native
    def findStructure[TJsonDocument](params: TextStructureFindStructureRequest[TJsonDocument], options: TransportRequestOptions): js.Promise[TextStructureFindStructureResponse] = js.native
    def findStructure[TJsonDocument](params: TextStructureFindStructureRequest[TJsonDocument], options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TextStructureFindStructureResponse, Any]] = js.native
    def findStructure[TJsonDocument](
      params: TextStructureFindStructureRequest[TJsonDocument],
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TextStructureFindStructureResponse] = js.native
    def findStructure[TJsonDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TextStructureFindStructureRequest[TJsonDocument]
    ): js.Promise[TextStructureFindStructureResponse] = js.native
    def findStructure[TJsonDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TextStructureFindStructureRequest[TJsonDocument],
      options: TransportRequestOptions
    ): js.Promise[TextStructureFindStructureResponse] = js.native
    def findStructure[TJsonDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TextStructureFindStructureRequest[TJsonDocument],
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TextStructureFindStructureResponse, Any]] = js.native
    def findStructure[TJsonDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TextStructureFindStructureRequest[TJsonDocument],
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TextStructureFindStructureResponse] = js.native
    
    var transport: Transport = js.native
  }
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
