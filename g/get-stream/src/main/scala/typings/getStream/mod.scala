package typings.getStream

import org.scalablytyped.runtime.Instantiable0
import typings.getStream.getStreamStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the `stream` as a string.
  	@returns A promise that resolves when the end event fires on the stream, indicating that there is no more data to be read. The stream is switched to flowing mode.
  	@example
  	```
  	import * as fs from 'fs';
  	import getStream = require('get-stream');
  	(async () => {
  		const stream = fs.createReadStream('unicorn.txt');
  		console.log(await getStream(stream));
  		//               ,,))))))));,
  		//            __)))))))))))))),
  		// \|/       -\(((((''''((((((((.
  		// -*-==//////((''  .     `)))))),
  		// /|\      ))| o    ;-.    '(((((                                  ,(,
  		//          ( `|    /  )    ;))))'                               ,_))^;(~
  		//             |   |   |   ,))((((_     _____------~~~-.        %,;(;(>';'~
  		//             o_);   ;    )))(((` ~---~  `::           \      %%~~)(v;(`('~
  		//                   ;    ''''````         `:       `:::|\,__,%%    );`'; ~
  		//                  |   _                )     /      `:|`----'     `-'
  		//            ______/\/~    |                 /        /
  		//          /~;;.____/;;'  /          ___--,-(   `;;;/
  		//         / //  _;______;'------~~~~~    /;;/\    /
  		//        //  | |                        / ;   \;;,\
  		//       (<_  | ;                      /',/-----'  _>
  		//        \_| ||_                     //~;~~~~~~~~~
  		//            `\_|                   (,~~
  		//                                    \~\
  		//                                     ~~
  	})();
  	```
  	*/
  @scala.inline
  def apply(stream: Stream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(stream: Stream, options: OptionsWithEncoding[BufferEncoding]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("get-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("get-stream", "MaxBufferError")
  @js.native
  def MaxBufferError: Instantiable0[MaxBufferErrorClass] = js.native
  type MaxBufferError = MaxBufferErrorClass
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("get-stream", "MaxBufferError")
  @js.native
  class MaxBufferErrorCls ()
    extends StObject
       with MaxBufferErrorClass {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_MaxBufferErrorClass: typings.getStream.getStreamStrings.MaxBufferError = js.native
  }
  
  @scala.inline
  def MaxBufferError_=(x: Instantiable0[MaxBufferErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxBufferError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def array(stream: Stream, options: OptionsWithEncoding[BufferEncoding]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  /**
  	Get the `stream` as an array of values.
  	It honors both the `maxBuffer` and `encoding` options. The behavior changes slightly based on the encoding chosen:
  	- When `encoding` is unset, it assumes an [object mode stream](https://nodesource.com/blog/understanding-object-streams/) and collects values emitted from `stream` unmodified. In this case `maxBuffer` refers to the number of items in the array (not the sum of their sizes).
  	- When `encoding` is set to `buffer`, it collects an array of buffers. `maxBuffer` refers to the summed byte lengths of every buffer in the array.
  	- When `encoding` is set to anything else, it collects an array of strings. `maxBuffer` refers to the summed character lengths of every string in the array.
  	*/
  @scala.inline
  def array[StreamObjectModeType](stream: Stream): js.Promise[js.Array[StreamObjectModeType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StreamObjectModeType]]]
  @scala.inline
  def array[StreamObjectModeType](stream: Stream, options: Options): js.Promise[js.Array[StreamObjectModeType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[StreamObjectModeType]]]
  
  @scala.inline
  def array_buffer(stream: Stream, options: OptionsWithEncoding[buffer]): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  /**
  	Get the `stream` as a buffer.
  	It honors the `maxBuffer` option as above, but it refers to byte length rather than string length.
  	*/
  @scala.inline
  def buffer(stream: Stream): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def buffer(stream: Stream, options: OptionsWithEncoding[BufferEncoding]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  trait MaxBufferErrorClass
    extends StObject
       with Error {
    
    @JSName("name")
    val name_MaxBufferErrorClass: typings.getStream.getStreamStrings.MaxBufferError
  }
  object MaxBufferErrorClass {
    
    @scala.inline
    def apply(message: String): MaxBufferErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "MaxBufferError")
      __obj.asInstanceOf[MaxBufferErrorClass]
    }
    
    @scala.inline
    implicit class MaxBufferErrorClassMutableBuilder[Self <: MaxBufferErrorClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.getStream.getStreamStrings.MaxBufferError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
    		Maximum length of the returned string. If it exceeds this value before the stream ends, the promise will be rejected with a `MaxBufferError` error.
    		@default Infinity
    		*/
    val maxBuffer: js.UndefOr[Double] = js.undefined
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
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    }
  }
  
  trait OptionsWithEncoding[EncodingType]
    extends StObject
       with Options {
    
    /**
    		[Encoding](https://nodejs.org/api/buffer.html#buffer_buffer) of the incoming stream.
    		@default 'utf8'
    		*/
    val encoding: js.UndefOr[EncodingType] = js.undefined
  }
  object OptionsWithEncoding {
    
    @scala.inline
    def apply[EncodingType](): OptionsWithEncoding[EncodingType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsWithEncoding[EncodingType]]
    }
    
    @scala.inline
    implicit class OptionsWithEncodingMutableBuilder[Self <: OptionsWithEncoding[?], EncodingType] (val x: Self & OptionsWithEncoding[EncodingType]) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
