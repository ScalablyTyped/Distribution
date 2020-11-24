package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initialurl extends js.Object {
  
  var id: js.UndefOr[String] = js.native
  
  var initial_url: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[StringDictionary[Distributions]] = js.native
  
  var overall_category: js.UndefOr[String] = js.native
}
object Initialurl {
  
  @scala.inline
  def apply(): Initialurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialurl]
  }
  
  @scala.inline
  implicit class InitialurlOps[Self <: Initialurl] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitial_url(value: String): Self = this.set("initial_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial_url: Self = this.set("initial_url", js.undefined)
    
    @scala.inline
    def setMetrics(value: StringDictionary[Distributions]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setOverall_category(value: String): Self = this.set("overall_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverall_category: Self = this.set("overall_category", js.undefined)
  }
}
