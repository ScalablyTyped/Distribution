package typings.fastGlob.readerMod

import typings.fastGlob.entriesMod.Entry
import typings.fastGlob.entriesMod.EntryItem
import typings.fastGlob.optionsMod.IOptions
import typings.fastGlob.tasksMod.ITask
import typings.micromatch.mod.Options
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader[T] extends js.Object {
  val deepFilter: typings.fastGlob.deepMod.default
  val entryFilter: typings.fastGlob.entryMod.default
  val micromatchOptions: js.Any
  val options: IOptions[EntryItem]
  /**
    * Returns options for micromatch.
    */
  def getMicromatchOptions(): Options
  /**
    * Returns options for reader.
    */
  def getReaderOptions(task: ITask): typings.mrmlncReaddirEnhanced.mod.Options
  /**
    * Returns root path to scanner.
    */
  def getRootDirectory(task: ITask): String
  /**
    * Returns true if error has ENOENT code.
    */
  def isEnoentCodeError(err: ErrnoException): Boolean
  /**
    * The main logic of reading the directories that must be implemented by each providers.
    */
  def read(_task: ITask): T
  /**
    * Returns transformed entry.
    */
  def transform(entry: Entry): EntryItem
}

object Reader {
  @scala.inline
  def apply[T](
    deepFilter: typings.fastGlob.deepMod.default,
    entryFilter: typings.fastGlob.entryMod.default,
    getMicromatchOptions: () => Options,
    getReaderOptions: ITask => typings.mrmlncReaddirEnhanced.mod.Options,
    getRootDirectory: ITask => String,
    isEnoentCodeError: ErrnoException => Boolean,
    micromatchOptions: js.Any,
    options: IOptions[EntryItem],
    read: ITask => T,
    transform: Entry => EntryItem
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], getMicromatchOptions = js.Any.fromFunction0(getMicromatchOptions), getReaderOptions = js.Any.fromFunction1(getReaderOptions), getRootDirectory = js.Any.fromFunction1(getRootDirectory), isEnoentCodeError = js.Any.fromFunction1(isEnoentCodeError), micromatchOptions = micromatchOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), transform = js.Any.fromFunction1(transform))
  
    __obj.asInstanceOf[Reader[T]]
  }
}

