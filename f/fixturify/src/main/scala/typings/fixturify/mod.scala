package typings.fixturify

import org.scalablytyped.runtime.StringDictionary
import typings.minimatch.mod.IMinimatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixturify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readSync(dir: String): DirJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any]).asInstanceOf[DirJSON]
  inline def readSync(dir: String, options: Unit, relativeRoot: String): DirJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], relativeRoot.asInstanceOf[js.Any])).asInstanceOf[DirJSON]
  inline def readSync(dir: String, options: Options): DirJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DirJSON]
  inline def readSync(dir: String, options: Options, relativeRoot: String): DirJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], relativeRoot.asInstanceOf[js.Any])).asInstanceOf[DirJSON]
  
  inline def writeSync(dir: String, obj: DirJSON): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(dir.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    A recursive JSON representation of a directory. This representation includes
    both files, their contents and directories which can contain both files and
    directories.
    
    ```ts
    const files : DirJSON = {
    'index.js': 'content',
    'foo.txt': 'content',
    'folder': {
    'index.js': 'content',
    'apple.js': 'content',
    'other-folder': { }
    },
    }
    ```
    */
  trait DirJSON
    extends StObject
       with /* filename */ StringDictionary[DirJSON | String | Null]
  object DirJSON {
    
    inline def apply(): DirJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirJSON]
    }
  }
  
  trait Options extends StObject {
    
    var exclude: js.UndefOr[js.Array[IMinimatch | String]] = js.undefined
    
    var ignoreEmptyDirs: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[js.Array[IMinimatch | String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: js.Array[IMinimatch | String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (IMinimatch | String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setIgnoreEmptyDirs(value: Boolean): Self = StObject.set(x, "ignoreEmptyDirs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptyDirsUndefined: Self = StObject.set(x, "ignoreEmptyDirs", js.undefined)
      
      inline def setInclude(value: js.Array[IMinimatch | String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (IMinimatch | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
