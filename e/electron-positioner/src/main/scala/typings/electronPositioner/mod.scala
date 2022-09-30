package typings.electronPositioner

import typings.electron.Electron.CrossProcessExports.Rectangle
import typings.electron.mod.BrowserWindow
import typings.electronPositioner.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-positioner", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ElectronPositioner {
    def this(browserWindow: BrowserWindow) = this()
  }
  
  @js.native
  trait ElectronPositioner extends StObject {
    
    def calculate(position: Position): X = js.native
    def calculate(position: Position, trayBounds: Rectangle): X = js.native
    def calculate(position: TrayPosition, trayBounds: Rectangle): X = js.native
    
    def move(position: Position): Unit = js.native
    def move(position: Position, trayBounds: Rectangle): Unit = js.native
    def move(position: TrayPosition, trayBounds: Rectangle): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronPositioner.electronPositionerStrings.topLeft
    - typings.electronPositioner.electronPositionerStrings.topRight
    - typings.electronPositioner.electronPositionerStrings.bottomLeft
    - typings.electronPositioner.electronPositionerStrings.bottomRight
    - typings.electronPositioner.electronPositionerStrings.topCenter
    - typings.electronPositioner.electronPositionerStrings.bottomCenter
    - typings.electronPositioner.electronPositionerStrings.leftCenter
    - typings.electronPositioner.electronPositionerStrings.rightCenter
    - typings.electronPositioner.electronPositionerStrings.center
  */
  trait Position extends StObject
  object Position {
    
    inline def bottomCenter: typings.electronPositioner.electronPositionerStrings.bottomCenter = "bottomCenter".asInstanceOf[typings.electronPositioner.electronPositionerStrings.bottomCenter]
    
    inline def bottomLeft: typings.electronPositioner.electronPositionerStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.electronPositioner.electronPositionerStrings.bottomLeft]
    
    inline def bottomRight: typings.electronPositioner.electronPositionerStrings.bottomRight = "bottomRight".asInstanceOf[typings.electronPositioner.electronPositionerStrings.bottomRight]
    
    inline def center: typings.electronPositioner.electronPositionerStrings.center = "center".asInstanceOf[typings.electronPositioner.electronPositionerStrings.center]
    
    inline def leftCenter: typings.electronPositioner.electronPositionerStrings.leftCenter = "leftCenter".asInstanceOf[typings.electronPositioner.electronPositionerStrings.leftCenter]
    
    inline def rightCenter: typings.electronPositioner.electronPositionerStrings.rightCenter = "rightCenter".asInstanceOf[typings.electronPositioner.electronPositionerStrings.rightCenter]
    
    inline def topCenter: typings.electronPositioner.electronPositionerStrings.topCenter = "topCenter".asInstanceOf[typings.electronPositioner.electronPositionerStrings.topCenter]
    
    inline def topLeft: typings.electronPositioner.electronPositionerStrings.topLeft = "topLeft".asInstanceOf[typings.electronPositioner.electronPositionerStrings.topLeft]
    
    inline def topRight: typings.electronPositioner.electronPositionerStrings.topRight = "topRight".asInstanceOf[typings.electronPositioner.electronPositionerStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronPositioner.electronPositionerStrings.trayLeft
    - typings.electronPositioner.electronPositionerStrings.trayBottomLeft
    - typings.electronPositioner.electronPositionerStrings.trayRight
    - typings.electronPositioner.electronPositionerStrings.trayBottomRight
    - typings.electronPositioner.electronPositionerStrings.trayCenter
    - typings.electronPositioner.electronPositionerStrings.trayBottomCenter
  */
  trait TrayPosition extends StObject
  object TrayPosition {
    
    inline def trayBottomCenter: typings.electronPositioner.electronPositionerStrings.trayBottomCenter = "trayBottomCenter".asInstanceOf[typings.electronPositioner.electronPositionerStrings.trayBottomCenter]
    
    inline def trayBottomLeft: typings.electronPositioner.electronPositionerStrings.trayBottomLeft = "trayBottomLeft".asInstanceOf[typings.electronPositioner.electronPositionerStrings.trayBottomLeft]
    
    inline def trayBottomRight: typings.electronPositioner.electronPositionerStrings.trayBottomRight = "trayBottomRight".asInstanceOf[typings.electronPositioner.electronPositionerStrings.trayBottomRight]
    
    inline def trayCenter: typings.electronPositioner.electronPositionerStrings.trayCenter = "trayCenter".asInstanceOf[typings.electronPositioner.electronPositionerStrings.trayCenter]
    
    inline def trayLeft: typings.electronPositioner.electronPositionerStrings.trayLeft = "trayLeft".asInstanceOf[typings.electronPositioner.electronPositionerStrings.trayLeft]
    
    inline def trayRight: typings.electronPositioner.electronPositionerStrings.trayRight = "trayRight".asInstanceOf[typings.electronPositioner.electronPositionerStrings.trayRight]
  }
}
