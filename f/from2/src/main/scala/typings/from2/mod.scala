package typings.from2

import org.scalablytyped.runtime.Instantiable1
import typings.from2.anon.objectModetrueundefinedRe
import typings.from2.from2Booleans.`false`
import typings.from2.from2Booleans.`true`
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.ReadableOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(opts: ObjectModeOptions, read: ReadObjectInput): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  @scala.inline
  def apply(opts: Options, read: ReadInput): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  @scala.inline
  def apply(read: ReadInput): ReadableStream = ^.asInstanceOf[js.Dynamic].apply(read.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  @JSImport("from2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ctor(): From2Ctor[ReadInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")().asInstanceOf[From2Ctor[ReadInput]]
  @scala.inline
  def ctor(opts: ObjectModeOptions): From2Ctor[ReadObjectInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any]).asInstanceOf[From2Ctor[ReadObjectInput]]
  @scala.inline
  def ctor(opts: Options): From2Ctor[ReadInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any]).asInstanceOf[From2Ctor[ReadInput]]
  
  @scala.inline
  def obj(opts: objectModetrueundefinedRe, read: ReadObjectInput): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  @scala.inline
  def obj(read: ReadObjectInput): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(read.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  type Chunk = String | Buffer | Uint8Array | Null
  
  type From2Ctor[R /* <: ReadInput | ReadObjectInput */] = Instantiable1[/* read */ R, ReadableStream]
  
  type NextCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ Chunk, Unit]
  
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ js.Any, Unit]
  
  trait ObjectModeOptions
    extends StObject
       with ReadableOptions {
    
    @JSName("objectMode")
    var objectMode_ObjectModeOptions: `true`
  }
  object ObjectModeOptions {
    
    @scala.inline
    def apply(): ObjectModeOptions = {
      val __obj = js.Dynamic.literal(objectMode = true)
      __obj.asInstanceOf[ObjectModeOptions]
    }
    
    @scala.inline
    implicit class ObjectModeOptionsMutableBuilder[Self <: ObjectModeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectMode(value: `true`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with ReadableOptions {
    
    @JSName("objectMode")
    var objectMode_Options: js.UndefOr[`false`] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectMode(value: `false`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  type ReadCallback[N /* <: NextCallback | NextObjectCallback */] = js.Function2[/* size */ Double, /* next */ N, Unit]
  
  type ReadInput = ReadCallback[NextCallback] | js.Array[Chunk]
  
  type ReadObjectInput = ReadCallback[NextObjectCallback] | js.Array[js.Any]
}
