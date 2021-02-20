package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a code defined by a terminology system
  */
@js.native
trait Coding extends Element {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'userSelected'.
    */
  var _userSelected: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Symbol in syntax defined by the system
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.native
  
  /**
    * Representation defined by the system
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * Identity of the terminology system
    */
  var system: js.UndefOr[uri] = js.native
  
  /**
    * If this coding was chosen directly by the user
    */
  var userSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * Version of the system - if relevant
    */
  var version: js.UndefOr[String] = js.native
}
object Coding {
  
  @scala.inline
  def apply(): Coding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coding]
  }
  
  @scala.inline
  implicit class CodingMutableBuilder[Self <: Coding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setUserSelected(value: Boolean): Self = StObject.set(x, "userSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSelectedUndefined: Self = StObject.set(x, "userSelected", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    @scala.inline
    def set_userSelected(value: Element): Self = StObject.set(x, "_userSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_userSelectedUndefined: Self = StObject.set(x, "_userSelected", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
