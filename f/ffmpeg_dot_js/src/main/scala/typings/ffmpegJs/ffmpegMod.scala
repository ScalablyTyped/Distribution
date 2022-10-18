package typings.ffmpegJs

import typings.ffmpegJs.ffmpegMod.ffmpeg.Options
import typings.ffmpegJs.ffmpegMod.ffmpeg.Result
import typings.ffmpegJs.ffmpegMod.ffmpeg.Worker.OnMessageOptions
import typings.ffmpegJs.ffmpegMod.ffmpeg.Worker.PostMessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object ffmpegMod {
  
  inline def apply(opts: Options): Result = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("ffmpeg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ffmpeg", "Worker")
  @js.native
  open class Worker ()
    extends StObject
       with typings.ffmpegJs.ffmpegMod.ffmpeg.Worker {
    def this(someParam: String) = this()
    
    /* CompleteClass */
    override def onmessage(opts: OnMessageOptions): Unit = js.native
    
    /* CompleteClass */
    override def postMessage(opts: PostMessageOptions): Unit = js.native
    
    /* CompleteClass */
    override def terminate(): Unit = js.native
  }
  
  object ffmpeg {
    
    trait Mount extends StObject {
      
      var mountpoint: String
      
      var opts: Opts
      
      var `type`: String
    }
    object Mount {
      
      inline def apply(mountpoint: String, opts: Opts, `type`: String): Mount = {
        val __obj = js.Dynamic.literal(mountpoint = mountpoint.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Mount]
      }
      
      extension [Self <: Mount](x: Self) {
        
        inline def setMountpoint(value: String): Self = StObject.set(x, "mountpoint", value.asInstanceOf[js.Any])
        
        inline def setOpts(value: Opts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var MEMFS: js.UndefOr[js.Array[Video]] = js.undefined
      
      var TOTAL_MEMORY: js.UndefOr[Double] = js.undefined
      
      var arguments: js.Array[String]
      
      var mounts: js.UndefOr[js.Array[Mount]] = js.undefined
      
      var onExit: js.UndefOr[js.Function1[/* code */ Any, Unit]] = js.undefined
      
      var print: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
      
      var printErr: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
      
      var stdin: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
    }
    object Options {
      
      inline def apply(arguments: js.Array[String]): Options = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
        
        inline def setMEMFS(value: js.Array[Video]): Self = StObject.set(x, "MEMFS", value.asInstanceOf[js.Any])
        
        inline def setMEMFSUndefined: Self = StObject.set(x, "MEMFS", js.undefined)
        
        inline def setMEMFSVarargs(value: Video*): Self = StObject.set(x, "MEMFS", js.Array(value*))
        
        inline def setMounts(value: js.Array[Mount]): Self = StObject.set(x, "mounts", value.asInstanceOf[js.Any])
        
        inline def setMountsUndefined: Self = StObject.set(x, "mounts", js.undefined)
        
        inline def setMountsVarargs(value: Mount*): Self = StObject.set(x, "mounts", js.Array(value*))
        
        inline def setOnExit(value: /* code */ Any => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
        
        inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
        
        inline def setPrint(value: /* data */ Any => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
        
        inline def setPrintErr(value: /* data */ Any => Unit): Self = StObject.set(x, "printErr", js.Any.fromFunction1(value))
        
        inline def setPrintErrUndefined: Self = StObject.set(x, "printErr", js.undefined)
        
        inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
        
        inline def setStdin(value: /* data */ Any => Unit): Self = StObject.set(x, "stdin", js.Any.fromFunction1(value))
        
        inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
        
        inline def setTOTAL_MEMORY(value: Double): Self = StObject.set(x, "TOTAL_MEMORY", value.asInstanceOf[js.Any])
        
        inline def setTOTAL_MEMORYUndefined: Self = StObject.set(x, "TOTAL_MEMORY", js.undefined)
      }
    }
    
    trait Opts extends StObject {
      
      var root: String
    }
    object Opts {
      
      inline def apply(root: String): Opts = {
        val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
        __obj.asInstanceOf[Opts]
      }
      
      extension [Self <: Opts](x: Self) {
        
        inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      }
    }
    
    trait Result extends StObject {
      
      var MEMFS: js.Array[Video]
    }
    object Result {
      
      inline def apply(MEMFS: js.Array[Video]): Result = {
        val __obj = js.Dynamic.literal(MEMFS = MEMFS.asInstanceOf[js.Any])
        __obj.asInstanceOf[Result]
      }
      
      extension [Self <: Result](x: Self) {
        
        inline def setMEMFS(value: js.Array[Video]): Self = StObject.set(x, "MEMFS", value.asInstanceOf[js.Any])
        
        inline def setMEMFSVarargs(value: Video*): Self = StObject.set(x, "MEMFS", js.Array(value*))
      }
    }
    
    trait Video extends StObject {
      
      var data: js.typedarray.Uint8Array
      
      var name: String
    }
    object Video {
      
      inline def apply(data: js.typedarray.Uint8Array, name: String): Video = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Video]
      }
      
      extension [Self <: Video](x: Self) {
        
        inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait Worker extends StObject {
      
      def onmessage(opts: OnMessageOptions): Unit
      
      def postMessage(opts: PostMessageOptions): Unit
      
      def terminate(): Unit
    }
    object Worker {
      
      inline def apply(
        onmessage: OnMessageOptions => Unit,
        postMessage: PostMessageOptions => Unit,
        terminate: () => Unit
      ): typings.ffmpegJs.ffmpegMod.ffmpeg.Worker = {
        val __obj = js.Dynamic.literal(onmessage = js.Any.fromFunction1(onmessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
        __obj.asInstanceOf[typings.ffmpegJs.ffmpegMod.ffmpeg.Worker]
      }
      
      trait Data extends StObject {
        
        var data: String
        
        var `type`: String
      }
      object Data {
        
        inline def apply(data: String, `type`: String): Data = {
          val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[Data]
        }
        
        extension [Self <: Data](x: Self) {
          
          inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      trait OnMessageOptions extends StObject {
        
        var data: Data
      }
      object OnMessageOptions {
        
        inline def apply(data: Data): OnMessageOptions = {
          val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
          __obj.asInstanceOf[OnMessageOptions]
        }
        
        extension [Self <: OnMessageOptions](x: Self) {
          
          inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        }
      }
      
      trait PostMessageOptions extends StObject {
        
        var arguments: js.Array[String]
        
        var `type`: String
      }
      object PostMessageOptions {
        
        inline def apply(arguments: js.Array[String], `type`: String): PostMessageOptions = {
          val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[PostMessageOptions]
        }
        
        extension [Self <: PostMessageOptions](x: Self) {
          
          inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
          
          inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: typings.ffmpegJs.ffmpegMod.ffmpeg.Worker](x: Self) {
        
        inline def setOnmessage(value: OnMessageOptions => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
        
        inline def setPostMessage(value: PostMessageOptions => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
        
        inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
      }
    }
  }
}
