package typings.from2

import typings.from2.from2Booleans.`true`
import typings.node.AbortSignal
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  objectMode :true | undefined} & node.stream.ReadableOptions */
  trait objectModetrueundefinedRe extends StObject {
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var construct: js.UndefOr[
        js.ThisFunction1[
          /* this */ Readable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Readable, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var emitClose: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[`true`] & js.UndefOr[Boolean]
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.undefined
    
    /**
      * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object objectModetrueundefinedRe {
    
    inline def apply(objectMode: js.UndefOr[`true`] & js.UndefOr[Boolean]): objectModetrueundefinedRe = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[objectModetrueundefinedRe]
    }
    
    extension [Self <: objectModetrueundefinedRe](x: Self) {
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setConstruct(
        value: js.ThisFunction1[
              /* this */ Readable, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setDestroy(
        value: js.ThisFunction2[
              /* this */ Readable, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      inline def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setObjectMode(value: js.UndefOr[`true`] & js.UndefOr[Boolean]): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
