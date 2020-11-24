package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A terms and conditions page to be accepted during provisioning.
  */
@js.native
trait SchemaTermsAndConditions extends js.Object {
  
  /**
    * A well-formatted HTML string. It will be parsed on the client with
    * android.text.Html#fromHtml.
    */
  var content: js.UndefOr[SchemaUserFacingMessage] = js.native
  
  /**
    * A short header which appears above the HTML content.
    */
  var header: js.UndefOr[SchemaUserFacingMessage] = js.native
}
object SchemaTermsAndConditions {
  
  @scala.inline
  def apply(): SchemaTermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTermsAndConditions]
  }
  
  @scala.inline
  implicit class SchemaTermsAndConditionsOps[Self <: SchemaTermsAndConditions] (val x: Self) extends AnyVal {
    
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
    def setContent(value: SchemaUserFacingMessage): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setHeader(value: SchemaUserFacingMessage): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
