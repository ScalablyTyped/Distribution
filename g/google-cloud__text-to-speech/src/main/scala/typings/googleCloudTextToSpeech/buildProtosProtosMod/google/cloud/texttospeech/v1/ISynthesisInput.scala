package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesisInput. */
trait ISynthesisInput extends StObject {
  
  /** SynthesisInput ssml */
  var ssml: js.UndefOr[String | Null] = js.undefined
  
  /** SynthesisInput text */
  var text: js.UndefOr[String | Null] = js.undefined
}
object ISynthesisInput {
  
  inline def apply(): ISynthesisInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesisInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISynthesisInput] (val x: Self) extends AnyVal {
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlNull: Self = StObject.set(x, "ssml", null)
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
