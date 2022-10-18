package typings.dirCompare

import typings.dirCompare.buildSrcEntryEntryTypeMod.OptionalEntry
import typings.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typings.dirCompare.buildSrcSymlinkLoopDetectorMod.SymlinkCache
import typings.dirCompare.buildSrcTypesMod.InitialStatistics
import typings.dirCompare.buildSrcTypesMod.OptionalDiffSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompareSyncMod {
  
  @JSImport("dir-compare/build/src/compareSync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareSync(
    rootEntry1: OptionalEntry,
    rootEntry2: OptionalEntry,
    level: Double,
    relativePath: String,
    options: ExtOptions,
    statistics: InitialStatistics,
    diffSet: OptionalDiffSet,
    symlinkCache: SymlinkCache
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(rootEntry1.asInstanceOf[js.Any], rootEntry2.asInstanceOf[js.Any], level.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any], diffSet.asInstanceOf[js.Any], symlinkCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
