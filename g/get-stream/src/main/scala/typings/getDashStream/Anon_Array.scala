package typings.getDashStream

import typings.getDashStream.getDashStreamMod.Options
import typings.getDashStream.getDashStreamMod.OptionsWithEncoding
import typings.getDashStream.getDashStreamStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Array extends js.Object {
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
  def apply(stream: Stream): js.Promise[String] = js.native
  def apply(stream: Stream, options: OptionsWithEncoding[BufferEncoding]): js.Promise[String] = js.native
  def array(stream: Stream, options: OptionsWithEncoding[BufferEncoding]): js.Promise[js.Array[String]] = js.native
  /**
  	Get the `stream` as an array of values.
  	It honors both the `maxBuffer` and `encoding` options. The behavior changes slightly based on the encoding chosen:
  	- When `encoding` is unset, it assumes an [object mode stream](https://nodesource.com/blog/understanding-object-streams/) and collects values emitted from `stream` unmodified. In this case `maxBuffer` refers to the number of items in the array (not the sum of their sizes).
  	- When `encoding` is set to `buffer`, it collects an array of buffers. `maxBuffer` refers to the summed byte lengths of every buffer in the array.
  	- When `encoding` is set to anything else, it collects an array of strings. `maxBuffer` refers to the summed character lengths of every string in the array.
  	*/
  def array[StreamObjectModeType](stream: Stream): js.Promise[js.Array[StreamObjectModeType]] = js.native
  def array[StreamObjectModeType](stream: Stream, options: Options): js.Promise[js.Array[StreamObjectModeType]] = js.native
  @JSName("array")
  def array_buffer(stream: Stream, options: OptionsWithEncoding[buffer]): js.Promise[js.Array[Buffer]] = js.native
  /**
  	Get the `stream` as a buffer.
  	It honors the `maxBuffer` option as above, but it refers to byte length rather than string length.
  	*/
  def buffer(stream: Stream): js.Promise[Buffer] = js.native
  def buffer(stream: Stream, options: OptionsWithEncoding[BufferEncoding]): js.Promise[Buffer] = js.native
}

