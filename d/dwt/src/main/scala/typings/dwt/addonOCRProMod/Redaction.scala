package typings.dwt.addonOCRProMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redaction extends js.Object {
  
  /**
    * Specify the text to redact.
    */
  var FindText: String = js.native
  
  /**
    * Specify how redaction is done.
    */
  var FindTextAction: EnumDWTOCRFindTextAction | Double = js.native
  
  /**
    * Specify how the text is found.
    */
  var FindTextFlags: EnumDWTOCRFindTextFlags | Double = js.native
}
object Redaction {
  
  @scala.inline
  def apply(
    FindText: String,
    FindTextAction: EnumDWTOCRFindTextAction | Double,
    FindTextFlags: EnumDWTOCRFindTextFlags | Double
  ): Redaction = {
    val __obj = js.Dynamic.literal(FindText = FindText.asInstanceOf[js.Any], FindTextAction = FindTextAction.asInstanceOf[js.Any], FindTextFlags = FindTextFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redaction]
  }
  
  @scala.inline
  implicit class RedactionOps[Self <: Redaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFindText(value: String): Self = this.set("FindText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindTextAction(value: EnumDWTOCRFindTextAction | Double): Self = this.set("FindTextAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindTextFlags(value: EnumDWTOCRFindTextFlags | Double): Self = this.set("FindTextFlags", value.asInstanceOf[js.Any])
  }
}
