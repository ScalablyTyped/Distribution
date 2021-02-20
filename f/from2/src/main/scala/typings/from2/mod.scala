package typings.from2

import org.scalablytyped.runtime.Instantiable1
import typings.from2.anon.objectModetrueundefinedRe
import typings.from2.from2Booleans.`false`
import typings.from2.from2Booleans.`true`
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("from2", JSImport.Namespace)
  @js.native
  def apply(opts: ObjectModeOptions, read: ReadObjectInput): ReadableStream = js.native
  @JSImport("from2", JSImport.Namespace)
  @js.native
  def apply(opts: Options, read: ReadInput): ReadableStream = js.native
  @JSImport("from2", JSImport.Namespace)
  @js.native
  def apply(read: ReadInput): ReadableStream = js.native
  
  @JSImport("from2", "ctor")
  @js.native
  def ctor(): From2Ctor[ReadInput] = js.native
  @JSImport("from2", "ctor")
  @js.native
  def ctor(opts: ObjectModeOptions): From2Ctor[ReadObjectInput] = js.native
  @JSImport("from2", "ctor")
  @js.native
  def ctor(opts: Options): From2Ctor[ReadInput] = js.native
  
  @JSImport("from2", "obj")
  @js.native
  def obj(opts: objectModetrueundefinedRe, read: ReadObjectInput): ReadableStream = js.native
  @JSImport("from2", "obj")
  @js.native
  def obj(read: ReadObjectInput): ReadableStream = js.native
  
  type Chunk = String | Buffer | Uint8Array | Null
  
  type From2Ctor[R /* <: ReadInput | ReadObjectInput */] = Instantiable1[/* read */ R, ReadableStream]
  
  type NextCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ Chunk, Unit]
  
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ js.Any, Unit]
  
  /* Inlined {  objectMode :true} & node.stream.ReadableOptions */
  @js.native
  trait ObjectModeOptions extends StObject {
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Readable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var objectMode: `true` with js.UndefOr[Boolean] = js.native
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.native
  }
  object ObjectModeOptions {
    
    @scala.inline
    def apply(objectMode: `true` with js.UndefOr[Boolean]): ObjectModeOptions = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectModeOptions]
    }
    
    @scala.inline
    implicit class ObjectModeOptionsMutableBuilder[Self <: ObjectModeOptions] (val x: Self) extends AnyVal {
      
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
      def setObjectMode(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
  
  /* Inlined {  objectMode :false | undefined} & node.stream.ReadableOptions */
  @js.native
  trait Options extends StObject {
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Readable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var objectMode: js.UndefOr[`false`] with js.UndefOr[Boolean] = js.native
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(objectMode: js.UndefOr[`false`] with js.UndefOr[Boolean]): Options = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      def setObjectMode(value: js.UndefOr[`false`] with js.UndefOr[Boolean]): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
  
  type ReadCallback[N /* <: NextCallback | NextObjectCallback */] = js.Function2[/* size */ Double, /* next */ N, Unit]
  
  type ReadInput = ReadCallback[NextCallback] | js.Array[Chunk]
  
  type ReadObjectInput = ReadCallback[NextObjectCallback] | js.Array[js.Any]
}
