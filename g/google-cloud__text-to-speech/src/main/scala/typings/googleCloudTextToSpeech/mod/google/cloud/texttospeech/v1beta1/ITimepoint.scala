package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Timepoint. */
@js.native
trait ITimepoint extends StObject {
  
  /** Timepoint markName */
  var markName: js.UndefOr[String | Null] = js.native
  
  /** Timepoint timeSeconds */
  var timeSeconds: js.UndefOr[Double | Null] = js.native
}
object ITimepoint {
  
  @scala.inline
  def apply(): ITimepoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimepoint]
  }
  
  @scala.inline
  implicit class ITimepointMutableBuilder[Self <: ITimepoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkName(value: String): Self = StObject.set(x, "markName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkNameNull: Self = StObject.set(x, "markName", null)
    
    @scala.inline
    def setMarkNameUndefined: Self = StObject.set(x, "markName", js.undefined)
    
    @scala.inline
    def setTimeSeconds(value: Double): Self = StObject.set(x, "timeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSecondsNull: Self = StObject.set(x, "timeSeconds", null)
    
    @scala.inline
    def setTimeSecondsUndefined: Self = StObject.set(x, "timeSeconds", js.undefined)
  }
}
