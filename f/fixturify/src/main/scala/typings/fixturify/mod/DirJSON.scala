package typings.fixturify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
