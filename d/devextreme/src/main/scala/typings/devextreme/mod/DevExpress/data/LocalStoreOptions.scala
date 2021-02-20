package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalStoreOptions extends ArrayStoreOptions[LocalStore] {
  
  /**
    * [descr:LocalStore.Options.flushInterval]
    */
  var flushInterval: js.UndefOr[Double] = js.native
  
  /**
    * [descr:LocalStore.Options.immediate]
    */
  var immediate: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:LocalStore.Options.name]
    */
  var name: js.UndefOr[String] = js.native
}
object LocalStoreOptions {
  
  @scala.inline
  def apply(): LocalStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalStoreOptions]
  }
  
  @scala.inline
  implicit class LocalStoreOptionsMutableBuilder[Self <: LocalStoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
    
    @scala.inline
    def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
