package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherPutWatchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var actions: js.UndefOr[Record[String, WatcherAction]] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var condition: js.UndefOr[WatcherConditionContainer] = js.undefined
  
  var id: Id
  
  var if_primary_term: js.UndefOr[long] = js.undefined
  
  var if_seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var input: js.UndefOr[WatcherInputContainer] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var throttle_period: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[TransformContainer] = js.undefined
  
  var trigger: js.UndefOr[WatcherTriggerContainer] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object WatcherPutWatchRequest {
  
  inline def apply(id: Id): WatcherPutWatchRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPutWatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherPutWatchRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: Record[String, WatcherAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCondition(value: WatcherConditionContainer): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_term(value: long): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    inline def setIf_seq_no(value: SequenceNumber): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    inline def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    inline def setInput(value: WatcherInputContainer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setThrottle_period(value: String): Self = StObject.set(x, "throttle_period", value.asInstanceOf[js.Any])
    
    inline def setThrottle_periodUndefined: Self = StObject.set(x, "throttle_period", js.undefined)
    
    inline def setTransform(value: TransformContainer): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTrigger(value: WatcherTriggerContainer): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
