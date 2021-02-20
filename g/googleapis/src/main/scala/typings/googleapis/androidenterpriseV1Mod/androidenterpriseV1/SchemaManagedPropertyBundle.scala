package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bundle of managed properties.
  */
@js.native
trait SchemaManagedPropertyBundle extends StObject {
  
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
  implicit class SchemaManagedPropertyBundleMutableBuilder[Self <: SchemaManagedPropertyBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedProperty(value: js.Array[SchemaManagedProperty]): Self = StObject.set(x, "managedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertyUndefined: Self = StObject.set(x, "managedProperty", js.undefined)
    
    @scala.inline
    def setManagedPropertyVarargs(value: SchemaManagedProperty*): Self = StObject.set(x, "managedProperty", js.Array(value :_*))
  }
}
