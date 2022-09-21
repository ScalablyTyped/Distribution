package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datecreated extends StObject {
  
  var amount: Double
  
  var date_created: String
  
  var duration: Double
  
  var id: Double
  
  var interval: String
  
  var name: String
  
  var plan_token: String
  
  var status: String
}
object Datecreated {
  
  inline def apply(
    amount: Double,
    date_created: String,
    duration: Double,
    id: Double,
    interval: String,
    name: String,
    plan_token: String,
    status: String
  ): Datecreated = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plan_token = plan_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datecreated]
  }
  
  extension [Self <: Datecreated](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlan_token(value: String): Self = StObject.set(x, "plan_token", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
