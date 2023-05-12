package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvcEncoderConfig extends StObject {
  
  var format: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AvcBitstreamFormat */ Any
  ] = js.undefined
}
object AvcEncoderConfig {
  
  inline def apply(): AvcEncoderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvcEncoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvcEncoderConfig] (val x: Self) extends AnyVal {
    
    inline def setFormat(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AvcBitstreamFormat */ Any
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
