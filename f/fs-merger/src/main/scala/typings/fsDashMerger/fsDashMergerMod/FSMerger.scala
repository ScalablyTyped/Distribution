package typings.fsDashMerger.fsDashMergerMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.fsDashMerger.Anon_Encoding
import typings.fsDashMerger.Anon_EncodingFalse
import typings.fsDashMerger.Fn_Buffer
import typings.fsDashMerger.Fn_Options
import typings.fsDashMerger.Fn_OptionsPath
import typings.fsDashMerger.Typeofreaddir
import typings.fsDashMerger.fsDashMergerStrings.buffer
import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Anon_EncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.walkDashSync.walkDashSyncMod.WalkSyncEntry
import typings.walkDashSync.walkDashSyncMod.WalkSyncOptions
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
  var entries_Original: Fn_OptionsPath = js.native
  var fs: FS = js.native
  @JSName("readFileSync")
  var readFileSync_Original: Fn_Options = js.native
  var readdir: Typeofreaddir = js.native
  @JSName("readdirSync")
  var readdirSync_Original: Fn_Buffer = js.native
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
  def readFileMeta(filePath: String, options: FileMetaOption): js.UndefOr[FileMeta] = js.native
  @JSName("readFileMeta")
  def readFileMeta_FileMeta(filePath: String, options: FileMetaOption): FileMeta = js.native
  def readFileSync(filePath: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: Anon_Encoding): js.UndefOr[FileContent] = js.native
  def readFileSync(path: Double): Buffer = js.native
  def readFileSync(path: Double, options: String): String | Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlag): Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlagString): String = js.native
  def readFileSync(path: PathLike): Buffer = js.native
  def readFileSync(path: PathLike, options: String): String | Buffer = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingFlagString): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: Double, options: String): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: PathLike, options: String): String = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike): String | Buffer = js.native
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
    options: Anon_EncodingFalse,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdirSync(dirPath: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: Anon_EncodingFalse): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: typings.node.Anon_EncodingFalse): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

