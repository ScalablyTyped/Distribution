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
  
  @scala.inline
  def apply(Promise: PromiseConstructor, key: String): CreateClientOptionsWithPromise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptionsWithPromise]
  }
  
  @scala.inline
  implicit class CreateClientOptionsWithPromiseMutableBuilder[Self <: CreateClientOptionsWithPromise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
  }
}
