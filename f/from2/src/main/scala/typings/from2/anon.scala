package typings.from2

import typings.from2.from2Booleans.`true`
import typings.node.BufferEncoding
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  objectMode :true | undefined} & node.stream.ReadableOptions */
  trait objectModetrueundefinedRe extends StObject {
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Readable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[`true`] & js.UndefOr[Boolean]
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.undefined
  }
  object objectModetrueundefinedRe {
    
    @scala.inline
    def apply(objectMode: js.UndefOr[`true`] & js.UndefOr[Boolean]): objectModetrueundefinedRe = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[objectModetrueundefinedRe]
    }
    
    @scala.inline
    implicit class objectModetrueundefinedReMutableBuilder[Self <: objectModetrueundefinedRe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Readable, 
              /* error */ Error | Null, 
              /* callback */ js.Function1[/* error */ Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setObjectMode(value: js.UndefOr[`true`] & js.UndefOr[Boolean]): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
}
