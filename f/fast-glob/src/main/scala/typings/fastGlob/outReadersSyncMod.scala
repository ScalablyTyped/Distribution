package typings.fastGlob

import typings.fastGlob.anon.FnCallDirectoryOptionsOrSettings
import typings.fastGlob.anon.FnCallPathOptionsOrSettings
import typings.fastGlob.outTypesMod.Entry
import typings.nodelibFsStat.outSettingsMod.Options
import typings.nodelibFsStat.outTypesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersSyncMod {
  
  @JSImport("fast-glob/out/readers/sync", JSImport.Default)
  @js.native
  open class default () extends ReaderSync
  
  @js.native
  trait ReaderSync
    extends typings.fastGlob.outReadersReaderMod.default[js.Array[Entry]] {
    
    /* private */ var _getEntry: Any = js.native
    
    /* private */ var _getStat: Any = js.native
    
    /* protected */ def _statSync(path: String): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: Options): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: typings.nodelibFsStat.outSettingsMod.default): Stats = js.native
    /* protected */ @JSName("_statSync")
    var _statSync_Original: FnCallPathOptionsOrSettings = js.native
    
    /* protected */ def _walkSync(directory: String): js.Array[typings.nodelibFsWalk.outTypesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typings.nodelibFsWalk.outSettingsMod.Options): js.Array[typings.nodelibFsWalk.outTypesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typings.nodelibFsWalk.outSettingsMod.default): js.Array[typings.nodelibFsWalk.outTypesMod.Entry] = js.native
    /* protected */ @JSName("_walkSync")
    var _walkSync_Original: FnCallDirectoryOptionsOrSettings = js.native
  }
}
