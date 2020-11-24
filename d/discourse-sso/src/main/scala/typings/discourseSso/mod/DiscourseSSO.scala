package typings.discourseSso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscourseSSO extends js.Object {
  
  def buildLoginString(params: UserParams): String = js.native
  
  def getNonce(payload: String): String = js.native
  
  def validate(payload: String, sig: String): Boolean = js.native
}
object DiscourseSSO {
  
  @scala.inline
  def apply(
    buildLoginString: UserParams => String,
    getNonce: String => String,
    validate: (String, String) => Boolean
  ): DiscourseSSO = {
    val __obj = js.Dynamic.literal(buildLoginString = js.Any.fromFunction1(buildLoginString), getNonce = js.Any.fromFunction1(getNonce), validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[DiscourseSSO]
  }
  
  @scala.inline
  implicit class DiscourseSSOOps[Self <: DiscourseSSO] (val x: Self) extends AnyVal {
    
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
    def setBuildLoginString(value: UserParams => String): Self = this.set("buildLoginString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNonce(value: String => String): Self = this.set("getNonce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: (String, String) => Boolean): Self = this.set("validate", js.Any.fromFunction2(value))
  }
}
