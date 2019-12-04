package typings.fastDashGlob.outProvidersReaderMod

import typings.fastDashGlob.outManagersOptionsMod.IOptions
import typings.fastDashGlob.outManagersTasksMod.ITask
import typings.fastDashGlob.outTypesEntriesMod.Entry
import typings.fastDashGlob.outTypesEntriesMod.EntryItem
import typings.micromatch.micromatchMod.Options
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader", JSImport.Default)
@js.native
abstract class default[T] protected () extends Reader[T] {
  def this(options: IOptions[EntryItem]) = this()
  /* CompleteClass */
  override val deepFilter: typings.fastDashGlob.outProvidersFiltersDeepMod.default = js.native
  /* CompleteClass */
  override val entryFilter: typings.fastDashGlob.outProvidersFiltersEntryMod.default = js.native
  /* CompleteClass */
  override val micromatchOptions: js.Any = js.native
  /* CompleteClass */
  override val options: IOptions[EntryItem] = js.native
  /**
    * Returns options for micromatch.
    */
  /* CompleteClass */
  override def getMicromatchOptions(): Options = js.native
  /**
    * Returns options for reader.
    */
  /* CompleteClass */
  override def getReaderOptions(task: ITask): typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.Options = js.native
  /**
    * Returns root path to scanner.
    */
  /* CompleteClass */
  override def getRootDirectory(task: ITask): String = js.native
  /**
    * Returns true if error has ENOENT code.
    */
  /* CompleteClass */
  override def isEnoentCodeError(err: ErrnoException): Boolean = js.native
  /**
    * The main logic of reading the directories that must be implemented by each providers.
    */
  /* CompleteClass */
  override def read(_task: ITask): T = js.native
  /**
    * Returns transformed entry.
    */
  /* CompleteClass */
  override def transform(entry: Entry): EntryItem = js.native
}

