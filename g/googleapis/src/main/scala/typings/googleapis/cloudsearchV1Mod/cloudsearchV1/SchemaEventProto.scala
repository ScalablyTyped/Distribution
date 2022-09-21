package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventProto extends StObject {
  
  /**
    * Event IDs consist of alphanumeric characters and colons. Currently required.
    */
  var eventId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of Event members to consider, e.g. "all members" vs. "owners" vs. "admins". These are defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType enum options in social/graph/storage/proto/id.proto. See event.pb (defined in production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types associated with event. Currently required.
    */
  var memberType: js.UndefOr[Double | Null] = js.undefined
}
object SchemaEventProto {
  
  inline def apply(): SchemaEventProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventProto]
  }
  
  extension [Self <: SchemaEventProto](x: Self) {
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setMemberType(value: Double): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeNull: Self = StObject.set(x, "memberType", null)
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
  }
}
