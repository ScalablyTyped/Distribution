package typings.fastGlob

import typings.fastGlob.anon.Typeofwalk
import typings.fastGlob.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersAsyncMod {
  
  @JSImport("fast-glob/out/readers/async", JSImport.Default)
  @js.native
  open class default () extends ReaderAsync
  
  @js.native
  trait ReaderAsync
    extends typings.fastGlob.readerMod.default[js.Promise[js.Array[Entry]]] {
    
    /* protected */ var _readerStream: typings.fastGlob.readersStreamMod.default = js.native
    
    /* protected */ var _walkAsync: Typeofwalk = js.native
  }
}
