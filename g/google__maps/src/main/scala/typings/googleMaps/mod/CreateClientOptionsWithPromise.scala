package typings.googleMaps.mod

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientOptionsWithPromise
  extends StObject
     with CreateClientOptions {
  
  /** Promise constructor */
  var Promise: PromiseConstructor
}
object CreateClientOptionsWithPromise {
  
  inline def apply(Promise: PromiseConstructor, key: String): CreateClientOptionsWithPromise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptionsWithPromise]
  }
  
  extension [Self <: CreateClientOptionsWithPromise](x: Self) {
    
    inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
  }
}
