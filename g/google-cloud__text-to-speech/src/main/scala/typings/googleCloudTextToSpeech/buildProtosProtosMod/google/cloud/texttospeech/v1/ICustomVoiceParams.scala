package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1.CustomVoiceParams.ReportedUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CustomVoiceParams. */
trait ICustomVoiceParams extends StObject {
  
  /** CustomVoiceParams model */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /** CustomVoiceParams reportedUsage */
  var reportedUsage: js.UndefOr[
    ReportedUsage | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.CustomVoiceParams.ReportedUsage * / any */ String) | Null
  ] = js.undefined
}
object ICustomVoiceParams {
  
  inline def apply(): ICustomVoiceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomVoiceParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICustomVoiceParams] (val x: Self) extends AnyVal {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReportedUsage(
      value: ReportedUsage | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.CustomVoiceParams.ReportedUsage * / any */ String)
    ): Self = StObject.set(x, "reportedUsage", value.asInstanceOf[js.Any])
    
    inline def setReportedUsageNull: Self = StObject.set(x, "reportedUsage", null)
    
    inline def setReportedUsageUndefined: Self = StObject.set(x, "reportedUsage", js.undefined)
  }
}
