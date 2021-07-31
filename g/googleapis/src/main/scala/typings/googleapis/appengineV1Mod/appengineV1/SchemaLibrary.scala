package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Third-party Python runtime library that is required by the application.
  */
trait SchemaLibrary extends StObject {
  
  /**
    * Name of the library. Example: &quot;django&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the library to select, or &quot;latest&quot;.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaLibrary {
  
  @scala.inline
  def apply(): SchemaLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLibrary]
  }
  
  @scala.inline
  implicit class SchemaLibraryMutableBuilder[Self <: SchemaLibrary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
