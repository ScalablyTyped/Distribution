package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A localized string with its locale.
  */
@js.native
trait SchemaLocalizedText extends js.Object {
  
  /**
    * The BCP47 tag for a locale. (e.g. &quot;en-US&quot;, &quot;de&quot;).
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The text localized in the associated locale.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaLocalizedText {
  
  @scala.inline
  def apply(): SchemaLocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedText]
  }
  
  @scala.inline
  implicit class SchemaLocalizedTextOps[Self <: SchemaLocalizedText] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
