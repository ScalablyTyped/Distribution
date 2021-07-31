package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcurrentOptions extends StObject {
  
  /**
    * Allow multiple chunks to be uploaded simultaneously per file
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ConcurrentOptions {
  
  @scala.inline
  def apply(): ConcurrentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrentOptions]
  }
  
  @scala.inline
  implicit class ConcurrentOptionsMutableBuilder[Self <: ConcurrentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
