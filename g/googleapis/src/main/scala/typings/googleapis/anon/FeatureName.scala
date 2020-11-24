package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureName extends js.Object {
  
  var featureName: js.UndefOr[String] = js.native
  
  var featureRate: js.UndefOr[Double] = js.native
}
object FeatureName {
  
  @scala.inline
  def apply(): FeatureName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureName]
  }
  
  @scala.inline
  implicit class FeatureNameOps[Self <: FeatureName] (val x: Self) extends AnyVal {
    
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
    def setFeatureName(value: String): Self = this.set("featureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureName: Self = this.set("featureName", js.undefined)
    
    @scala.inline
    def setFeatureRate(value: Double): Self = this.set("featureRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureRate: Self = this.set("featureRate", js.undefined)
  }
}
