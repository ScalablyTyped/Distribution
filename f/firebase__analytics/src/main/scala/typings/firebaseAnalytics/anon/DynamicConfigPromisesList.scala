package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import typings.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicConfigPromisesList extends js.Object {
  
  var dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]] = js.native
  
  var initializationPromisesMap: StringDictionary[js.Promise[String]] = js.native
}
object DynamicConfigPromisesList {
  
  @scala.inline
  def apply(
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    initializationPromisesMap: StringDictionary[js.Promise[String]]
  ): DynamicConfigPromisesList = {
    val __obj = js.Dynamic.literal(dynamicConfigPromisesList = dynamicConfigPromisesList.asInstanceOf[js.Any], initializationPromisesMap = initializationPromisesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicConfigPromisesList]
  }
  
  @scala.inline
  implicit class DynamicConfigPromisesListOps[Self <: DynamicConfigPromisesList] (val x: Self) extends AnyVal {
    
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
    def setDynamicConfigPromisesListVarargs(value: (js.Promise[DynamicConfig | MinimalDynamicConfig])*): Self = this.set("dynamicConfigPromisesList", js.Array(value :_*))
    
    @scala.inline
    def setDynamicConfigPromisesList(value: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]]): Self = this.set("dynamicConfigPromisesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializationPromisesMap(value: StringDictionary[js.Promise[String]]): Self = this.set("initializationPromisesMap", value.asInstanceOf[js.Any])
  }
}
