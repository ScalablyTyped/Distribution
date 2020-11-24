package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Appsactivity.Collection.ActivitiesCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appsactivity_ extends js.Object {
  
  var Activities: js.UndefOr[ActivitiesCollection] = js.native
}
object Appsactivity_ {
  
  @scala.inline
  def apply(): Appsactivity_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appsactivity_]
  }
  
  @scala.inline
  implicit class Appsactivity_Ops[Self <: Appsactivity_] (val x: Self) extends AnyVal {
    
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
    def setActivities(value: ActivitiesCollection): Self = this.set("Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("Activities", js.undefined)
  }
}
