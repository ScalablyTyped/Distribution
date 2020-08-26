package typings.fastGlob.providerMod

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider[T] extends js.Object {
  val _settings: typings.fastGlob.settingsMod.default = js.native
  val deepFilter: typings.fastGlob.deepMod.default = js.native
  val entryFilter: typings.fastGlob.entryMod.default = js.native
  val entryTransformer: typings.fastGlob.transformersEntryMod.default = js.native
  val errorFilter: typings.fastGlob.errorMod.default = js.native
  /* protected */ def _getMicromatchOptions(): MicromatchOptions = js.native
  /* protected */ def _getReaderOptions(task: Task): ReaderOptions = js.native
  /* protected */ def _getRootDirectory(task: Task): String = js.native
  def read(_task: Task): T = js.native
}

object Provider {
  @scala.inline
  def apply[T](
    _getMicromatchOptions: () => MicromatchOptions,
    _getReaderOptions: Task => ReaderOptions,
    _getRootDirectory: Task => String,
    _settings: typings.fastGlob.settingsMod.default,
    deepFilter: typings.fastGlob.deepMod.default,
    entryFilter: typings.fastGlob.entryMod.default,
    entryTransformer: typings.fastGlob.transformersEntryMod.default,
    errorFilter: typings.fastGlob.errorMod.default,
    read: Task => T
  ): Provider[T] = {
    val __obj = js.Dynamic.literal(_getMicromatchOptions = js.Any.fromFunction0(_getMicromatchOptions), _getReaderOptions = js.Any.fromFunction1(_getReaderOptions), _getRootDirectory = js.Any.fromFunction1(_getRootDirectory), _settings = _settings.asInstanceOf[js.Any], deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], entryTransformer = entryTransformer.asInstanceOf[js.Any], errorFilter = errorFilter.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[Provider[T]]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider[_], T] (val x: Self with Provider[T]) extends AnyVal {
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
    def set_getMicromatchOptions(value: () => MicromatchOptions): Self = this.set("_getMicromatchOptions", js.Any.fromFunction0(value))
    @scala.inline
    def set_getReaderOptions(value: Task => ReaderOptions): Self = this.set("_getReaderOptions", js.Any.fromFunction1(value))
    @scala.inline
    def set_getRootDirectory(value: Task => String): Self = this.set("_getRootDirectory", js.Any.fromFunction1(value))
    @scala.inline
    def set_settings(value: typings.fastGlob.settingsMod.default): Self = this.set("_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeepFilter(value: typings.fastGlob.deepMod.default): Self = this.set("deepFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryFilter(value: typings.fastGlob.entryMod.default): Self = this.set("entryFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryTransformer(value: typings.fastGlob.transformersEntryMod.default): Self = this.set("entryTransformer", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorFilter(value: typings.fastGlob.errorMod.default): Self = this.set("errorFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Task => T): Self = this.set("read", js.Any.fromFunction1(value))
  }
  
}

