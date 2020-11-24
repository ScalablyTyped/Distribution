package typings.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatsbyImageFluidProps
  extends GatsbyImageOptionalProps
     with GatsbyImageProps {
  
  var fluid: FluidObject | js.Array[FluidObject] = js.native
}
object GatsbyImageFluidProps {
  
  @scala.inline
  def apply(fluid: FluidObject | js.Array[FluidObject]): GatsbyImageFluidProps = {
    val __obj = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyImageFluidProps]
  }
  
  @scala.inline
  implicit class GatsbyImageFluidPropsOps[Self <: GatsbyImageFluidProps] (val x: Self) extends AnyVal {
    
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
    def setFluidVarargs(value: FluidObject*): Self = this.set("fluid", js.Array(value :_*))
    
    @scala.inline
    def setFluid(value: FluidObject | js.Array[FluidObject]): Self = this.set("fluid", value.asInstanceOf[js.Any])
  }
}
