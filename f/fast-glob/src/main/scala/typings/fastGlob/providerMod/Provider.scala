package typings.fastGlob.providerMod

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider[T] extends js.Object {
  val _settings: typings.fastGlob.settingsMod.default
  val deepFilter: typings.fastGlob.deepMod.default
  val entryFilter: typings.fastGlob.entryMod.default
  val entryTransformer: typings.fastGlob.transformersEntryMod.default
  val errorFilter: typings.fastGlob.errorMod.default
  /* protected */ def _getMicromatchOptions(): MicromatchOptions
  /* protected */ def _getReaderOptions(task: Task): ReaderOptions
  /* protected */ def _getRootDirectory(task: Task): String
  def read(_task: Task): T
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
}

