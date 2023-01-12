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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error[?], T] (val x: Self & Error[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyGetOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyLoadOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: valueundefinederrorErrorm] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error | Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
