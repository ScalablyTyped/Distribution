package typings.ecmarkup.anon

import typings.ecmarkup.libAutolinkerMod.AutoLinkMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autolinkmap extends StObject {
  
  var autolinkmap: AutoLinkMap
  
  var replacer: js.RegExp
}
object Autolinkmap {
  
  inline def apply(autolinkmap: AutoLinkMap, replacer: js.RegExp): Autolinkmap = {
    val __obj = js.Dynamic.literal(autolinkmap = autolinkmap.asInstanceOf[js.Any], replacer = replacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autolinkmap]
  }
  
  extension [Self <: Autolinkmap](x: Self) {
    
    inline def setAutolinkmap(value: AutoLinkMap): Self = StObject.set(x, "autolinkmap", value.asInstanceOf[js.Any])
    
    inline def setReplacer(value: js.RegExp): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
  }
}
