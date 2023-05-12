package typings.geotiff

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulePoolMod {
  
  /**
    * @module pool
    */
  /**
    * Pool for workers to decode chunks of the images.
    */
  @JSImport("geotiff/dist-module/pool", JSImport.Default)
  @js.native
  /**
    * @constructor
    * @param {Number} [size] The size of the pool. Defaults to the number of CPUs
    *                      available. When this parameter is `null` or 0, then the
    *                      decoding will be done in the main thread.
    * @param {function(): Worker} [createWorker] A function that creates the decoder worker.
    * Defaults to a worker with all decoders that ship with geotiff.js. The `createWorker()`
    * function is expected to return a `Worker` compatible with Web Workers. For code that
    * runs in Node, [web-worker](https://www.npmjs.com/package/web-worker) is a good choice.
    *
    * A worker that uses a custom lzw decoder would look like this `my-custom-worker.js` file:
    * ```js
    * import { addDecoder, getDecoder } from 'geotiff';
    * addDecoder(5, () => import ('./my-custom-lzw').then((m) => m.default));
    * self.addEventListener('message', async (e) => {
    *   const { id, fileDirectory, buffer } = e.data;
    *   const decoder = await getDecoder(fileDirectory);
    *   const decoded = await decoder.decode(fileDirectory, buffer);
    *   self.postMessage({ decoded, id }, [decoded]);
    * });
    * ```
    * The way the above code is built into a worker by the `createWorker()` function
    * depends on the used bundler. For most bundlers, something like this will work:
    * ```js
    * function createWorker() {
    *   return new Worker(new URL('./my-custom-worker.js', import.meta.url));
    * }
    * ```
    */
  open class default ()
    extends StObject
       with Pool {
    def this(size: Double) = this()
    def this(size: Double, createWorker: js.Function0[Worker]) = this()
    def this(size: Unit, createWorker: js.Function0[Worker]) = this()
    
    /* CompleteClass */
    var _awaitingDecoder: js.Promise[Any] | Null = js.native
    
    /**
      * Decode the given block of bytes with the set compression method.
      * @param {ArrayBuffer} buffer the array buffer of bytes to decode.
      * @returns {Promise<ArrayBuffer>} the decoded result as a `Promise`
      */
    /* CompleteClass */
    override def decode(fileDirectory: Any, buffer: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var messageId: Double = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var workers: js.Array[Any] | Null = js.native
  }
  
  /**
    * @module pool
    */
  /**
    * Pool for workers to decode chunks of the images.
    */
  trait Pool extends StObject {
    
    var _awaitingDecoder: js.Promise[Any] | Null
    
    /**
      * Decode the given block of bytes with the set compression method.
      * @param {ArrayBuffer} buffer the array buffer of bytes to decode.
      * @returns {Promise<ArrayBuffer>} the decoded result as a `Promise`
      */
    def decode(fileDirectory: Any, buffer: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer]
    
    def destroy(): Unit
    
    var messageId: Double
    
    var size: Double
    
    var workers: js.Array[Any] | Null
  }
  object Pool {
    
    inline def apply(
      decode: (Any, js.typedarray.ArrayBuffer) => js.Promise[js.typedarray.ArrayBuffer],
      destroy: () => Unit,
      messageId: Double,
      size: Double
    ): Pool = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), destroy = js.Any.fromFunction0(destroy), messageId = messageId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], _awaitingDecoder = null, workers = null)
      __obj.asInstanceOf[Pool]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pool] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: (Any, js.typedarray.ArrayBuffer) => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWorkers(value: js.Array[Any]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersNull: Self = StObject.set(x, "workers", null)
      
      inline def setWorkersVarargs(value: Any*): Self = StObject.set(x, "workers", js.Array(value*))
      
      inline def set_awaitingDecoder(value: js.Promise[Any]): Self = StObject.set(x, "_awaitingDecoder", value.asInstanceOf[js.Any])
      
      inline def set_awaitingDecoderNull: Self = StObject.set(x, "_awaitingDecoder", null)
    }
  }
}
