package typings.fastGlob

import typings.fastGlob.anon.FnCall
import typings.fastGlob.anon.Typeofstat
import typings.node.streamMod.Readable
import typings.nodelibFsWalk.settingsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersStreamMod {
  
  @JSImport("fast-glob/out/readers/stream", JSImport.Default)
  @js.native
  open class default () extends ReaderStream
  
  @js.native
  trait ReaderStream
    extends typings.fastGlob.readerMod.default[Readable] {
    
    /* private */ var _getEntry: Any = js.native
    
    /* private */ var _getStat: Any = js.native
    
    /* protected */ var _stat: Typeofstat = js.native
    
    /* protected */ def _walkStream(directory: String): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: Options): Readable = js.native
    /* protected */ def _walkStream(directory: String, optionsOrSettings: typings.nodelibFsWalk.settingsMod.default): Readable = js.native
    /* protected */ @JSName("_walkStream")
    var _walkStream_Original: FnCall = js.native
  }
}
