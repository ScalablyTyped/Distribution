package typings.fastGlob.entryMod

import typings.fastGlob.entriesMod.EntryItem
import typings.fastGlob.optionsMod.IOptions
import typings.fastGlob.patternsMod.Pattern
import typings.micromatch.mod.Options
import typings.mrmlncReaddirEnhanced.mod.FilterFunction
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/filters/entry", JSImport.Default)
@js.native
class default protected () extends EntryFilter {
  def this(options: IOptions[EntryItem], micromatchOptions: Options) = this()
  /**
    * Create record in the cross reader index.
    */
  /* CompleteClass */
  override var createIndexRecord: js.Any = js.native
  /**
    * Returns true if entry must be added to result.
    */
  /* CompleteClass */
  override var filter: js.Any = js.native
  /* CompleteClass */
  override val index: Map[String, js.UndefOr[scala.Nothing]] = js.native
  /**
    * Return true if the entry already has in the cross reader index.
    */
  /* CompleteClass */
  override var isDuplicateEntry: js.Any = js.native
  /**
    * Return true when entry match to provided patterns.
    *
    * First, just trying to apply patterns to the path.
    * Second, trying to apply patterns to the path with final slash (need to micromatch to support «directory/ **» patterns).
    */
  /* CompleteClass */
  override var isMatchToPatterns: js.Any = js.native
  /**
    * Return true when `absolute` option is enabled and matched to the negative patterns.
    */
  /* CompleteClass */
  override var isSkippedByAbsoluteNegativePatterns: js.Any = js.native
  /* CompleteClass */
  override val micromatchOptions: js.Any = js.native
  /**
    * Returns true for non-directories if the «onlyDirectories» option is enabled.
    */
  /* CompleteClass */
  override var onlyDirectoryFilter: js.Any = js.native
  /**
    * Returns true for non-files if the «onlyFiles» option is enabled.
    */
  /* CompleteClass */
  override var onlyFileFilter: js.Any = js.native
  /* CompleteClass */
  override val options: js.Any = js.native
  /**
    * Returns filter for directories.
    */
  /* CompleteClass */
  override def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): FilterFunction = js.native
}

