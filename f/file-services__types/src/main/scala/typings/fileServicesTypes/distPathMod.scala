package typings.fileServicesTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPathMod {
  
  @js.native
  trait IFileSystemPath extends StObject {
    
    /**
      * Return the last portion of a path. Similar to the Unix basename command.
      * Often used to extract the file name from a fully qualified path.
      *
      * @param p the path to evaluate.
      * @param ext optionally, an extension to remove from the result.
      */
    def basename(p: String): String = js.native
    def basename(p: String, ext: String): String = js.native
    
    /**
      * The platform-specific file delimiter. ';' or ':'.
      */
    val delimiter: String = js.native
    
    /**
      * Return the directory name of a path. Similar to the Unix dirname command.
      *
      * @param p the path to evaluate.
      */
    def dirname(p: String): String = js.native
    
    /**
      * Return the extension of the path, from the last '.' to end of string in the last portion of the path.
      * If there is no '.' in the last portion of the path or the first character of it is '.', then it returns an empty string
      *
      * @param p the path to evaluate.
      */
    def extname(p: String): String = js.native
    
    /**
      * Returns a path string from an object - the opposite of parse().
      */
    def format(pP: IFormatInputPathObject): String = js.native
    
    /**
      * Determines whether {path} is an absolute path. An absolute path will always resolve to the same location, regardless of the working directory.
      *
      * @param path path to test.
      */
    def isAbsolute(p: String): Boolean = js.native
    
    /**
      * Join all arguments together and normalize the resulting path.
      * Arguments must be strings. In v0.8, non-string arguments were silently ignored. In v0.10 and up, an exception is thrown.
      *
      * @param paths paths to join.
      */
    def join(paths: String*): String = js.native
    
    /**
      * Normalize a string path, reducing '..' and '.' parts.
      * When multiple slashes are found, they're replaced by a single one; when the path contains a trailing slash, it is preserved. On Windows backslashes are used.
      *
      * @param p string path to normalize.
      */
    def normalize(p: String): String = js.native
    
    /**
      * Returns an object from a path string - the opposite of format().
      *
      * @param pathString path to evaluate.
      */
    def parse(p: String): IParsedPath = js.native
    
    /**
      * Posix specific pathing.
      * Same as parent object on posix.
      */
    val posix: IFileSystemPath = js.native
    
    /**
      * Solve the relative path from {from} to {to}.
      * At times we have two absolute paths, and we need to derive the relative path from one to the other. This is actually the reverse transform of path.resolve.
      */
    def relative(from: String, to: String): String = js.native
    
    /**
      * The right-most parameter is considered {to}.  Other parameters are considered an array of {from}.
      *
      * Starting from leftmost {from} parameter, resolves {to} to an absolute path.
      *
      * If {to} isn't already absolute, {from} arguments are prepended in right to left order,
      * until an absolute path is found. If after using all {from} paths still no absolute path is found,
      * the current working directory is used as well. The resulting path is normalized,
      * and trailing slashes are removed unless the path gets resolved to the root directory.
      *
      * @param pathSegments string paths to join.  Non-string arguments are ignored.
      */
    def resolve(pathSegments: String*): String = js.native
    
    /**
      * The platform-specific file separator. '\\' or '/'.
      */
    val sep: String = js.native
    
    /**
      * Windows specific pathing.
      * Same as parent object on windows
      */
    val win32: IFileSystemPath = js.native
  }
  
  trait IFormatInputPathObject extends StObject {
    
    /**
      * The file name including extension (if any) such as 'index.html'
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * The full directory path such as '/home/user/dir' or 'c:\path\dir'
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * The file extension (if any) such as '.html'
      */
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * The file name without extension (if any) such as 'index'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The root of the path such as '/' or 'c:\'
      */
    var root: js.UndefOr[String] = js.undefined
  }
  object IFormatInputPathObject {
    
    inline def apply(): IFormatInputPathObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormatInputPathObject]
    }
    
    extension [Self <: IFormatInputPathObject](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait IParsedPath extends StObject {
    
    /**
      * The file name including extension (if any) such as 'index.html'
      */
    var base: String
    
    /**
      * The full directory path such as '/home/user/dir' or 'c:\path\dir'
      */
    var dir: String
    
    /**
      * The file extension (if any) such as '.html'
      */
    var ext: String
    
    /**
      * The file name without extension (if any) such as 'index'
      */
    var name: String
    
    /**
      * The root of the path such as '/' or 'c:\'
      */
    var root: String
  }
  object IParsedPath {
    
    inline def apply(base: String, dir: String, ext: String, name: String, root: String): IParsedPath = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedPath]
    }
    
    extension [Self <: IParsedPath](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
