package typings.doctrine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Midstream extends StObject {
    
    var midstream: Boolean
  }
  object Midstream {
    
    inline def apply(midstream: Boolean): Midstream = {
      val __obj = js.Dynamic.literal(midstream = midstream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Midstream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Midstream] (val x: Self) extends AnyVal {
      
      inline def setMidstream(value: Boolean): Self = StObject.set(x, "midstream", value.asInstanceOf[js.Any])
    }
  }
}
