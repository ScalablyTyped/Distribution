package typings.gatsbyImage.anon

import typings.gatsbyImage.gatsbyImageStrings.`scale-down`
import typings.gatsbyImage.gatsbyImageStrings.contain
import typings.gatsbyImage.gatsbyImageStrings.cover
import typings.gatsbyImage.gatsbyImageStrings.fill
import typings.gatsbyImage.gatsbyImageStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectFit extends js.Object {
  
  var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.native
  
  var objectPosition: js.UndefOr[String] = js.native
}
object ObjectFit {
  
  @scala.inline
  def apply(): ObjectFit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectFit]
  }
  
  @scala.inline
  implicit class ObjectFitOps[Self <: ObjectFit] (val x: Self) extends AnyVal {
    
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
    def setObjectFit(value: fill | contain | cover | none | `scale-down`): Self = this.set("objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectFit: Self = this.set("objectFit", js.undefined)
    
    @scala.inline
    def setObjectPosition(value: String): Self = this.set("objectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectPosition: Self = this.set("objectPosition", js.undefined)
  }
}
