package typings.fastGlob

import typings.fastGlob.anon.FnCallDirectoryOptionsOrSettings
import typings.fastGlob.anon.FnCallPathOptionsOrSettings
import typings.fastGlob.typesMod.Entry
import typings.nodelibFsStat.settingsMod.Options
import typings.nodelibFsStat.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersSyncMod {
  
  @JSImport("fast-glob/out/readers/sync", JSImport.Default)
  @js.native
  class default () extends ReaderSync
  
  @js.native
  trait ReaderSync
    extends typings.fastGlob.readerMod.default[js.Array[Entry]] {
    
    /* private */ var _getEntry: js.Any = js.native
    
    /* private */ var _getStat: js.Any = js.native
    
    /* protected */ def _statSync(path: String): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: Options): Stats = js.native
    /* protected */ def _statSync(path: String, optionsOrSettings: typings.nodelibFsStat.settingsMod.default): Stats = js.native
    /* protected */ @JSName("_statSync")
    var _statSync_Original: FnCallPathOptionsOrSettings = js.native
    
    /* protected */ def _walkSync(directory: String): js.Array[typings.nodelibFsWalk.typesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typings.nodelibFsWalk.settingsMod.Options): js.Array[typings.nodelibFsWalk.typesMod.Entry] = js.native
    /* protected */ def _walkSync(directory: String, optionsOrSettings: typings.nodelibFsWalk.settingsMod.default): js.Array[typings.nodelibFsWalk.typesMod.Entry] = js.native
    /* protected */ @JSName("_walkSync")
    var _walkSync_Original: FnCallDirectoryOptionsOrSettings = js.native
  }
}
