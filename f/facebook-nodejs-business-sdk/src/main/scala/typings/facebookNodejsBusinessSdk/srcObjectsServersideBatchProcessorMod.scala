package typings.facebookNodejsBusinessSdk

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideBatchProcessorMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/batch-processor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BatchProcessor {
    def this(batch_size: Double, concurrent_requests: Double) = this()
    
    /* CompleteClass */
    var _batch_size: Double = js.native
    
    /* CompleteClass */
    var _concurrent_requests: Double = js.native
    
    /* CompleteClass */
    override def processEventRequests(
      event_requests: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default]
    ): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def processEventRequestsGenerator(
      event_requests: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default]
    ): Generator[
        js.Array[
          js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
        ], 
        Unit, 
        typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
      ] = js.native
    
    /* CompleteClass */
    override def processEvents(
      event_request_to_clone: typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default,
      all_events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]
    ): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def processEventsGenerator(
      event_request_to_clone: typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default,
      all_events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]
    ): Generator[
        js.Array[
          js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
        ], 
        Unit, 
        typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
      ] = js.native
  }
  
  trait BatchProcessor extends StObject {
    
    var _batch_size: Double
    
    var _concurrent_requests: Double
    
    def processEventRequests(
      event_requests: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default]
    ): js.Promise[Unit]
    
    def processEventRequestsGenerator(
      event_requests: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default]
    ): Generator[
        js.Array[
          js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
        ], 
        Unit, 
        typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
      ]
    
    def processEvents(
      event_request_to_clone: typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default,
      all_events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]
    ): js.Promise[Unit]
    
    def processEventsGenerator(
      event_request_to_clone: typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default,
      all_events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]
    ): Generator[
        js.Array[
          js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
        ], 
        Unit, 
        typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
      ]
  }
  object BatchProcessor {
    
    inline def apply(
      _batch_size: Double,
      _concurrent_requests: Double,
      processEventRequests: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default] => js.Promise[Unit],
      processEventRequestsGenerator: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default] => Generator[
          js.Array[
            js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
          ], 
          Unit, 
          typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
        ],
      processEvents: (typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default, js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]) => js.Promise[Unit],
      processEventsGenerator: (typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default, js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]) => Generator[
          js.Array[
            js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
          ], 
          Unit, 
          typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
        ]
    ): BatchProcessor = {
      val __obj = js.Dynamic.literal(_batch_size = _batch_size.asInstanceOf[js.Any], _concurrent_requests = _concurrent_requests.asInstanceOf[js.Any], processEventRequests = js.Any.fromFunction1(processEventRequests), processEventRequestsGenerator = js.Any.fromFunction1(processEventRequestsGenerator), processEvents = js.Any.fromFunction2(processEvents), processEventsGenerator = js.Any.fromFunction2(processEventsGenerator))
      __obj.asInstanceOf[BatchProcessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchProcessor] (val x: Self) extends AnyVal {
      
      inline def setProcessEventRequests(
        value: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default] => js.Promise[Unit]
      ): Self = StObject.set(x, "processEventRequests", js.Any.fromFunction1(value))
      
      inline def setProcessEventRequestsGenerator(
        value: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default] => Generator[
              js.Array[
                js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
              ], 
              Unit, 
              typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
            ]
      ): Self = StObject.set(x, "processEventRequestsGenerator", js.Any.fromFunction1(value))
      
      inline def setProcessEvents(
        value: (typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default, js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]) => js.Promise[Unit]
      ): Self = StObject.set(x, "processEvents", js.Any.fromFunction2(value))
      
      inline def setProcessEventsGenerator(
        value: (typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default, js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]) => Generator[
              js.Array[
                js.Promise[typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default]
              ], 
              Unit, 
              typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
            ]
      ): Self = StObject.set(x, "processEventsGenerator", js.Any.fromFunction2(value))
      
      inline def set_batch_size(value: Double): Self = StObject.set(x, "_batch_size", value.asInstanceOf[js.Any])
      
      inline def set_concurrent_requests(value: Double): Self = StObject.set(x, "_concurrent_requests", value.asInstanceOf[js.Any])
    }
  }
}
