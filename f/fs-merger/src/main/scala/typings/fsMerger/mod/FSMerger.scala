package typings.fsMerger.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.fsMerger.AnonEncoding
import typings.fsMerger.AnonEncodingFalse
import typings.fsMerger.FnBuffer
import typings.fsMerger.FnOptions
import typings.fsMerger.FnOptionsPath
import typings.fsMerger.Typeofreaddir
import typings.fsMerger.fsMergerStrings.buffer
import typings.node.AnonBufferEncodingFalse
import typings.node.AnonEncodingFalseWithFileTypes
import typings.node.AnonEncodingFlag
import typings.node.AnonEncodingFlagNull
import typings.node.AnonEncodingFlagString
import typings.node.AnonEncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.walkSync.mod.WalkSyncEntry
import typings.walkSync.mod.WalkSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSMerger extends js.Object {
  var MAP: StringDictionary[FSMergerObject] | Null = js.native
  var PREFIXINDEXMAP: NumberDictionary[FSMergerObject] = js.native
  var _atList: js.Array[FSMerger] = js.native
  var _dirList: js.Array[Node] = js.native
  @JSName("entries")
  var entries_Original: FnOptionsPath = js.native
  var fs: FS = js.native
  @JSName("readFileSync")
  var readFileSync_Original: FnOptions = js.native
  var readdir: Typeofreaddir = js.native
  @JSName("readdirSync")
  var readdirSync_Original: FnBuffer = js.native
  def _generateMap(): Unit = js.native
  def at(index: Double): FSMerger = js.native
  def entries(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ _
  ] = js.native
  def entries(
    dirPath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ _
  ] = js.native
  def entries(path: String): js.Array[WalkSyncEntry] = js.native
  def entries(path: String, options: WalkSyncOptions): js.Array[WalkSyncEntry] = js.native
  def readFileMeta(filePath: String): js.UndefOr[FileMeta] = js.native
  def readFileMeta(filePath: String, options: FileMetaOption): FileMeta = js.native
  @JSName("readFileMeta")
  def readFileMeta_Union(filePath: String, options: FileMetaOption): js.UndefOr[FileMeta] = js.native
  def readFileSync(filePath: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: AnonEncoding): js.UndefOr[FileContent] = js.native
  def readFileSync(path: Double): String | Buffer = js.native
  def readFileSync(path: Double, options: String): String = js.native
  def readFileSync(path: Double, options: AnonEncodingFlag): Buffer = js.native
  def readFileSync(path: Double, options: AnonEncodingFlagNull): String | Buffer = js.native
  def readFileSync(path: Double, options: AnonEncodingFlagString): String = js.native
  def readFileSync(path: PathLike): String | Buffer = js.native
  def readFileSync(path: PathLike, options: String): String = js.native
  def readFileSync(path: PathLike, options: AnonEncodingFlag): Buffer = js.native
  def readFileSync(path: PathLike, options: AnonEncodingFlagNull): String | Buffer = js.native
  def readFileSync(path: PathLike, options: AnonEncodingFlagString): String = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: Double): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: PathLike): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double, options: String): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike, options: String): String | Buffer = js.native
  def readdir(
    dirPath: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: AnonEncodingFalse,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdirSync(dirPath: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: AnonEncodingFalse): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: AnonBufferEncodingFalse): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: typings.node.AnonEncodingFalse): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: AnonEncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: AnonEncodingTrue): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

