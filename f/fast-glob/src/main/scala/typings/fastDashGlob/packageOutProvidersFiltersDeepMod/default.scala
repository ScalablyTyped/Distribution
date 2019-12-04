package typings.fastDashGlob.packageOutProvidersFiltersDeepMod

import typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod.FilterFunction
import typings.fastDashGlob.packageOutManagersOptionsMod.IOptions
import typings.fastDashGlob.packageOutTypesEntriesMod.EntryItem
import typings.fastDashGlob.packageOutTypesPatternsMod.Pattern
import typings.micromatch.micromatchMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/filters/deep", JSImport.Default)
@js.native
class default protected () extends DeepFilter {
  def this(options: IOptions[EntryItem], micromatchOptions: Options) = this()
  /**
    * Returns «true» for directory that should be read.
    */
  /* CompleteClass */
  override var filter: js.Any = js.native
  /**
    * Returns max depth of the provided patterns.
    */
  /* CompleteClass */
  override var getMaxPatternDepth: js.Any = js.native
  /**
    * Returns RegExp's for patterns that can affect the depth of reading.
    */
  /* CompleteClass */
  override var getNegativePatternsRe: js.Any = js.native
  /**
    * Returns «true» when the «deep» option is disabled or number and depth of the entry is greater that the option value.
    */
  /* CompleteClass */
  override var isSkippedByDeepOption: js.Any = js.native
  /**
    * Returns «true» when depth parameter is not an Infinity and entry depth greater that the parameter value.
    */
  /* CompleteClass */
  override var isSkippedByMaxPatternDepth: js.Any = js.native
  /**
    * Returns «true» for a directory whose path math to any negative pattern.
    */
  /* CompleteClass */
  override var isSkippedByNegativePatterns: js.Any = js.native
  /**
    * Returns «true» for a directory whose name starts with a period if «dot» option is disabled.
    */
  /* CompleteClass */
  override var isSkippedDotDirectory: js.Any = js.native
  /**
    * Returns «true» for symlinked directory if the «followSymlinkedDirectories» option is disabled.
    */
  /* CompleteClass */
  override var isSkippedSymlinkedDirectory: js.Any = js.native
  /* CompleteClass */
  override val micromatchOptions: js.Any = js.native
  /* CompleteClass */
  override val options: js.Any = js.native
  /**
    * Returns filter for directories.
    */
  /* CompleteClass */
  override def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): FilterFunction = js.native
}

