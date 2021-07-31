package typings.extraWatchWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extra-watch-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  /* static member */
  object defaults {
    
    @JSImport("extra-watch-webpack-plugin", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("extra-watch-webpack-plugin", "defaults.cwd")
    @js.native
    def cwd: String = js.native
    @scala.inline
    def cwd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cwd")(x.asInstanceOf[js.Any])
    
    @JSImport("extra-watch-webpack-plugin", "defaults.dirs")
    @js.native
    def dirs: js.Array[String] = js.native
    @scala.inline
    def dirs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirs")(x.asInstanceOf[js.Any])
    
    @JSImport("extra-watch-webpack-plugin", "defaults.files")
    @js.native
    def files: js.Array[String] = js.native
    @scala.inline
    def files_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("files")(x.asInstanceOf[js.Any])
  }
  
  type ExtraWatchWebpackPlugin = Plugin
  
  trait Options extends StObject {
    
    /**
      * attach extra dirs to webpack's watch system
      * @default []
      */
    var dirs: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * (absolute path or glob pattern), attach extra files to webpack's watch system
      * @default []
      */
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
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
      def setDirs(value: String | js.Array[String]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirsUndefined: Self = StObject.set(x, "dirs", js.undefined)
      
      @scala.inline
      def setDirsVarargs(value: String*): Self = StObject.set(x, "dirs", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
}
