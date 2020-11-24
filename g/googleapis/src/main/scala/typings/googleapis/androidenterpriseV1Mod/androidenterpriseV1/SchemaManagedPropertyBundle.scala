package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bundle of managed properties.
  */
@js.native
trait SchemaManagedPropertyBundle extends js.Object {
  
  /**
    * The list of managed properties.
    */
  var managedProperty: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
}
object SchemaManagedPropertyBundle {
  
  @scala.inline
  def apply(): SchemaManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedPropertyBundle]
  }
  
  @scala.inline
  implicit class SchemaManagedPropertyBundleOps[Self <: SchemaManagedPropertyBundle] (val x: Self) extends AnyVal {
    
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
    def setManagedPropertyVarargs(value: SchemaManagedProperty*): Self = this.set("managedProperty", js.Array(value :_*))
    
    @scala.inline
    def setManagedProperty(value: js.Array[SchemaManagedProperty]): Self = this.set("managedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedProperty: Self = this.set("managedProperty", js.undefined)
  }
}
