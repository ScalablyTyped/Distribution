package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmInvocation extends StObject {
  
  var snapshot_name: Name
  
  var time: DateTime
}
object SlmInvocation {
  
  inline def apply(snapshot_name: Name, time: DateTime): SlmInvocation = {
    val __obj = js.Dynamic.literal(snapshot_name = snapshot_name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmInvocation]
  }
  
  extension [Self <: SlmInvocation](x: Self) {
    
    inline def setSnapshot_name(value: Name): Self = StObject.set(x, "snapshot_name", value.asInstanceOf[js.Any])
    
    inline def setTime(value: DateTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
