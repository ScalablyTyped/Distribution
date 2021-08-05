package typings.googleCloudFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clientemail extends StObject {
    
    var client_email: js.UndefOr[String] = js.undefined
    
    var private_key: js.UndefOr[String] = js.undefined
  }
  object Clientemail {
    
    inline def apply(): Clientemail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientemail]
    }
    
    extension [Self <: Clientemail](x: Self) {
      
      inline def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      inline def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
    }
  }
  
  trait InitialOpsPerSecond extends StObject {
    
    var initialOpsPerSecond: js.UndefOr[Double] = js.undefined
    
    var maxOpsPerSecond: js.UndefOr[Double] = js.undefined
  }
  object InitialOpsPerSecond {
    
    inline def apply(): InitialOpsPerSecond = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialOpsPerSecond]
    }
    
    extension [Self <: InitialOpsPerSecond](x: Self) {
      
      inline def setInitialOpsPerSecond(value: Double): Self = StObject.set(x, "initialOpsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setInitialOpsPerSecondUndefined: Self = StObject.set(x, "initialOpsPerSecond", js.undefined)
      
      inline def setMaxOpsPerSecond(value: Double): Self = StObject.set(x, "maxOpsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setMaxOpsPerSecondUndefined: Self = StObject.set(x, "maxOpsPerSecond", js.undefined)
    }
  }
  
  trait MaxAttempts extends StObject {
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
  }
  object MaxAttempts {
    
    inline def apply(): MaxAttempts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAttempts]
    }
    
    extension [Self <: MaxAttempts](x: Self) {
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    }
  }
}
