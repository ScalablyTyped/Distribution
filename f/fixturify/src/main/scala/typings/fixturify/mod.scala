package typings.fixturify

import org.scalablytyped.runtime.StringDictionary
import typings.minimatch.mod.IMinimatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixturify", "readSync")
  @js.native
  def readSync(dir: String): DirJSON = js.native
  @JSImport("fixturify", "readSync")
  @js.native
  def readSync(dir: String, options: js.UndefOr[scala.Nothing], relativeRoot: String): DirJSON = js.native
  @JSImport("fixturify", "readSync")
  @js.native
  def readSync(dir: String, options: Options): DirJSON = js.native
  @JSImport("fixturify", "readSync")
  @js.native
  def readSync(dir: String, options: Options, relativeRoot: String): DirJSON = js.native
  
  @JSImport("fixturify", "writeSync")
  @js.native
  def writeSync(dir: String, obj: DirJSON): Unit = js.native
  
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
  @js.native
  trait DirJSON extends /* filename */ StringDictionary[DirJSON | String | Null]
  object DirJSON {
    
    @scala.inline
    def apply(): DirJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirJSON]
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var exclude: js.UndefOr[js.Array[IMinimatch | String]] = js.native
    
    var ignoreEmptyDirs: js.UndefOr[Boolean] = js.native
    
    var include: js.UndefOr[js.Array[IMinimatch | String]] = js.native
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
      def setExclude(value: js.Array[IMinimatch | String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (IMinimatch | String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreEmptyDirs(value: Boolean): Self = StObject.set(x, "ignoreEmptyDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEmptyDirsUndefined: Self = StObject.set(x, "ignoreEmptyDirs", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[IMinimatch | String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (IMinimatch | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
