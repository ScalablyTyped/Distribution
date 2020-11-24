package typings.dva.mod

import typings.redux.mod.Action
import typings.redux.mod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  var effects: js.UndefOr[EffectsMapObject] = js.native
  
  var namespace: String = js.native
  
  var reducers: js.UndefOr[(ReducersMapObject[_, Action[_]]) | ReducersMapObjectWithEnhancer] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var subscriptions: js.UndefOr[SubscriptionsMapObject] = js.native
}
object Model {
  
  @scala.inline
  def apply(namespace: String): Model = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffects(value: EffectsMapObject): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setReducers(value: (ReducersMapObject[_, Action[_]]) | ReducersMapObjectWithEnhancer): Self = this.set("reducers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReducers: Self = this.set("reducers", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsMapObject): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
  }
}
