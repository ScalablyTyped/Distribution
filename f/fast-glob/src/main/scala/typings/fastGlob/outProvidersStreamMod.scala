package typings.fastGlob

import typings.fastGlob.outManagersTasksMod.Task
import typings.fastGlob.outTypesMod.ReaderOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersStreamMod {
  
  @JSImport("fast-glob/out/providers/stream", JSImport.Default)
  @js.native
  open class default () extends ProviderStream
  
  @js.native
  trait ProviderStream
    extends typings.fastGlob.outProvidersProviderMod.default[Readable] {
    
    /* protected */ var _reader: typings.fastGlob.outReadersStreamMod.default = js.native
    
    def api(root: String, task: Task, options: ReaderOptions): Readable = js.native
  }
}
