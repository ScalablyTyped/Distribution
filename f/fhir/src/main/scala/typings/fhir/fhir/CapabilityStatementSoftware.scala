package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Software that is covered by this capability statement
  */
@js.native
trait CapabilityStatementSoftware extends BackboneElement {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'releaseDate'.
    */
  var _releaseDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * A name the software is known by
    */
  var name: String = js.native
  
  /**
    * Date this version released
    */
  var releaseDate: js.UndefOr[dateTime] = js.native
  
  /**
    * Version covered by this statement
    */
  var version: js.UndefOr[String] = js.native
}
object CapabilityStatementSoftware {
  
  @scala.inline
  def apply(name: String): CapabilityStatementSoftware = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementSoftware]
  }
  
  @scala.inline
  implicit class CapabilityStatementSoftwareMutableBuilder[Self <: CapabilityStatementSoftware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: dateTime): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_releaseDate(value: Element): Self = StObject.set(x, "_releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_releaseDateUndefined: Self = StObject.set(x, "_releaseDate", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
