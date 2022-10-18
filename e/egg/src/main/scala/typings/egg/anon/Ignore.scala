package typings.egg.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ignore extends StObject {
  
  var ignore: Set[String]
}
object Ignore {
  
  inline def apply(ignore: Set[String]): Ignore = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ignore]
  }
  
  extension [Self <: Ignore](x: Self) {
    
    inline def setIgnore(value: Set[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
  }
}
