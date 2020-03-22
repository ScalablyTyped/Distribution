package typings.fastGlob.readerMod

import typings.fastGlob.typesMod.Entry
import typings.fastGlob.typesMod.ErrnoException
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.ReaderOptions
import typings.node.fsMod.Stats
import typings.nodelibFsStat.mod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/readers/reader", JSImport.Default)
@js.native
abstract class default[T] protected () extends Reader[T] {
  def this(_settings: typings.fastGlob.settingsMod.default) = this()
  /* CompleteClass */
  override val _fsStatSettings: Settings = js.native
  /* CompleteClass */
  override val _settings: typings.fastGlob.settingsMod.default = js.native
  /* CompleteClass */
  /* protected */ override def _getFullEntryPath(filepath: String): String = js.native
  /* CompleteClass */
  /* protected */ override def _isFatalError(error: ErrnoException): Boolean = js.native
  /* CompleteClass */
  /* protected */ override def _makeEntry(stats: Stats, pattern: Pattern): Entry = js.native
  /* CompleteClass */
  override def dynamic(root: String, options: ReaderOptions): T = js.native
  /* CompleteClass */
  override def static(patterns: js.Array[Pattern], options: ReaderOptions): T = js.native
}

