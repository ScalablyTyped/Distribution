package typings.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatsbyImageFixedProps
  extends GatsbyImageOptionalProps
     with GatsbyImageProps {
  
  var fixed: FixedObject | js.Array[FixedObject] = js.native
}
object GatsbyImageFixedProps {
  
  @scala.inline
  def apply(fixed: FixedObject | js.Array[FixedObject]): GatsbyImageFixedProps = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyImageFixedProps]
  }
  
  @scala.inline
  implicit class GatsbyImageFixedPropsOps[Self <: GatsbyImageFixedProps] (val x: Self) extends AnyVal {
    
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
    def setFixedVarargs(value: FixedObject*): Self = this.set("fixed", js.Array(value :_*))
    
    @scala.inline
    def setFixed(value: FixedObject | js.Array[FixedObject]): Self = this.set("fixed", value.asInstanceOf[js.Any])
  }
}
