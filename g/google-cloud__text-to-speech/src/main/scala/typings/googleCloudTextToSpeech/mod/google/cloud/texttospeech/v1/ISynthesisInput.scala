package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

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
  
  @scala.inline
  def apply(): ISynthesisInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesisInput]
  }
  
  @scala.inline
  implicit class ISynthesisInputMutableBuilder[Self <: ISynthesisInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlNull: Self = StObject.set(x, "ssml", null)
    
    @scala.inline
    def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
