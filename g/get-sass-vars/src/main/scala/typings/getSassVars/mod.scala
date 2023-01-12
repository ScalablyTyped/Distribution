package typings.getSassVars

import typings.getSassVars.getSassVarsStrings.async
import typings.getSassVars.getSassVarsStrings.sync
import typings.sass.typesOptionsMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Resolves the variables from the specified `sass`-code.
    *
    * @param data
    * The source-code to process.
    *
    * @param options
    * The options for resolving the variables.
    */
  inline def apply(data: String): js.Promise[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Record[String, Any]]]
  inline def apply(data: String, options: SassVarsOptions): js.Promise[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, Any]]]
  
  @JSImport("get-sass-vars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides options for the `get-sass-vars`-module.
    */
  trait SassVarsOptions extends StObject {
    
    /**
      * A value indicating whether first-level object-keys in the resulting object should be camelized.
      *
      * If enabled, the leading `$` will be removed and variable-names will be camelized (e.g. $foo-bar will become fooBar).
      */
    var camelize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The options to pass to `sass`.
      */
    var sassOptions: js.UndefOr[Options[sync | async]] = js.undefined
  }
  object SassVarsOptions {
    
    inline def apply(): SassVarsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SassVarsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SassVarsOptions] (val x: Self) extends AnyVal {
      
      inline def setCamelize(value: Boolean): Self = StObject.set(x, "camelize", value.asInstanceOf[js.Any])
      
      inline def setCamelizeUndefined: Self = StObject.set(x, "camelize", js.undefined)
      
      inline def setSassOptions(value: Options[sync | async]): Self = StObject.set(x, "sassOptions", value.asInstanceOf[js.Any])
      
      inline def setSassOptionsUndefined: Self = StObject.set(x, "sassOptions", js.undefined)
    }
  }
}
