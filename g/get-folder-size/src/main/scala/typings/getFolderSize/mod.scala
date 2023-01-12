package typings.getFolderSize

import typings.getFolderSize.mod.getFolderSize.FolderSizeInfo
import typings.getFolderSize.mod.getFolderSize.Options
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * Returns an object containing the size of the folder and a list of errors encountered while traversing the folder.
      *
      * If any errors are returned, the returned folder size is likely smaller than the real folder size.
      *
      * @param itemPath         - Path of the folder.
      * @param [options]        - Options.
      * @param [options.ignore] - If a file's path matches this regex object, its size is not counted.
      * @param [options.fs]     - The filesystem that should be used. Uses node fs by default.
      *
      * @returns - An object containing the size of the folder in bytes and a list of encountered errors.
      *
      * @async
      */
    inline def apply(itemPath: PathLike): js.Promise[FolderSizeInfo] = ^.asInstanceOf[js.Dynamic].apply(itemPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FolderSizeInfo]]
    inline def apply(itemPath: PathLike, options: Options): js.Promise[FolderSizeInfo] = (^.asInstanceOf[js.Dynamic].apply(itemPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FolderSizeInfo]]
    
    @JSImport("get-folder-size", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * Returns the size of the folder. If any errors are encountered while traversing the folder, they are silently ignored.
      *
      * The returned folder size might be smaller than the real folder size. It is impossible to know for sure, since errors are ignored.
      *
      * @param itemPath         - Path of the folder.
      * @param [options]        - Options.
      * @param [options.ignore] - If a file's path matches this regex object, its size is not counted.
      * @param [options.fs]     - The filesystem that should be used. Uses node fs by default.
      *
      * @returns - The size of the folder in bytes.
      *
      * @async
      */
    inline def loose(path: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("loose")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def loose(path: String, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("loose")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    /**
      * Returns the size of the folder. If any errors are encountered while traversing the folder, this method will throw an error.
      *
      * Because errors will otherwise make this method fail, the returned folder size will always be accurate.
      *
      * @param itemPath         - Path of the folder.
      * @param [options]        - Options.
      * @param [options.ignore] - If a file's path matches this regex object, its size is not counted.
      * @param [options.fs]     - The filesystem that should be used. Uses node fs by default.
      *
      * @returns - The size of the folder in bytes.
      *
      * @async
      */
    inline def strict(path: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("strict")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def strict(path: String, options: Options): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("strict")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  }
  
  object getFolderSize {
    
    trait FSLike extends StObject {
      
      def lstat(path: PathLike, args: Any*): js.Promise[FStatsLike]
      
      def readdir(path: PathLike, args: Any*): js.Promise[js.Array[String]]
    }
    object FSLike {
      
      inline def apply(
        lstat: (PathLike, /* repeated */ Any) => js.Promise[FStatsLike],
        readdir: (PathLike, /* repeated */ Any) => js.Promise[js.Array[String]]
      ): FSLike = {
        val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2(lstat), readdir = js.Any.fromFunction2(readdir))
        __obj.asInstanceOf[FSLike]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FSLike] (val x: Self) extends AnyVal {
        
        inline def setLstat(value: (PathLike, /* repeated */ Any) => js.Promise[FStatsLike]): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
        
        inline def setReaddir(value: (PathLike, /* repeated */ Any) => js.Promise[js.Array[String]]): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      }
    }
    
    trait FStatsLike extends StObject {
      
      var ino: Double
      
      def isDirectory(): Boolean
      
      var size: Double
    }
    object FStatsLike {
      
      inline def apply(ino: Double, isDirectory: () => Boolean, size: Double): FStatsLike = {
        val __obj = js.Dynamic.literal(ino = ino.asInstanceOf[js.Any], isDirectory = js.Any.fromFunction0(isDirectory), size = size.asInstanceOf[js.Any])
        __obj.asInstanceOf[FStatsLike]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FStatsLike] (val x: Self) extends AnyVal {
        
        inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
        
        inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      }
    }
    
    trait FolderSizeInfo extends StObject {
      
      var errors: js.Array[js.Error] | Null
      
      var size: Double
    }
    object FolderSizeInfo {
      
      inline def apply(size: Double): FolderSizeInfo = {
        val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], errors = null)
        __obj.asInstanceOf[FolderSizeInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FolderSizeInfo] (val x: Self) extends AnyVal {
        
        inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsNull: Self = StObject.set(x, "errors", null)
        
        inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var fs: js.UndefOr[FSLike] = js.undefined
      
      var ignore: js.UndefOr[js.RegExp] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setFs(value: FSLike): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
        
        inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
        
        inline def setIgnore(value: js.RegExp): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
        
        inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      }
    }
  }
}
