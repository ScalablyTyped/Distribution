package typings.fastGlob

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.EntryItem
import typings.fastGlob.typesMod.ReaderOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("fast-glob/out/providers/async", JSImport.Default)
  @js.native
  class default () extends ProviderAsync
  
  @js.native
  trait ProviderAsync
    extends typings.fastGlob.providerMod.default[js.Promise[js.Array[EntryItem]]] {
    
    var _reader: typings.fastGlob.readersStreamMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
}
