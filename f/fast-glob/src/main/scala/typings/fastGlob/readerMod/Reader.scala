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

@js.native
trait Reader[T] extends js.Object {
  val _fsStatSettings: Settings = js.native
  val _settings: typings.fastGlob.settingsMod.default = js.native
  /* protected */ def _getFullEntryPath(filepath: String): String = js.native
  /* protected */ def _isFatalError(error: ErrnoException): Boolean = js.native
  /* protected */ def _makeEntry(stats: Stats, pattern: Pattern): Entry = js.native
  def dynamic(root: String, options: ReaderOptions): T = js.native
  def static(patterns: js.Array[Pattern], options: ReaderOptions): T = js.native
}

object Reader {
  @scala.inline
  def apply[T](
    _fsStatSettings: Settings,
    _getFullEntryPath: String => String,
    _isFatalError: ErrnoException => Boolean,
    _makeEntry: (Stats, Pattern) => Entry,
    _settings: typings.fastGlob.settingsMod.default,
    dynamic: (String, ReaderOptions) => T,
    static: (js.Array[Pattern], ReaderOptions) => T
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(_fsStatSettings = _fsStatSettings.asInstanceOf[js.Any], _getFullEntryPath = js.Any.fromFunction1(_getFullEntryPath), _isFatalError = js.Any.fromFunction1(_isFatalError), _makeEntry = js.Any.fromFunction2(_makeEntry), _settings = _settings.asInstanceOf[js.Any], dynamic = js.Any.fromFunction2(dynamic), static = js.Any.fromFunction2(static))
    __obj.asInstanceOf[Reader[T]]
  }
  @scala.inline
  implicit class ReaderOps[Self <: Reader[_], T] (val x: Self with Reader[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_fsStatSettings(value: Settings): Self = this.set("_fsStatSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def set_getFullEntryPath(value: String => String): Self = this.set("_getFullEntryPath", js.Any.fromFunction1(value))
    @scala.inline
    def set_isFatalError(value: ErrnoException => Boolean): Self = this.set("_isFatalError", js.Any.fromFunction1(value))
    @scala.inline
    def set_makeEntry(value: (Stats, Pattern) => Entry): Self = this.set("_makeEntry", js.Any.fromFunction2(value))
    @scala.inline
    def set_settings(value: typings.fastGlob.settingsMod.default): Self = this.set("_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamic(value: (String, ReaderOptions) => T): Self = this.set("dynamic", js.Any.fromFunction2(value))
    @scala.inline
    def setStatic(value: (js.Array[Pattern], ReaderOptions) => T): Self = this.set("static", js.Any.fromFunction2(value))
  }
  
}

