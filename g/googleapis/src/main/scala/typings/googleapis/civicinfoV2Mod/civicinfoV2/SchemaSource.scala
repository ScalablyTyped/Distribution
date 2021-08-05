package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the data source for the element containing it.
  */
trait SchemaSource extends StObject {
  
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this data comes from an official government source.
    */
  var official: js.UndefOr[Boolean] = js.undefined
}
object SchemaSource {
  
  inline def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  extension [Self <: SchemaSource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOfficial(value: Boolean): Self = StObject.set(x, "official", value.asInstanceOf[js.Any])
    
    inline def setOfficialUndefined: Self = StObject.set(x, "official", js.undefined)
  }
}
