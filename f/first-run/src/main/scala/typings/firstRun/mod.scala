package typings.firstRun

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Check if it's the first time the process is run.
  	@example
  	```
  	// x.js
  	import firstRun = require('first-run');
  	console.log(firstRun());
  	// $ node x.js
  	// true
  	// $ node x.js
  	// false
  	```
  	*/
  @scala.inline
  def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  @scala.inline
  def apply(options: Options): Boolean = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("first-run", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Clear the state.
  	*/
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  @scala.inline
  def clear(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    		The name used to identify it. Default: `name` field in your package.json
    		*/
    val name: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
