package typings.forgeViewer.global.Autodesk

import typings.forgeViewer.Autodesk.Viewing.GuiViewer3D
import typings.forgeViewer.anon.AutoDetectAecModelData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AEC {
  
  @JSGlobal("Autodesk.AEC.FloorSelector")
  @js.native
  open class FloorSelector protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.AEC.FloorSelector {
    def this(viewer: GuiViewer3D) = this()
  }
  
  @JSGlobal("Autodesk.AEC.LevelsExtension")
  @js.native
  open class LevelsExtension protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.AEC.LevelsExtension {
    def this(viewer: GuiViewer3D) = this()
    def this(viewer: GuiViewer3D, options: AutoDetectAecModelData) = this()
  }
  object LevelsExtension {
    
    @JSGlobal("Autodesk.AEC.LevelsExtension")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Autodesk.AEC.LevelsExtension.LEVEL_CHANGED")
    @js.native
    def LEVEL_CHANGED: String = js.native
    inline def LEVEL_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_CHANGED")(x.asInstanceOf[js.Any])
  }
}
