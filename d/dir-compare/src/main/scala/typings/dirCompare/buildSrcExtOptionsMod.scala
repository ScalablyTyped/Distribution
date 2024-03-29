package typings.dirCompare

import typings.dirCompare.buildSrcTypesMod.CompareFileAsync
import typings.dirCompare.buildSrcTypesMod.CompareFileSync
import typings.dirCompare.buildSrcTypesMod.CompareNameHandler
import typings.dirCompare.buildSrcTypesMod.DiffSet
import typings.dirCompare.buildSrcTypesMod.DifferenceState
import typings.dirCompare.buildSrcTypesMod.Entry
import typings.dirCompare.buildSrcTypesMod.InitialStatistics
import typings.dirCompare.buildSrcTypesMod.Options
import typings.dirCompare.buildSrcTypesMod.PermissionDeniedState
import typings.dirCompare.buildSrcTypesMod.Reason
import typings.dirCompare.buildSrcTypesMod.ResultBuilder
import typings.dirCompare.dirCompareInts.`-1`
import typings.dirCompare.dirCompareInts.`0`
import typings.dirCompare.dirCompareInts.`1`
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExtOptionsMod {
  
  trait ExtOptions
    extends StObject
       with Options {
    
    @JSName("compareFileAsync")
    def compareFileAsync_MExtOptions(path1: String, stat1: Stats, path2: String, stat2: Stats, options: Options): js.Promise[Boolean]
    @JSName("compareFileAsync")
    var compareFileAsync_Original: CompareFileAsync
    
    @JSName("compareFileSync")
    def compareFileSync_MExtOptions(path1: String, stat1: Stats, path2: String, stat2: Stats, options: Options): Boolean
    @JSName("compareFileSync")
    var compareFileSync_Original: CompareFileSync
    
    @JSName("compareNameHandler")
    def compareNameHandler_MExtOptions(name1: String, name2: String, options: Options): `0` | `1` | `-1`
    @JSName("compareNameHandler")
    var compareNameHandler_Original: CompareNameHandler
    
    @JSName("dateTolerance")
    var dateTolerance_ExtOptions: Double
    
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Unit,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Unit,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: Unit,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Unit,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    /**
      * @param entry1 Left entry.
      * @param entry2 Right entry.
      * @param state See [[DifferenceState]].
      * @param level Depth level relative to root dir.
      * @param relativePath Path relative to root dir.
      * @param statistics Statistics to be updated.
      * @param diffSet Status per each entry to be appended.
      * Do not append if [[Options.noDiffSet]] is false.
      * @param reason See [[Reason]]. Not available if entries are equal.
      */
    @JSName("resultBuilder")
    def resultBuilder_MExtOptions(
      entry1: Entry,
      entry2: Entry,
      state: DifferenceState,
      level: Double,
      relativePath: String,
      options: Options,
      statistics: InitialStatistics,
      diffSet: DiffSet,
      reason: Reason,
      permissionDeniedState: PermissionDeniedState
    ): Unit
    @JSName("resultBuilder")
    var resultBuilder_Original: ResultBuilder
  }
  object ExtOptions {
    
    inline def apply(
      compareFileAsync: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => js.Promise[Boolean],
      compareFileSync: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => Boolean,
      compareNameHandler: (/* name1 */ String, /* name2 */ String, /* options */ Options) => `0` | `1` | `-1`,
      dateTolerance: Double,
      resultBuilder: (/* entry1 */ js.UndefOr[Entry], /* entry2 */ js.UndefOr[Entry], /* state */ DifferenceState, /* level */ Double, /* relativePath */ String, /* options */ Options, /* statistics */ InitialStatistics, /* diffSet */ js.UndefOr[DiffSet], /* reason */ js.UndefOr[Reason], /* permissionDeniedState */ PermissionDeniedState) => Unit
    ): ExtOptions = {
      val __obj = js.Dynamic.literal(compareFileAsync = js.Any.fromFunction5(compareFileAsync), compareFileSync = js.Any.fromFunction5(compareFileSync), compareNameHandler = js.Any.fromFunction3(compareNameHandler), dateTolerance = dateTolerance.asInstanceOf[js.Any], resultBuilder = js.Any.fromFunction10(resultBuilder))
      __obj.asInstanceOf[ExtOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtOptions] (val x: Self) extends AnyVal {
      
      inline def setCompareFileAsync(
        value: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => js.Promise[Boolean]
      ): Self = StObject.set(x, "compareFileAsync", js.Any.fromFunction5(value))
      
      inline def setCompareFileSync(
        value: (/* path1 */ String, /* stat1 */ Stats, /* path2 */ String, /* stat2 */ Stats, /* options */ Options) => Boolean
      ): Self = StObject.set(x, "compareFileSync", js.Any.fromFunction5(value))
      
      inline def setCompareNameHandler(value: (/* name1 */ String, /* name2 */ String, /* options */ Options) => `0` | `1` | `-1`): Self = StObject.set(x, "compareNameHandler", js.Any.fromFunction3(value))
      
      inline def setDateTolerance(value: Double): Self = StObject.set(x, "dateTolerance", value.asInstanceOf[js.Any])
      
      inline def setResultBuilder(
        value: (/* entry1 */ js.UndefOr[Entry], /* entry2 */ js.UndefOr[Entry], /* state */ DifferenceState, /* level */ Double, /* relativePath */ String, /* options */ Options, /* statistics */ InitialStatistics, /* diffSet */ js.UndefOr[DiffSet], /* reason */ js.UndefOr[Reason], /* permissionDeniedState */ PermissionDeniedState) => Unit
      ): Self = StObject.set(x, "resultBuilder", js.Any.fromFunction10(value))
    }
  }
}
