package typings.fastGlob.providerMod

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/provider", JSImport.Default)
@js.native
abstract class default[T] protected () extends Provider[T] {
  def this(_settings: typings.fastGlob.settingsMod.default) = this()
  /* CompleteClass */
  override val _settings: typings.fastGlob.settingsMod.default = js.native
  /* CompleteClass */
  override val deepFilter: typings.fastGlob.deepMod.default = js.native
  /* CompleteClass */
  override val entryFilter: typings.fastGlob.entryMod.default = js.native
  /* CompleteClass */
  override val entryTransformer: typings.fastGlob.transformersEntryMod.default = js.native
  /* CompleteClass */
  override val errorFilter: typings.fastGlob.errorMod.default = js.native
  /* CompleteClass */
  /* protected */ override def _getMicromatchOptions(): MicromatchOptions = js.native
  /* CompleteClass */
  /* protected */ override def _getReaderOptions(task: Task): ReaderOptions = js.native
  /* CompleteClass */
  /* protected */ override def _getRootDirectory(task: Task): String = js.native
  /* CompleteClass */
  override def read(_task: Task): T = js.native
}

