package typings.dndMultiBackend

import typings.dndMultiBackend.distTypesMod.MultiBackendSwitcher
import typings.dndMultiBackend.distTypesMod.PreviewList
import typings.dndMultiBackend.distTypesMod.PreviewListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewListImplMod {
  
  @JSImport("dnd-multi-backend/dist/PreviewListImpl", "PreviewListImpl")
  @js.native
  open class PreviewListImpl ()
    extends StObject
       with PreviewList {
    
    /* CompleteClass */
    override def backendChanged(backend: MultiBackendSwitcher): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def register(listener: PreviewListener): Unit = js.native
    
    /* CompleteClass */
    override def unregister(listener: PreviewListener): Unit = js.native
  }
}
