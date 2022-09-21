package typings.fingerprintjsFingerprintjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Duration extends StObject {
    
    var duration: Double
  }
  object Duration {
    
    inline def apply(duration: Double): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error[T] extends StObject {
    
    var error: Unit
    
    var value: T
  }
  object Error {
    
    inline def apply[T](error: Unit, value: T): Error[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error[T]]
    }
    
    extension [Self <: Error[?], T](x: Self & Error[T]) {
      
      inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: Any
  }
  object Message {
    
    inline def apply(message: Any): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@fingerprintjs/fingerprintjs.@fingerprintjs/fingerprintjs.GetOptions> */
  trait ReadonlyGetOptions extends StObject {
    
    val debug: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyGetOptions {
    
    inline def apply(): ReadonlyGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyGetOptions]
    }
    
    extension [Self <: ReadonlyGetOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@fingerprintjs/fingerprintjs.@fingerprintjs/fingerprintjs.LoadOptions> */
  trait ReadonlyLoadOptions extends StObject {
    
    val debug: js.UndefOr[Boolean] = js.undefined
    
    val delayFallback: js.UndefOr[Double] = js.undefined
    
    val monitoring: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyLoadOptions {
    
    inline def apply(): ReadonlyLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyLoadOptions]
    }
    
    extension [Self <: ReadonlyLoadOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDelayFallback(value: Double): Self = StObject.set(x, "delayFallback", value.asInstanceOf[js.Any])
      
      inline def setDelayFallbackUndefined: Self = StObject.set(x, "delayFallback", js.undefined)
      
      inline def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    }
  }
  
  /* Inlined {  value :undefined,   error :std.Error | {  message :unknown}} & {  duration :number} */
  trait valueundefinederrorErrorm extends StObject {
    
    var duration: Double
    
    var error: js.Error | Message
    
    var value: Unit
  }
  object valueundefinederrorErrorm {
    
    inline def apply(duration: Double, error: js.Error | Message, value: Unit): valueundefinederrorErrorm = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[valueundefinederrorErrorm]
    }
    
    extension [Self <: valueundefinederrorErrorm](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error | Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
