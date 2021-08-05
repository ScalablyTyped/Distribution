package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The named port. For example: .
  */
trait SchemaNamedPort extends StObject {
  
  /**
    * The name for this named port. The name must be 1-63 characters long, and
    * comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The port number, which can be a value between 1 and 65535.
    */
  var port: js.UndefOr[Double] = js.undefined
}
object SchemaNamedPort {
  
  inline def apply(): SchemaNamedPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedPort]
  }
  
  extension [Self <: SchemaNamedPort](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
