package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertCSSOptions extends StObject {
  
  /**
    * Can be either 'user' or 'author'; Specifying 'user' enables you to prevent
    * websites from overriding the CSS you insert. Default is 'author'.
    */
  var cssOrigin: js.UndefOr[String] = js.native
}
object InsertCSSOptions {
  
  @scala.inline
  def apply(): InsertCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertCSSOptions]
  }
  
  @scala.inline
  implicit class InsertCSSOptionsMutableBuilder[Self <: InsertCSSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssOrigin(value: String): Self = StObject.set(x, "cssOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssOriginUndefined: Self = StObject.set(x, "cssOrigin", js.undefined)
  }
}
