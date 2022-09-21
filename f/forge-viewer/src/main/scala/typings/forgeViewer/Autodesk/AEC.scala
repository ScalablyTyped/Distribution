package typings.forgeViewer.Autodesk

import typings.forgeViewer.Autodesk.Viewing.Extension
import typings.forgeViewer.Autodesk.Viewing.Model
import typings.forgeViewer.anon.ZMax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AEC {
  
  @js.native
  trait FloorSelector extends StObject {
    
    var currentFloor: Double = js.native
    
    def enterHoverMode(): Unit = js.native
    
    def exitHoverMode(force: Boolean): Unit = js.native
    
    var floorData: Any = js.native
    
    var floorFilterData: Any = js.native
    
    def floorSelectionValid(newFloor: Double): Boolean = js.native
    
    def isVisible(model: Model, dbId: Double): Boolean = js.native
    
    def rollOverFloor(): Unit = js.native
    def rollOverFloor(index: Double): Unit = js.native
    
    def selectFloor(index: Double, useTransition: Boolean): Unit = js.native
  }
  
  @js.native
  trait LevelsExtension
    extends StObject
       with Extension {
    
    var aecModelData: Any = js.native
    
    var floorSelector: FloorSelector = js.native
    
    def getCurrentLevel(): js.Object = js.native
    
    def getZRange(index: Double): ZMax = js.native
  }
}
