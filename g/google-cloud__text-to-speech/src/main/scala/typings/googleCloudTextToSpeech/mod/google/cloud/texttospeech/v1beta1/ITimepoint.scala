package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Timepoint. */
trait ITimepoint extends StObject {
  
  /** Timepoint markName */
  var markName: js.UndefOr[String | Null] = js.undefined
  
  /** Timepoint timeSeconds */
  var timeSeconds: js.UndefOr[Double | Null] = js.undefined
}
object ITimepoint {
  
  inline def apply(): ITimepoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimepoint]
  }
  
  extension [Self <: ITimepoint](x: Self) {
    
    inline def setMarkName(value: String): Self = StObject.set(x, "markName", value.asInstanceOf[js.Any])
    
    inline def setMarkNameNull: Self = StObject.set(x, "markName", null)
    
    inline def setMarkNameUndefined: Self = StObject.set(x, "markName", js.undefined)
    
    inline def setTimeSeconds(value: Double): Self = StObject.set(x, "timeSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeSecondsNull: Self = StObject.set(x, "timeSeconds", null)
    
    inline def setTimeSecondsUndefined: Self = StObject.set(x, "timeSeconds", js.undefined)
  }
}
