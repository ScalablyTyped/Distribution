package typings.empower

import typings.empower.anon.RequiredOptions
import typings.empowerCore.mod.Pattern
import typings.powerAssertFormatter.mod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Enhances Power Assert feature to assert function/object.
    *
    * @param originalAssert An instance of standard `assert` function or any assert-like object to enhance.
    * @param formatter A formatter function created by power-assert-formatter.
    * @param options Configuration options. If not passed, default options will be used.
    * @return Enhanced assert function/object.
    */
  inline def apply[T](originalAssert: T, formatter: Formatter): T = (^.asInstanceOf[js.Dynamic].apply(originalAssert.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T](originalAssert: T, formatter: Formatter, options: Options): T = (^.asInstanceOf[js.Dynamic].apply(originalAssert.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("empower", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns default options object for `empower` function.
    */
  inline def defaultOptions(): RequiredOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[RequiredOptions]
  
  // The omitted options can be provided, but they will be always overridden.
  /* Inlined std.Omit<empower-core.empower-core.Options, 'modifyMessageBeforeAssert' | 'onError'> & {  modifyMessageOnRethrow :boolean | undefined,   saveContextOnRethrow :boolean | undefined} */
  trait Options extends StObject {
    
    var bindReceiver: js.UndefOr[Boolean] = js.undefined
    
    var destructive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If truthy, modify message property of `AssertionError` on rethrow.
      *
      * @default false
      */
    var modifyMessageOnRethrow: js.UndefOr[Boolean] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function1[/* event */ Any, Any]] = js.undefined
    
    var patterns: js.UndefOr[js.Array[Pattern]] = js.undefined
    
    /**
      * If truthy, add `powerAssertContext` property to `AssertionError` on rethrow.
      *
      * @default false
      */
    var saveContextOnRethrow: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setModifyMessageOnRethrow(value: Boolean): Self = StObject.set(x, "modifyMessageOnRethrow", value.asInstanceOf[js.Any])
      
      inline def setModifyMessageOnRethrowUndefined: Self = StObject.set(x, "modifyMessageOnRethrow", js.undefined)
      
      inline def setOnSuccess(value: /* event */ Any => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setSaveContextOnRethrow(value: Boolean): Self = StObject.set(x, "saveContextOnRethrow", value.asInstanceOf[js.Any])
      
      inline def setSaveContextOnRethrowUndefined: Self = StObject.set(x, "saveContextOnRethrow", js.undefined)
      
      inline def setWrapOnlyPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "wrapOnlyPatterns", value.asInstanceOf[js.Any])
      
      inline def setWrapOnlyPatternsUndefined: Self = StObject.set(x, "wrapOnlyPatterns", js.undefined)
      
      inline def setWrapOnlyPatternsVarargs(value: Pattern*): Self = StObject.set(x, "wrapOnlyPatterns", js.Array(value*))
    }
  }
}
