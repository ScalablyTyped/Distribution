package typings.dirCompare

import typings.dirCompare.buildSrcEntryEntryTypeMod.OptionalEntry
import typings.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typings.dirCompare.buildSrcSymlinkLoopDetectorMod.SymlinkCache
import typings.dirCompare.buildSrcTypesMod.Difference
import typings.dirCompare.buildSrcTypesMod.InitialStatistics
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompareAsyncMod {
  
  @JSImport("dir-compare/build/src/compareAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareAsync(
    rootEntry1: OptionalEntry,
    rootEntry2: OptionalEntry,
    level: Double,
    relativePath: String,
    options: ExtOptions,
    statistics: InitialStatistics,
    asyncDiffSet: AsyncDiffSet,
    symlinkCache: SymlinkCache
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsync")(rootEntry1.asInstanceOf[js.Any], rootEntry2.asInstanceOf[js.Any], level.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any], asyncDiffSet.asInstanceOf[js.Any], symlinkCache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type AsyncDiffSet = std.Array<dir-compare.dir-compare/build/src/types.Difference | dir-compare.dir-compare/build/src/compareAsync.AsyncDiffSet>
  }}}
  to avoid circular code involving: 
  - dir-compare.dir-compare/build/src/compareAsync.AsyncDiffSet
  */
  @js.native
  trait AsyncDiffSet
    extends StObject
       with Array[Difference | AsyncDiffSet]
}
