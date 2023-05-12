package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulePredictorMod {
  
  @JSImport("geotiff/dist-module/predictor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPredictor(block: Any, predictor: Any, width: Any, height: Any, bitsPerSample: Any, planarConfiguration: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPredictor")(block.asInstanceOf[js.Any], predictor.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], bitsPerSample.asInstanceOf[js.Any], planarConfiguration.asInstanceOf[js.Any])).asInstanceOf[Any]
}
