package typings.gatsbyTransformerRemark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Absolute extends js.Object {
  
  var absolute: js.UndefOr[Boolean] = js.native
  
  var heading: js.UndefOr[Null | String] = js.native
  
  var maxDepth: js.UndefOr[Double] = js.native
  
  var pathToSlugField: js.UndefOr[String] = js.native
}
object Absolute {
  
  @scala.inline
  def apply(): Absolute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Absolute]
  }
  
  @scala.inline
  implicit class AbsoluteOps[Self <: Absolute] (val x: Self) extends AnyVal {
    
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    
    @scala.inline
    def setHeading(value: String): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setHeadingNull: Self = this.set("heading", null)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setPathToSlugField(value: String): Self = this.set("pathToSlugField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathToSlugField: Self = this.set("pathToSlugField", js.undefined)
  }
}
