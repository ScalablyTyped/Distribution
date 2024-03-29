package typings.fixturify

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixturify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readSync(dir: String): DirJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any]).asInstanceOf[DirJSON]
  inline def readSync(dir: String, options: Unit, _relativeRoot: String): DirJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], _relativeRoot.asInstanceOf[js.Any])).asInstanceOf[DirJSON]
  inline def readSync(dir: String, options: Options): DirJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DirJSON]
  inline def readSync(dir: String, options: Options, _relativeRoot: String): DirJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], _relativeRoot.asInstanceOf[js.Any])).asInstanceOf[DirJSON]
  
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
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DirJSON = {[filename: string] : fixturify.fixturify.DirJSON | string | null}
  }}}
  to avoid circular code involving: 
  - fixturify.fixturify.DirJSON
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
    
    var directories: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any) | String
        ]
      ] = js.undefined
    
    var globs: js.UndefOr[
        js.Array[
          String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any)
        ]
      ] = js.undefined
    
    var ignore: js.UndefOr[
        js.Array[
          String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any)
        ]
      ] = js.undefined
    
    var ignoreEmptyDirs: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[
        js.Array[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any) | String
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDirectories(value: Boolean): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setExclude(
        value: js.Array[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any) | String
            ]
      ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any) | String)*
      ): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setGlobs(
        value: js.Array[
              String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any)
            ]
      ): Self = StObject.set(x, "globs", value.asInstanceOf[js.Any])
      
      inline def setGlobsUndefined: Self = StObject.set(x, "globs", js.undefined)
      
      inline def setGlobsVarargs(
        value: (String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any))*
      ): Self = StObject.set(x, "globs", js.Array(value*))
      
      inline def setIgnore(
        value: js.Array[
              String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any)
            ]
      ): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptyDirs(value: Boolean): Self = StObject.set(x, "ignoreEmptyDirs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptyDirsUndefined: Self = StObject.set(x, "ignoreEmptyDirs", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(
        value: (String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any))*
      ): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInclude(
        value: js.Array[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any) | String
            ]
      ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(
        value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMinimatch */ Any) | String)*
      ): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
}
