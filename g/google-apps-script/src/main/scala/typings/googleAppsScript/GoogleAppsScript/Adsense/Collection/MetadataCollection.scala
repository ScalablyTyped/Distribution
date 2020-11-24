package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata.DimensionsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata.MetricsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataCollection extends js.Object {
  
  var Dimensions: js.UndefOr[DimensionsCollection] = js.native
  
  var Metrics: js.UndefOr[MetricsCollection] = js.native
}
object MetadataCollection {
  
  @scala.inline
  def apply(): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataCollection]
  }
  
  @scala.inline
  implicit class MetadataCollectionOps[Self <: MetadataCollection] (val x: Self) extends AnyVal {
    
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
    def setDimensions(value: DimensionsCollection): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    
    @scala.inline
    def setMetrics(value: MetricsCollection): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
  }
}
