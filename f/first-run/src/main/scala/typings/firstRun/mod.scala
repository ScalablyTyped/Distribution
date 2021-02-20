package typings.firstRun

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("first-run", JSImport.Namespace)
  @js.native
  def apply(): Boolean = js.native
  @JSImport("first-run", JSImport.Namespace)
  @js.native
  def apply(options: Options): Boolean = js.native
  
  /**
  	Clear the state.
  	*/
  @JSImport("first-run", "clear")
  @js.native
  def clear(): Unit = js.native
  @JSImport("first-run", "clear")
  @js.native
  def clear(options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		The name used to identify it. Default: `name` field in your package.json
    		*/
    val name: js.UndefOr[String] = js.native
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
