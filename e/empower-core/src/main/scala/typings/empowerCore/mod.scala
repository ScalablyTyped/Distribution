package typings.empowerCore

import org.scalablytyped.runtime.StringDictionary
import typings.empowerCore.anon.OriginalMessage
import typings.empowerCore.anon.RequiredOmitOptionsmodify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](originalAssert: T): T = ^.asInstanceOf[js.Dynamic].apply(originalAssert.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T](originalAssert: T, options: Options): T = (^.asInstanceOf[js.Dynamic].apply(originalAssert.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("empower-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns default options object for `empowerCore` function.
    */
  inline def defaultOptions(): RequiredOmitOptionsmodify = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[RequiredOmitOptionsmodify]
  
  trait Options extends StObject {
    
    /**
      * Defaults to `true`, meaning assertion methods have their this value bound to the
      * original assertion. Setting to `false` causes the this reference to be passed
      * through from the actual invocation.
      *
      * @default true
      */
    var bindReceiver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If truthy, modify `originalAssert` destructively.
      *
      * If `false`, empower-core mimics `originalAssert` as new object/function, so
      * `originalAssert` will not be changed. If `true`, `originalAssert` will be
      * manipulated directly and returned `enhancedAssert` will be the same instance of
      * `originalAssert`.
      *
      * @default false
      */
    var destructive: js.UndefOr[Boolean] = js.undefined
    
    // TODO: Add type for powerAssertContext.
    var modifyMessageBeforeAssert: js.UndefOr[js.Function1[/* params */ OriginalMessage, String]] = js.undefined
    
    // TODO: Add type for event.
    var onError: js.UndefOr[js.Function1[/* event */ Any, Any]] = js.undefined
    
    // TODO: Add type for event.
    var onSuccess: js.UndefOr[js.Function1[/* event */ Any, Any]] = js.undefined
    
    /**
      * Target patterns for power assert feature instrumentation.
      *
      * Pattern detection is done by call-signature. Any arguments enclosed in bracket
      * (for example, `[message]`) means optional parameters. Without bracket means
      * mandatory parameters.
      *
      * Instead of a string, you may alternatively specify an object with a `pattern`
      * property, and any other arbitrary data. Currently only `defaultMessage` is
      * formally recommended, but you can attach any data here and it will be passed to
      * the `onSuccess` and `onError` handlers.
      */
    var patterns: js.UndefOr[js.Array[Pattern]] = js.undefined
    
    /**
      * Methods matching these patterns will not be instrumented by the code transform,
      * but they will be wrapped at runtime and trigger events in the `onSuccess` and `onError`
      * callbacks. Note that "wrap only" events will never have a `powerAssertContext` property.
      *
      * Similar to the `options.patterns`, you may supply objects with a pattern member, and the
      * additional metadata will be passed to the assertion listeners.
      *
      * @default []
      */
    var wrapOnlyPatterns: js.UndefOr[js.Array[Pattern]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBindReceiver(value: Boolean): Self = StObject.set(x, "bindReceiver", value.asInstanceOf[js.Any])
      
      inline def setBindReceiverUndefined: Self = StObject.set(x, "bindReceiver", js.undefined)
      
      inline def setDestructive(value: Boolean): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
      
      inline def setDestructiveUndefined: Self = StObject.set(x, "destructive", js.undefined)
      
      inline def setModifyMessageBeforeAssert(value: /* params */ OriginalMessage => String): Self = StObject.set(x, "modifyMessageBeforeAssert", js.Any.fromFunction1(value))
      
      inline def setModifyMessageBeforeAssertUndefined: Self = StObject.set(x, "modifyMessageBeforeAssert", js.undefined)
      
      inline def setOnError(value: /* event */ Any => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: /* event */ Any => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setWrapOnlyPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "wrapOnlyPatterns", value.asInstanceOf[js.Any])
      
      inline def setWrapOnlyPatternsUndefined: Self = StObject.set(x, "wrapOnlyPatterns", js.undefined)
      
      inline def setWrapOnlyPatternsVarargs(value: Pattern*): Self = StObject.set(x, "wrapOnlyPatterns", js.Array(value*))
    }
  }
  
  type Pattern = String | PatternObject
  
  trait PatternObject
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var defaultMessage: js.UndefOr[String] = js.undefined
    
    var pattern: String
  }
  object PatternObject {
    
    inline def apply(pattern: String): PatternObject = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatternObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternObject] (val x: Self) extends AnyVal {
      
      inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
