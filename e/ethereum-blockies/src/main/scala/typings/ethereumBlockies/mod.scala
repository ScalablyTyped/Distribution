package typings.ethereumBlockies

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereum-blockies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[HTMLCanvasElement]
  inline def create(options: BlockieOptions): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  
  trait BlockieOptions extends StObject {
    
    /** choose a different background color, default: random */
    var bgcolor: js.UndefOr[String] = js.undefined
    
    /** to manually specify the icon color, default: random */
    var color: js.UndefOr[String] = js.undefined
    
    /** width/height of each block in pixels, default: 4 */
    var scale: js.UndefOr[Double] = js.undefined
    
    /** seed used to generate icon data, default: random */
    var seed: js.UndefOr[String] = js.undefined
    
    /** width/height of the icon in blocks, default: 8 */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * each pixel has a 13% chance of being of a third color, default: random.
      *
      * Set to -1 to disable it.
      *
      * These "spots" create structures that look like eyes, mouths and noses.
      */
    var spotcolor: js.UndefOr[Double] = js.undefined
  }
  object BlockieOptions {
    
    inline def apply(): BlockieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockieOptions]
    }
    
    extension [Self <: BlockieOptions](x: Self) {
      
      inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpotcolor(value: Double): Self = StObject.set(x, "spotcolor", value.asInstanceOf[js.Any])
      
      inline def setSpotcolorUndefined: Self = StObject.set(x, "spotcolor", js.undefined)
    }
  }
}
