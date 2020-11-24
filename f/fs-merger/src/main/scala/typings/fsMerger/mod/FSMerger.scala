package typings.fsMerger.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.fsMerger.anon.At
import typings.fsMerger.anon.Encoding
import typings.fsMerger.anon.WithFileTypes
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.walkSync.mod.Entry
import typings.walkSync.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSMerger extends js.Object {
  
  var LIST: js.Array[FSMergerObject] = js.native
  
  var MAP: StringDictionary[FSMergerObject] | Null = js.native
  
  var PREFIXINDEXMAP: NumberDictionary[FSMergerObject] = js.native
  
  var _atList: js.Array[FSMerger] = js.native
  
  var _dirList: js.Array[Node] = js.native
  
  def _generateMap(): Unit = js.native
  
  def at(index: Double): FSMerger = js.native
  
  def entries(): js.Array[Entry] = js.native
  def entries(dirPath: js.UndefOr[scala.Nothing], options: Options): js.Array[Entry] = js.native
  def entries(dirPath: String): js.Array[Entry] = js.native
  def entries(dirPath: String, options: Options): js.Array[Entry] = js.native
  
  var fs: FS = js.native
  
  def readFileMeta(filePath: String): js.UndefOr[FileMeta] = js.native
  def readFileMeta(filePath: String, options: FileMetaOption): js.UndefOr[FileMeta] = js.native
  
  def readFileSync(filePath: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: Encoding): js.UndefOr[FileContent] = js.native
  
  def readdir(
    dirPath: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.UndefOr[js.Array[Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.UndefOr[js.Array[Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: Null,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.UndefOr[js.Array[Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: WithFileTypes,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.UndefOr[js.Array[Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  
  def readdirSync(dirPath: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: WithFileTypes): js.Array[Buffer | String] = js.native
  
  /**
    * Given an absolute path, returns a relative path suitable for using with the
    * other methods in this FSMerger. Does not emit paths starting with `../`;
    * paths outside this merged FS are instead returned as `null`.
    *
    * Note: If this FSMerger has a path that is inside another path, the first
    * one that contains the path will be used.
    *
    * Note 2: This method does not check whether the absolute path exists.
    *
    * @param absolutePath An absolute path to make relative.
    * @returns null if the path is not within any filesystem tree.
    */
  def relativePathTo(absolutePath: String): At | Null = js.native
}
