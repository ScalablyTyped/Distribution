package typings.googleapis.betaMod.computeBeta

import typings.googleapis.googleapisStrings.beta
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: beta
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "beta")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: beta): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
