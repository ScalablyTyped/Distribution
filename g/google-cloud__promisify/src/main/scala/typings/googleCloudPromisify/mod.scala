package typings.googleCloudPromisify

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/promisify", "callbackify")
  @js.native
  def callbackify(originalMethod: CallbackMethod): CallbackMethod = js.native
  
  @JSImport("@google-cloud/promisify", "callbackifyAll")
  @js.native
  def callbackifyAll(Class: js.Function): Unit = js.native
  @JSImport("@google-cloud/promisify", "callbackifyAll")
  @js.native
  def callbackifyAll(Class: js.Function, options: CallbackifyAllOptions): Unit = js.native
  
  @JSImport("@google-cloud/promisify", "promisify")
  @js.native
  def promisify(originalMethod: PromiseMethod): js.Any = js.native
  @JSImport("@google-cloud/promisify", "promisify")
  @js.native
  def promisify(originalMethod: PromiseMethod, options: PromisifyOptions): js.Any = js.native
  
  @JSImport("@google-cloud/promisify", "promisifyAll")
  @js.native
  def promisifyAll(Class: js.Function): Unit = js.native
  @JSImport("@google-cloud/promisify", "promisifyAll")
  @js.native
  def promisifyAll(Class: js.Function, options: PromisifyAllOptions): Unit = js.native
  
  @js.native
  trait CallbackMethod
    extends js.Function {
    
    var callbackified_ : js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait CallbackifyAllOptions extends StObject {
    
    /**
      * Array of methods to ignore when callbackifying.
      */
    var exclude: js.UndefOr[js.Array[String]] = js.native
  }
  object CallbackifyAllOptions {
    
    @scala.inline
    def apply(): CallbackifyAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackifyAllOptions]
    }
    
    @scala.inline
    implicit class CallbackifyAllOptionsMutableBuilder[Self <: CallbackifyAllOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PromiseMethod
    extends js.Function {
    
    var promisified_ : js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait PromisifyAllOptions extends PromisifyOptions {
    
    /**
      * Array of methods to ignore when promisifying.
      */
    var exclude: js.UndefOr[js.Array[String]] = js.native
  }
  object PromisifyAllOptions {
    
    @scala.inline
    def apply(): PromisifyAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyAllOptions]
    }
    
    @scala.inline
    implicit class PromisifyAllOptionsMutableBuilder[Self <: PromisifyAllOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PromisifyOptions extends StObject {
    
    /**
      * Resolve the promise with single arg instead of an array.
      */
    var singular: js.UndefOr[Boolean] = js.native
  }
  object PromisifyOptions {
    
    @scala.inline
    def apply(): PromisifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyOptions]
    }
    
    @scala.inline
    implicit class PromisifyOptionsMutableBuilder[Self <: PromisifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSingular(value: Boolean): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
    }
  }
  
  @js.native
  trait WithPromise extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.native
  }
  object WithPromise {
    
    @scala.inline
    def apply(): WithPromise = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithPromise]
    }
    
    @scala.inline
    implicit class WithPromiseMutableBuilder[Self <: WithPromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
}
