package typings.ffmpegJs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ffmpegMp4Mod {
  
  @JSImport("ffmpeg.js/ffmpeg-mp4", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Result = js.native
  
  @js.native
  trait Mount extends StObject {
    
    var mountpoint: String = js.native
    
    var opts: Opts = js.native
    
    var `type`: String = js.native
  }
  object Mount {
    
    @scala.inline
    def apply(mountpoint: String, opts: Opts, `type`: String): Mount = {
      val __obj = js.Dynamic.literal(mountpoint = mountpoint.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mount]
    }
    
    @scala.inline
    implicit class MountMutableBuilder[Self <: Mount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMountpoint(value: String): Self = StObject.set(x, "mountpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: Opts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var MEMFS: js.UndefOr[js.Array[Video]] = js.native
    
    var TOTAL_MEMORY: js.UndefOr[Double] = js.native
    
    var arguments: js.Array[String] = js.native
    
    var mounts: js.UndefOr[js.Array[Mount]] = js.native
    
    var onExit: js.UndefOr[js.Function1[/* code */ js.Any, Unit]] = js.native
    
    var print: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    var printErr: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    var stdin: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(arguments: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setMEMFS(value: js.Array[Video]): Self = StObject.set(x, "MEMFS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEMFSUndefined: Self = StObject.set(x, "MEMFS", js.undefined)
      
      @scala.inline
      def setMEMFSVarargs(value: Video*): Self = StObject.set(x, "MEMFS", js.Array(value :_*))
      
      @scala.inline
      def setMounts(value: js.Array[Mount]): Self = StObject.set(x, "mounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountsUndefined: Self = StObject.set(x, "mounts", js.undefined)
      
      @scala.inline
      def setMountsVarargs(value: Mount*): Self = StObject.set(x, "mounts", js.Array(value :_*))
      
      @scala.inline
      def setOnExit(value: /* code */ js.Any => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setPrint(value: /* data */ js.Any => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrintErr(value: /* data */ js.Any => Unit): Self = StObject.set(x, "printErr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrintErrUndefined: Self = StObject.set(x, "printErr", js.undefined)
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setStdin(value: /* data */ js.Any => Unit): Self = StObject.set(x, "stdin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setTOTAL_MEMORY(value: Double): Self = StObject.set(x, "TOTAL_MEMORY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOTAL_MEMORYUndefined: Self = StObject.set(x, "TOTAL_MEMORY", js.undefined)
    }
  }
  
  @js.native
  trait Opts extends StObject {
    
    var root: String = js.native
  }
  object Opts {
    
    @scala.inline
    def apply(root: String): Opts = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var MEMFS: js.Array[Video] = js.native
  }
  object Result {
    
    @scala.inline
    def apply(MEMFS: js.Array[Video]): Result = {
      val __obj = js.Dynamic.literal(MEMFS = MEMFS.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMEMFS(value: js.Array[Video]): Self = StObject.set(x, "MEMFS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEMFSVarargs(value: Video*): Self = StObject.set(x, "MEMFS", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Video extends StObject {
    
    var data: Uint8Array = js.native
    
    var name: String = js.native
  }
  object Video {
    
    @scala.inline
    def apply(data: Uint8Array, name: String): Video = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Video]
    }
    
    @scala.inline
    implicit class VideoMutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
