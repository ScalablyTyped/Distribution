package typings.expressMongoSanitize

import typings.express.mod.Handler
import typings.expressMongoSanitize.anon.Key
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined express-mongo-sanitize.express-mongo-sanitize.Middleware & {  default :/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressMongoSanitize * / any} */
object mod {
  
  /**
    * Create middleware instance
    * @param options
    */
  inline def apply(): Handler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Handler]
  inline def apply(options: Options): Handler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @JSImport("express-mongo-sanitize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-mongo-sanitize", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressMongoSanitize */ Any = js.native
  inline def default_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressMongoSanitize */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  inline def has(target: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def has(target: js.Array[Any], allowDots: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], allowDots.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Check if the payload has keys with prohibited characters‘
    * @param target
    */
  inline def has(target: Record[String, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def has(target: Record[String, Any], allowDots: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], allowDots.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Remove any keys containing prohibited characters
    * @param target
    * @param options
    */
  inline def sanitize[T /* <: (Record[String, Any]) | js.Array[Any] */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sanitize[T /* <: (Record[String, Any]) | js.Array[Any] */](target: T, options: Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @js.native
  trait Middleware extends StObject {
    
    /**
      * Create middleware instance
      * @param options
      */
    def apply(): Handler = js.native
    def apply(options: Options): Handler = js.native
    
    def has(target: js.Array[Any]): Boolean = js.native
    def has(target: js.Array[Any], allowDots: Boolean): Boolean = js.native
    /**
      * Check if the payload has keys with prohibited characters‘
      * @param target
      */
    def has(target: Record[String, Any]): Boolean = js.native
    def has(target: Record[String, Any], allowDots: Boolean): Boolean = js.native
    
    /**
      * Remove any keys containing prohibited characters
      * @param target
      * @param options
      */
    def sanitize[T /* <: (Record[String, Any]) | js.Array[Any] */](target: T): T = js.native
    def sanitize[T /* <: (Record[String, Any]) | js.Array[Any] */](target: T, options: Options): T = js.native
  }
  
  trait Options extends StObject {
    
    var allowDots: js.UndefOr[Boolean] = js.undefined
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var onSanitize: js.UndefOr[js.Function1[/* params */ Key, Unit]] = js.undefined
    
    var replaceWith: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
      
      inline def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setOnSanitize(value: /* params */ Key => Unit): Self = StObject.set(x, "onSanitize", js.Any.fromFunction1(value))
      
      inline def setOnSanitizeUndefined: Self = StObject.set(x, "onSanitize", js.undefined)
      
      inline def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
      
      inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    }
  }
}
